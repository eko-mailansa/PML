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
@Table(name = "fakultas")
public class Fakultas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFak")
    private Integer idFak;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "namaFak")
    private String namaFak;
    @Column(name = "keteranganFak")
    private String keteranganFak;

    public Fakultas() {
    }

    public Fakultas(Integer idFak) {
        this.idFak = idFak;
    }

    public Fakultas(Integer idFak, String namaFak) {
        this.idFak = idFak;
        this.namaFak = namaFak;
    }

    public Integer getIdFak() {
        return idFak;
    }

    public void setIdFak(Integer idFak) {
        this.idFak = idFak;
    }

    public String getNamaFak() {
        return namaFak;
    }

    public void setNamaFak(String namaFak) {
        this.namaFak = namaFak;
    }

    public String getKeteranganFak() {
        return keteranganFak;
    }

    public void setKeteranganFak(String keteranganFak) {
        this.keteranganFak = keteranganFak;
    }

    @Override
    public String toString() {
        return "Fakultas{" + "idFak=" + idFak + ", namaFak=" + namaFak + ", keteranganFak=" + keteranganFak + '}';
    }

}
