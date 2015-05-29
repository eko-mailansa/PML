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
@Table(name = "ruang")
public class Ruang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRuang")
    private Integer idRuang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "namaRuang")
    private String namaRuang;
    @Basic(optional = false)
    @NotNull
    @Column(name = "jumKursi")
    private int jumKursi;

    public Ruang() {
    }

    public Ruang(Integer idRuang) {
        this.idRuang = idRuang;
    }

    public Ruang(Integer idRuang, String namaRuang, int jumKursi) {
        this.idRuang = idRuang;
        this.namaRuang = namaRuang;
        this.jumKursi = jumKursi;
    }

    public Integer getIdRuang() {
        return idRuang;
    }

    public void setIdRuang(Integer idRuang) {
        this.idRuang = idRuang;
    }

    public String getNamaRuang() {
        return namaRuang;
    }

    public void setNamaRuang(String namaRuang) {
        this.namaRuang = namaRuang;
    }

    public int getJumKursi() {
        return jumKursi;
    }

    public void setJumKursi(int jumKursi) {
        this.jumKursi = jumKursi;
    }

    @Override
    public String toString() {
        return "Ruang{" + "idRuang=" + idRuang + ", namaRuang=" + namaRuang + ", jumKursi=" + jumKursi + '}';
    }

}
