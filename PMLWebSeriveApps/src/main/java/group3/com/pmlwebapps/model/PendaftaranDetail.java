/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebapps.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "pendaftaran_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PendaftaranDetail.findAll", query = "SELECT p FROM PendaftaranDetail p"),
    @NamedQuery(name = "PendaftaranDetail.findByIdDaftarDetail", query = "SELECT p FROM PendaftaranDetail p WHERE p.idDaftarDetail = :idDaftarDetail"),
    @NamedQuery(name = "PendaftaranDetail.findByKeterangan", query = "SELECT p FROM PendaftaranDetail p WHERE p.keterangan = :keterangan"),
    @NamedQuery(name = "PendaftaranDetail.findByKonfirmasiPS", query = "SELECT p FROM PendaftaranDetail p WHERE p.konfirmasiPS = :konfirmasiPS"),
    @NamedQuery(name = "PendaftaranDetail.findByStatus", query = "SELECT p FROM PendaftaranDetail p WHERE p.status = :status"),
    @NamedQuery(name = "PendaftaranDetail.findByNilai", query = "SELECT p FROM PendaftaranDetail p WHERE p.nilai = :nilai"),
    @NamedQuery(name = "PendaftaranDetail.findByNilaiPS", query = "SELECT p FROM PendaftaranDetail p WHERE p.nilaiPS = :nilaiPS")})
public class PendaftaranDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDaftarDetail")
    private Integer idDaftarDetail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "keterangan")
    private String keterangan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "konfirmasiPS")
    private boolean konfirmasiPS;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nilai")
    private float nilai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nilaiPS")
    private boolean nilaiPS;
    @JoinColumn(name = "idKelas", referencedColumnName = "idKelas")
    @ManyToOne(optional = false)
    private Kelas idKelas;
    @JoinColumn(name = "idDaftar", referencedColumnName = "idDaftar")
    @ManyToOne(optional = false)
    private Pendaftaran idDaftar;

    public PendaftaranDetail() {
    }

    public PendaftaranDetail(Integer idDaftarDetail) {
        this.idDaftarDetail = idDaftarDetail;
    }

    public PendaftaranDetail(Integer idDaftarDetail, String keterangan, boolean konfirmasiPS, boolean status, float nilai, boolean nilaiPS) {
        this.idDaftarDetail = idDaftarDetail;
        this.keterangan = keterangan;
        this.konfirmasiPS = konfirmasiPS;
        this.status = status;
        this.nilai = nilai;
        this.nilaiPS = nilaiPS;
    }

    public Integer getIdDaftarDetail() {
        return idDaftarDetail;
    }

    public void setIdDaftarDetail(Integer idDaftarDetail) {
        this.idDaftarDetail = idDaftarDetail;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public boolean getKonfirmasiPS() {
        return konfirmasiPS;
    }

    public void setKonfirmasiPS(boolean konfirmasiPS) {
        this.konfirmasiPS = konfirmasiPS;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getNilai() {
        return nilai;
    }

    public void setNilai(float nilai) {
        this.nilai = nilai;
    }

    public boolean getNilaiPS() {
        return nilaiPS;
    }

    public void setNilaiPS(boolean nilaiPS) {
        this.nilaiPS = nilaiPS;
    }

    public Kelas getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(Kelas idKelas) {
        this.idKelas = idKelas;
    }

    public Pendaftaran getIdDaftar() {
        return idDaftar;
    }

    public void setIdDaftar(Pendaftaran idDaftar) {
        this.idDaftar = idDaftar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDaftarDetail != null ? idDaftarDetail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PendaftaranDetail)) {
            return false;
        }
        PendaftaranDetail other = (PendaftaranDetail) object;
        if ((this.idDaftarDetail == null && other.idDaftarDetail != null) || (this.idDaftarDetail != null && !this.idDaftarDetail.equals(other.idDaftarDetail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebapps.model.PendaftaranDetail[ idDaftarDetail=" + idDaftarDetail + " ]";
    }
    
}
