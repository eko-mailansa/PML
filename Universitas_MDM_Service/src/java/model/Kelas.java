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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "kelas")
public class Kelas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idKelas")
    private Integer idKelas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kelas")
    private int kelas;
    @Column(name = "nip")
    private String nip;
    @Column(name = "idMK")
    private String idMK;
    @Column(name = "idSemester")
    private int idSemester;

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

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getIdMK() {
        return idMK;
    }

    public void setIdMK(String idMK) {
        this.idMK = idMK;
    }

    public int getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(int idSemester) {
        this.idSemester = idSemester;
    }

    @Override
    public String toString() {
        return "Kelas{" + "idKelas=" + idKelas + ", kelas=" + kelas + ", nip=" + nip + ", idMK=" + idMK + ", idSemester=" + idSemester + '}';
    }

}
