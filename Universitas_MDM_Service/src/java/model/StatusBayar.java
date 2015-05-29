/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "status_bayar")
public class StatusBayar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idStatusBayar")
    private Integer idStatusBayar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "statusBayar")
    private boolean statusBayar;
    @Column(name = "statusAktif")
    private boolean statusAktif;
    @Column(name = "statusDaftar")
    private boolean statusDaftar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tglBayar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglBayar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "jumBayar")
    private double jumBayar;
    @Column(name = "noReg")
    private String noReg;
    @Column(name = "idSemester")
    private int idSemester;
    @Transient
    private String statusBayarString;
    @Transient
    private String statusDaftarString;
    @Transient
    private String statusAktifString;
    @Transient
    private String jenisBayar;
    @Transient
    private int semester;
    @Transient
    private int tahun1;
    @Transient
    private int tahun2;
    @Transient
    private String tglBayarString;

    public StatusBayar() {
    }

    public StatusBayar(Integer idStatusBayar) {
        this.idStatusBayar = idStatusBayar;
    }

    public StatusBayar(Integer idStatusBayar, boolean statusBayar, Date tglBayar, double jumBayar) {
        this.idStatusBayar = idStatusBayar;
        this.statusBayar = statusBayar;
        this.tglBayar = tglBayar;
        this.jumBayar = jumBayar;
    }

    public Integer getIdStatusBayar() {
        return idStatusBayar;
    }

    public void setIdStatusBayar(Integer idStatusBayar) {
        this.idStatusBayar = idStatusBayar;
    }

    public boolean getStatusBayar() {
        return statusBayar;
    }

    public void setStatusBayar(boolean statusBayar) {
        this.statusBayar = statusBayar;
    }

    public Date getTglBayar() {
        return tglBayar;
    }

    public void setTglBayar(Date tglBayar) {
        this.tglBayar = tglBayar;
    }

    public double getJumBayar() {
        return jumBayar;
    }

    public void setJumBayar(double jumBayar) {
        this.jumBayar = jumBayar;
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

    public String getStatusBayarString() {
        return statusBayarString;
    }

    public void setStatusBayarString(String statusBayarString) {
        this.statusBayarString = statusBayarString;
    }

    public String getJenisBayar() {
        return jenisBayar;
    }

    public void setJenisBayar(String jenisBayar) {
        this.jenisBayar = jenisBayar;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getTahun1() {
        return tahun1;
    }

    public void setTahun1(int tahun1) {
        this.tahun1 = tahun1;
    }

    public int getTahun2() {
        return tahun2;
    }

    public void setTahun2(int tahun2) {
        this.tahun2 = tahun2;
    }

    public boolean isStatusAktif() {
        return statusAktif;
    }

    public void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
    }

    public boolean isStatusDaftar() {
        return statusDaftar;
    }

    public void setStatusDaftar(boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public String getStatusDaftarString() {
        return statusDaftarString;
    }

    public void setStatusDaftarString(String statusDaftarString) {
        this.statusDaftarString = statusDaftarString;
    }

    public String getStatusAktifString() {
        return statusAktifString;
    }

    public void setStatusAktifString(String statusAktifString) {
        this.statusAktifString = statusAktifString;
    }

    public String getTglBayarString() {
        return tglBayarString;
    }

    public void setTglBayarString(String tglBayarString) {
        this.tglBayarString = tglBayarString;
    }

    @PostLoad
    public void trigger() {
        if (statusBayar) {
            statusBayarString = "Lunas";
            jenisBayar = "Tunai";
        } else {
            statusBayarString = "Belum Lunas";
            jenisBayar = "Belum Bayar";
        }
        if (statusAktif) {
            statusAktifString = "Aktif";
        } else {
            statusAktifString = "Tidak Aktif";
        }
        if (statusDaftar) {
            statusDaftarString = "Daftar";
        } else {
            statusDaftarString = "Belum Daftar";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM YYYY hh:mm:ss");
        tglBayarString = sdf.format(tglBayar);
    }

    @Override
    public String toString() {
        return "StatusBayar{" + "idStatusBayar=" + idStatusBayar + ", statusBayar=" + statusBayar + ", statusAktif=" + statusAktif + ", statusDaftar=" + statusDaftar + ", tglBayar=" + tglBayar + ", jumBayar=" + jumBayar + ", noReg=" + noReg + ", idSemester=" + idSemester + ", statusBayarString=" + statusBayarString + ", statusDaftarString=" + statusDaftarString + ", statusAktifString=" + statusAktifString + ", jenisBayar=" + jenisBayar + ", semester=" + semester + ", tahun1=" + tahun1 + ", tahun2=" + tahun2 + ", tglBayarString=" + tglBayarString + '}';
    }

}
