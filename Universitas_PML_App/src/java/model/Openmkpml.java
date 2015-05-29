/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.SelectItem;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PostLoad;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import service.MataKuliah;
import service.ProgramStudi;
import service.Semester;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "openmkpml")
@NamedQueries({
    @NamedQuery(name = "Openmkpml.findAll", query = "SELECT o FROM Openmkpml o"),
    @NamedQuery(name = "Openmkpml.findByIdOpenMKPML", query = "SELECT o FROM Openmkpml o WHERE o.idOpenMKPML = :idOpenMKPML"),
    @NamedQuery(name = "Openmkpml.findByKodeMK", query = "SELECT o FROM Openmkpml o WHERE o.kodeMK = :kodeMK"),
    @NamedQuery(name = "Openmkpml.findByIdSemester", query = "SELECT o FROM Openmkpml o WHERE o.idSemester = :idSemester"),
    @NamedQuery(name = "Openmkpml.findByIdProdi", query = "SELECT o FROM Openmkpml o WHERE o.idProdi = :idProdi")})
public class Openmkpml implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOpenMKPML")
    private Integer idOpenMKPML;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "kodeMK")
    private String kodeMK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSemester")
    private int idSemester;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idProdi")
    private int idProdi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOpenMKPML")
    private List<Kelaspml> kelaspmlList;
    @Transient
    private MataKuliah mataKuliah;
    @Transient
    private Semester semester;
    @Transient
    private ProgramStudi programStudi;
    @Transient
    private int jumKelas;
    @Transient
    private int jumBangku;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isActive")
    private boolean isActive;
    @Transient
    private int myKelas;
    @Transient
    private List<SelectItem> myDaftarKelas;

    public Openmkpml() {
    }

    public Openmkpml(Integer idOpenMKPML) {
        this.idOpenMKPML = idOpenMKPML;
    }

    public Openmkpml(Integer idOpenMKPML, String kodeMK, int idSemester, int idProdi) {
        this.idOpenMKPML = idOpenMKPML;
        this.kodeMK = kodeMK;
        this.idSemester = idSemester;
        this.idProdi = idProdi;
    }

    public Integer getIdOpenMKPML() {
        return idOpenMKPML;
    }

    public void setIdOpenMKPML(Integer idOpenMKPML) {
        this.idOpenMKPML = idOpenMKPML;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public int getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(int idSemester) {
        this.idSemester = idSemester;
    }

    public int getIdProdi() {
        return idProdi;
    }

    public void setIdProdi(int idProdi) {
        this.idProdi = idProdi;
    }

    public List<Kelaspml> getKelaspmlList() {
        return kelaspmlList;
    }

    public void setKelaspmlList(List<Kelaspml> kelaspmlList) {
        this.kelaspmlList = kelaspmlList;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public int getMyKelas() {
        return myKelas;
    }

    public void setMyKelas(int myKelas) {
        this.myKelas = myKelas;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public ProgramStudi getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(ProgramStudi programStudi) {
        this.programStudi = programStudi;
    }

    public int getJumKelas() {
        return jumKelas;
    }

    public void setJumKelas(int jumKelas) {
        this.jumKelas = jumKelas;
    }

    public int getJumBangku() {
        return jumBangku;
    }

    public void setJumBangku(int jumBangku) {
        this.jumBangku = jumBangku;
    }

    @PostLoad
    private void trigger() {
        mataKuliah = findMataKuliahByidMK(kodeMK);
        semester = findSemesterByidSemester(idSemester);
        programStudi = findProgramStudiByIdProg(idProdi);
        myDaftarKelas = new ArrayList<>();
        for (Kelaspml kp : kelaspmlList) {
            SelectItem si = new SelectItem(kp.getIdKelas(), String.valueOf(kp.getKelas()));
            myDaftarKelas.add(si);
        }
    }

    public List<SelectItem> getMyDaftarKelas() {
        return myDaftarKelas;
    }

    public void setMyDaftarKelas(List<SelectItem> myDaftarKelas) {
        this.myDaftarKelas = myDaftarKelas;
    }

    @Override
    public String toString() {
        return "Openmkpml{" + "idOpenMKPML=" + idOpenMKPML + ", kodeMK=" + kodeMK + ", idSemester=" + idSemester + ", idProdi=" + idProdi + ", kelaspmlList=" + kelaspmlList + ", mataKuliah=" + mataKuliah + ", semester=" + semester + ", programStudi=" + programStudi + '}';
    }

    private static Semester findSemesterByidSemester(int param) {
        service.MDMService_Service service = new service.MDMService_Service();
        service.MDMService port = service.getMDMServicePort();
        return port.findSemesterByidSemester(param);
    }

    private static MataKuliah findMataKuliahByidMK(java.lang.String param) {
        service.MDMService_Service service = new service.MDMService_Service();
        service.MDMService port = service.getMDMServicePort();
        return port.findMataKuliahByidMK(param);
    }

    private static ProgramStudi findProgramStudiByIdProg(int param) {
        service.MDMService_Service service = new service.MDMService_Service();
        service.MDMService port = service.getMDMServicePort();
        return port.findProgramStudiByIdProg(param);
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

}
