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
import javax.validation.constraints.Size;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "jadwal")
public class Jadwal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idJadwal")
    private Integer idJadwal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hari")
    private int hari;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "jam")
    private String jam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kegiatan")
    private int kegiatan;
    @Column(name = "idKelas")
    private int idKelas;
    @Column(name = "idRuang")
    private int idRuang;

    public Jadwal() {
    }

    public Jadwal(Integer idJadwal) {
        this.idJadwal = idJadwal;
    }

    public Jadwal(Integer idJadwal, int hari, String jam, int kegiatan) {
        this.idJadwal = idJadwal;
        this.hari = hari;
        this.jam = jam;
        this.kegiatan = kegiatan;
    }

    public Integer getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(Integer idJadwal) {
        this.idJadwal = idJadwal;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public int getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(int kegiatan) {
        this.kegiatan = kegiatan;
    }

    public int getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }

    public int getIdRuang() {
        return idRuang;
    }

    public void setIdRuang(int idRuang) {
        this.idRuang = idRuang;
    }

    @Override
    public String toString() {
        return "Jadwal{" + "idJadwal=" + idJadwal + ", hari=" + hari + ", jam=" + jam + ", kegiatan=" + kegiatan + ", idKelas=" + idKelas + ", idRuang=" + idRuang + '}';
    }

}
