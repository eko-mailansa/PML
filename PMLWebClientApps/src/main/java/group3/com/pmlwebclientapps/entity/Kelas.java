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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "kelas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kelas.findAll", query = "SELECT k FROM Kelas k"),
    @NamedQuery(name = "Kelas.findByIdKelas", query = "SELECT k FROM Kelas k WHERE k.idKelas = :idKelas"),
    @NamedQuery(name = "Kelas.findByKelas", query = "SELECT k FROM Kelas k WHERE k.kelas = :kelas")})
public class Kelas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idKelas")
    private Integer idKelas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kelas")
    private int kelas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKelas")
    private List<Jadwal> jadwalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKelas")
    private List<PendaftaranDetail> pendaftaranDetailList;
    @JoinColumn(name = "nip", referencedColumnName = "nip")
    @ManyToOne(optional = false)
    private Dosen nip;
    @JoinColumn(name = "idMK", referencedColumnName = "idMK")
    @ManyToOne(optional = false)
    private MataKuliah idMK;
    @JoinColumn(name = "idSemester", referencedColumnName = "idSemester")
    @ManyToOne(optional = false)
    private Semester idSemester;

    public Kelas() {
    }

    public Kelas(Integer idKelas) {
        this.idKelas = idKelas;
    }

    public Kelas(Integer idKelas, int kelas) {
        this.idKelas = idKelas;
        this.kelas = kelas;
    }

    public Integer getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(Integer idKelas) {
        this.idKelas = idKelas;
    }

    public int getKelas() {
        return kelas;
    }

    public void setKelas(int kelas) {
        this.kelas = kelas;
    }

    @XmlTransient
    public List<Jadwal> getJadwalList() {
        return jadwalList;
    }

    public void setJadwalList(List<Jadwal> jadwalList) {
        this.jadwalList = jadwalList;
    }

    @XmlTransient
    public List<PendaftaranDetail> getPendaftaranDetailList() {
        return pendaftaranDetailList;
    }

    public void setPendaftaranDetailList(List<PendaftaranDetail> pendaftaranDetailList) {
        this.pendaftaranDetailList = pendaftaranDetailList;
    }

    public Dosen getNip() {
        return nip;
    }

    public void setNip(Dosen nip) {
        this.nip = nip;
    }

    public MataKuliah getIdMK() {
        return idMK;
    }

    public void setIdMK(MataKuliah idMK) {
        this.idMK = idMK;
    }

    public Semester getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(Semester idSemester) {
        this.idSemester = idSemester;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKelas != null ? idKelas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kelas)) {
            return false;
        }
        Kelas other = (Kelas) object;
        if ((this.idKelas == null && other.idKelas != null) || (this.idKelas != null && !this.idKelas.equals(other.idKelas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebclientapps.entity.Kelas[ idKelas=" + idKelas + " ]";
    }
    
}
