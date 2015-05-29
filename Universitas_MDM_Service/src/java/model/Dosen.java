/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "dosen")
public class Dosen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nip")
    private String nip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "namaDosen")
    private String namaDosen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peran")
    private int peran;

    public Dosen() {
    }

    public Dosen(String nip) {
        this.nip = nip;
    }

    public Dosen(String nip, String namaDosen, int peran) {
        this.nip = nip;
        this.namaDosen = namaDosen;
        this.peran = peran;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public int getPeran() {
        return peran;
    }

    public void setPeran(int peran) {
        this.peran = peran;
    }

    @Override
    public String toString() {
        return "Dosen{" + "nip=" + nip + ", namaDosen=" + namaDosen + ", peran=" + peran + '}';
    }

}
