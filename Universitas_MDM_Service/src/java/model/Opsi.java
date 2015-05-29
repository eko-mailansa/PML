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
@Table(name = "opsi")
public class Opsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOpsi")
    private Integer idOpsi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "namaOpsi")
    private String namaOpsi;

    public Opsi() {
    }

    public Opsi(Integer idOpsi) {
        this.idOpsi = idOpsi;
    }

    public Opsi(Integer idOpsi, String namaOpsi) {
        this.idOpsi = idOpsi;
        this.namaOpsi = namaOpsi;
    }

    public Integer getIdOpsi() {
        return idOpsi;
    }

    public void setIdOpsi(Integer idOpsi) {
        this.idOpsi = idOpsi;
    }

    public String getNamaOpsi() {
        return namaOpsi;
    }

    public void setNamaOpsi(String namaOpsi) {
        this.namaOpsi = namaOpsi;
    }

    @Override
    public String toString() {
        return "Opsi{" + "idOpsi=" + idOpsi + ", namaOpsi=" + namaOpsi + '}';
    }

}
