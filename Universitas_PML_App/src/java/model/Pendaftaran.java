/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PostLoad;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import service.Mahasiswa;
import service.Semester;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "pendaftaran")
@NamedQueries({
    @NamedQuery(name = "Pendaftaran.findAll", query = "SELECT p FROM Pendaftaran p"),
    @NamedQuery(name = "Pendaftaran.findByIdDaftar", query = "SELECT p FROM Pendaftaran p WHERE p.idDaftar = :idDaftar"),
    @NamedQuery(name = "Pendaftaran.findByTglDaftar", query = "SELECT p FROM Pendaftaran p WHERE p.tglDaftar = :tglDaftar"),
    @NamedQuery(name = "Pendaftaran.findByStatus", query = "SELECT p FROM Pendaftaran p WHERE p.status = :status"),
    @NamedQuery(name = "Pendaftaran.findByStatusApprove", query = "SELECT p FROM Pendaftaran p WHERE p.statusApprove = :statusApprove"),
    @NamedQuery(name = "Pendaftaran.findByTglStatusApprove", query = "SELECT p FROM Pendaftaran p WHERE p.tglStatusApprove = :tglStatusApprove"),
    @NamedQuery(name = "Pendaftaran.findByCatakKSM", query = "SELECT p FROM Pendaftaran p WHERE p.catakKSM = :catakKSM"),
    @NamedQuery(name = "Pendaftaran.findByTglCetakKSM", query = "SELECT p FROM Pendaftaran p WHERE p.tglCetakKSM = :tglCetakKSM"),
    @NamedQuery(name = "Pendaftaran.findByComment", query = "SELECT p FROM Pendaftaran p WHERE p.comment = :comment"),
    @NamedQuery(name = "Pendaftaran.findByNoReg", query = "SELECT p FROM Pendaftaran p WHERE p.noReg = :noReg"),
    @NamedQuery(name = "Pendaftaran.findByIdSemester", query = "SELECT p FROM Pendaftaran p WHERE p.idSemester = :idSemester")})
public class Pendaftaran implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDaftar")
    private Integer idDaftar;
    @Basic(optional = false)
    @Column(name = "tglDaftar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglDaftar;
    @Basic(optional = false)
    @Size(min = 1, max = 10)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "statusApprove")
    private boolean statusApprove;
    @Basic(optional = false)
    @Column(name = "tglStatusApprove")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglStatusApprove;
    @Basic(optional = false)
    @Column(name = "catakKSM")
    private boolean catakKSM;
    @Basic(optional = false)
    @Column(name = "tglCetakKSM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglCetakKSM;
    @Size(max = 500)
    @Column(name = "comment")
    private String comment;
    @Basic(optional = false)
    @Size(min = 1, max = 30)
    @Column(name = "noReg")
    private String noReg;
    @Basic(optional = false)
    @Column(name = "idSemester")
    private int idSemester;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDaftar", fetch = FetchType.EAGER)
    private List<PendaftaranDetail> pendaftaranDetailList;
    @Basic(optional = false)
    @Column(name = "NR")
    private float nr;
    @Basic(optional = false)
    @Column(name = "jumSKS")
    private int jumSKS;
    @Transient
    private Mahasiswa mahasiswa;
    @Transient
    private Semester semester;

    public Pendaftaran() {
    }

    public Pendaftaran(Integer idDaftar) {
        this.idDaftar = idDaftar;
    }

    public Pendaftaran(Integer idDaftar, Date tglDaftar, String status, boolean statusApprove, Date tglStatusApprove, boolean catakKSM, Date tglCetakKSM, String noReg, int idSemester) {
        this.idDaftar = idDaftar;
        this.tglDaftar = tglDaftar;
        this.status = status;
        this.statusApprove = statusApprove;
        this.tglStatusApprove = tglStatusApprove;
        this.catakKSM = catakKSM;
        this.tglCetakKSM = tglCetakKSM;
        this.noReg = noReg;
        this.idSemester = idSemester;
    }

    public Integer getIdDaftar() {
        return idDaftar;
    }

    public void setIdDaftar(Integer idDaftar) {
        this.idDaftar = idDaftar;
    }

    public Date getTglDaftar() {
        return tglDaftar;
    }

    public void setTglDaftar(Date tglDaftar) {
        this.tglDaftar = tglDaftar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean getStatusApprove() {
        return statusApprove;
    }

    public void setStatusApprove(boolean statusApprove) {
        this.statusApprove = statusApprove;
    }

    public Date getTglStatusApprove() {
        return tglStatusApprove;
    }

    public void setTglStatusApprove(Date tglStatusApprove) {
        this.tglStatusApprove = tglStatusApprove;
    }

    public boolean getCatakKSM() {
        return catakKSM;
    }

    public void setCatakKSM(boolean catakKSM) {
        this.catakKSM = catakKSM;
    }

    public Date getTglCetakKSM() {
        return tglCetakKSM;
    }

    public void setTglCetakKSM(Date tglCetakKSM) {
        this.tglCetakKSM = tglCetakKSM;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getNoReg() {
        return noReg;
    }

    public void setNoReg(String noReg) {
        this.noReg = noReg;
    }

    public int getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(int idSemester) {
        this.idSemester = idSemester;
    }

    public List<PendaftaranDetail> getPendaftaranDetailList() {
        return pendaftaranDetailList;
    }

    public void setPendaftaranDetailList(List<PendaftaranDetail> pendaftaranDetailList) {
        this.pendaftaranDetailList = pendaftaranDetailList;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    @PostLoad
    public void trigger() {
        semester = findSemesterByidSemester(idSemester);
    }

    @Override
    public String toString() {
        return "Pendaftaran{" + "idDaftar=" + idDaftar + ", tglDaftar=" + tglDaftar + ", status=" + status + ", statusApprove=" + statusApprove + ", tglStatusApprove=" + tglStatusApprove + ", catakKSM=" + catakKSM + ", tglCetakKSM=" + tglCetakKSM + ", comment=" + comment + ", noReg=" + noReg + ", idSemester=" + idSemester + ", pendaftaranDetailList=" + pendaftaranDetailList + ", mahasiswa=" + mahasiswa + ", semester=" + semester + '}';
    }

    private static Semester findSemesterByidSemester(int param) {
        service.MDMService_Service service = new service.MDMService_Service();
        service.MDMService port = service.getMDMServicePort();
        return port.findSemesterByidSemester(param);
    }

    public float getNr() {
        return nr;
    }

    public void setNr(float nr) {
        this.nr = nr;
    }

    public int getJumSKS() {
        return jumSKS;
    }

    public void setJumSKS(int jumSKS) {
        this.jumSKS = jumSKS;
    }

}
