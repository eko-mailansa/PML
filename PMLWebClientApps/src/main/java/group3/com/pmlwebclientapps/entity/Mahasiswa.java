/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebclientapps.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "mahasiswa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mahasiswa.findAll", query = "SELECT m FROM Mahasiswa m"),
    @NamedQuery(name = "Mahasiswa.findByNoReg", query = "SELECT m FROM Mahasiswa m WHERE m.noReg = :noReg"),
    @NamedQuery(name = "Mahasiswa.findByNim", query = "SELECT m FROM Mahasiswa m WHERE m.nim = :nim"),
    @NamedQuery(name = "Mahasiswa.findByNamaMahasiswa", query = "SELECT m FROM Mahasiswa m WHERE m.namaMahasiswa = :namaMahasiswa"),
    @NamedQuery(name = "Mahasiswa.findByAlamat", query = "SELECT m FROM Mahasiswa m WHERE m.alamat = :alamat"),
    @NamedQuery(name = "Mahasiswa.findByKodePos", query = "SELECT m FROM Mahasiswa m WHERE m.kodePos = :kodePos")})
public class Mahasiswa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "noReg")
    private String noReg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "nim")
    private String nim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "namaMahasiswa")
    private String namaMahasiswa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "kodePos")
    private String kodePos;
    @ManyToMany(mappedBy = "mahasiswaList")
    private List<Dosen> dosenList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noReg")
    private List<Pendaftaran> pendaftaranList;
    @JoinColumn(name = "idProg", referencedColumnName = "idProg")
    @ManyToOne(optional = false)
    private ProgramStudi idProg;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noReg")
    private List<StatusBayar> statusBayarList;

    public Mahasiswa() {
    }

    public Mahasiswa(String noReg) {
        this.noReg = noReg;
    }

    public Mahasiswa(String noReg, String nim, String namaMahasiswa, String alamat, String kodePos) {
        this.noReg = noReg;
        this.nim = nim;
        this.namaMahasiswa = namaMahasiswa;
        this.alamat = alamat;
        this.kodePos = kodePos;
    }

    public String getNoReg() {
        return noReg;
    }

    public void setNoReg(String noReg) {
        this.noReg = noReg;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    @XmlTransient
    public List<Dosen> getDosenList() {
        return dosenList;
    }

    public void setDosenList(List<Dosen> dosenList) {
        this.dosenList = dosenList;
    }

    @XmlTransient
    public List<Pendaftaran> getPendaftaranList() {
        return pendaftaranList;
    }

    public void setPendaftaranList(List<Pendaftaran> pendaftaranList) {
        this.pendaftaranList = pendaftaranList;
    }

    public ProgramStudi getIdProg() {
        return idProg;
    }

    public void setIdProg(ProgramStudi idProg) {
        this.idProg = idProg;
    }

    @XmlTransient
    public List<StatusBayar> getStatusBayarList() {
        return statusBayarList;
    }

    public void setStatusBayarList(List<StatusBayar> statusBayarList) {
        this.statusBayarList = statusBayarList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noReg != null ? noReg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mahasiswa)) {
            return false;
        }
        Mahasiswa other = (Mahasiswa) object;
        if ((this.noReg == null && other.noReg != null) || (this.noReg != null && !this.noReg.equals(other.noReg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebclientapps.entity.Mahasiswa[ noReg=" + noReg + " ]";
    }
    
}
