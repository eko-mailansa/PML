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

/**
 *
 * @author Home
 */
@Entity
@Table(name = "dosen_wali")
public class DosenWali implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idWali")
    private Integer idWali;
    @Column(name = "nip")
    private String nip;
    @Column(name = "noreg")
    private String noreg;

    public DosenWali() {
    }

    public DosenWali(Integer idWali) {
        this.idWali = idWali;
    }

    public Integer getIdWali() {
        return idWali;
    }

    public void setIdWali(Integer idWali) {
        this.idWali = idWali;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNoreg() {
        return noreg;
    }

    public void setNoreg(String noreg) {
        this.noreg = noreg;
    }

    @Override
    public String toString() {
        return "DosenWali{" + "idWali=" + idWali + ", nip=" + nip + ", noreg=" + noreg + '}';
    }

}
