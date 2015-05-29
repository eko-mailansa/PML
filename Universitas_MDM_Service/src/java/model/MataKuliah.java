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
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "mata_kuliah")
public class MataKuliah implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "idMK")
    private String idMK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "namaMK")
    private String namaMK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sks")
    private int sks;
    @Size(max = 500)
    @Column(name = "silabus")
    private String silabus;
    @Column(name = "idProg")
    private int idProg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "noUrut")
    private int noUrut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "semester")
    private int semester;
    @Size(max = 11)
    @Column(name = "prasyarat")
    private String prasyarat;
    @Size(max = 20)
    @Column(name = "opsi")
    private String opsi;
    @Transient
    private String opsiString;
    @Transient
    private int jumKelas;
    @Transient
    private int jumBangku;

    public MataKuliah() {
    }

    public MataKuliah(String idMK) {
        this.idMK = idMK;
    }

    public MataKuliah(String idMK, String namaMK, int sks) {
        this.idMK = idMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public String getIdMK() {
        return idMK;
    }

    public void setIdMK(String idMK) {
        this.idMK = idMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getSilabus() {
        return silabus;
    }

    public void setSilabus(String silabus) {
        this.silabus = silabus;
    }

    public int getIdProg() {
        return idProg;
    }

    public void setIdProg(int idProg) {
        this.idProg = idProg;
    }

    public int getNoUrut() {
        return noUrut;
    }

    public void setNoUrut(int noUrut) {
        this.noUrut = noUrut;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getPrasyarat() {
        return prasyarat;
    }

    public void setPrasyarat(String prasyarat) {
        this.prasyarat = prasyarat;
    }

    public String getOpsi() {
        return opsi;
    }

    public void setOpsi(String opsi) {
        this.opsi = opsi;
    }

    public String getOpsiString() {
        return opsiString;
    }

    public void setOpsiString(String opsiString) {
        this.opsiString = opsiString;
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

    @Override
    public String toString() {
        return "MataKuliah{" + "idMK=" + idMK + ", namaMK=" + namaMK + ", sks=" + sks + ", silabus=" + silabus + ", idProg=" + idProg + ", noUrut=" + noUrut + ", semester=" + semester + ", prasyarat=" + prasyarat + ", opsi=" + opsi + ", opsiString=" + opsiString + '}';
    }

}
