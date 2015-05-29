/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PostLoad;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "pendaftaran_detail")
public class PendaftaranDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDaftarDetail")
    private Integer idDaftarDetail;
    @Column(name = "konfirmasiPS")
    private boolean konfirmasiPS;
    @Column(name = "statusMK")
    private int statusMK;
    @Column(name = "nilai")
    private float nilai;
    @Size(min = 1, max = 2)
    @Column(name = "nilaiPS")
    private String nilaiPS;
    @JoinColumn(name = "idKelas", referencedColumnName = "idKelas")
    @ManyToOne(optional = false)
    private Kelaspml idKelas;
    @JoinColumn(name = "idDaftar", referencedColumnName = "idDaftar")
    @ManyToOne(optional = false)
    private Pendaftaran idDaftar;
    @Transient
    private String statusMKString;

    public PendaftaranDetail() {
    }

    public PendaftaranDetail(Integer idDaftarDetail) {
        this.idDaftarDetail = idDaftarDetail;
    }

    public Integer getIdDaftarDetail() {
        return idDaftarDetail;
    }

    public void setIdDaftarDetail(Integer idDaftarDetail) {
        this.idDaftarDetail = idDaftarDetail;
    }

    public boolean getKonfirmasiPS() {
        return konfirmasiPS;
    }

    public void setKonfirmasiPS(boolean konfirmasiPS) {
        this.konfirmasiPS = konfirmasiPS;
    }

    public int getStatusMK() {
        return statusMK;
    }

    public void setStatusMK(int statusMK) {
        this.statusMK = statusMK;
    }

    public float getNilai() {
        return nilai;
    }

    public void setNilai(float nilai) {
        this.nilai = nilai;
    }

    public String getNilaiPS() {
        return nilaiPS;
    }

    public void setNilaiPS(String nilaiPS) {
        this.nilaiPS = nilaiPS;
    }

    public Kelaspml getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(Kelaspml idKelas) {
        this.idKelas = idKelas;
    }

    public Pendaftaran getIdDaftar() {
        return idDaftar;
    }

    public void setIdDaftar(Pendaftaran idDaftar) {
        this.idDaftar = idDaftar;
    }

    public String getStatusMKString() {
        return statusMKString;
    }

    public void setStatusMKString(String statusMKString) {
        this.statusMKString = statusMKString;
    }

    @PostLoad
    private void trigger() {
        switch (statusMK) {
            case 0:
                statusMKString = "-";
                break;
            case 1:
                statusMKString = "tambah";
                break;
            case 2:
                statusMKString = "kurang";
                break;
            default:
                statusMKString = "";
        }
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
        return "model.PendaftaranDetail[ idDaftarDetail=" + idDaftarDetail + " ]";
    }

}
