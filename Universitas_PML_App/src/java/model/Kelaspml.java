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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "kelaspml")
@NamedQueries({
    @NamedQuery(name = "Kelaspml.findAll", query = "SELECT k FROM Kelaspml k"),
    @NamedQuery(name = "Kelaspml.findByIdKelas", query = "SELECT k FROM Kelaspml k WHERE k.idKelas = :idKelas"),
    @NamedQuery(name = "Kelaspml.findByKelas", query = "SELECT k FROM Kelaspml k WHERE k.kelas = :kelas"),
    @NamedQuery(name = "Kelaspml.findByMin", query = "SELECT k FROM Kelaspml k WHERE k.min = :min"),
    @NamedQuery(name = "Kelaspml.findByMax", query = "SELECT k FROM Kelaspml k WHERE k.max = :max"),
    @NamedQuery(name = "Kelaspml.findByIsActive", query = "SELECT k FROM Kelaspml k WHERE k.isActive = :isActive")})
public class Kelaspml implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "min")
    private int min;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max")
    private int max;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isActive")
    private boolean isActive;
    @JoinColumn(name = "idOpenMKPML", referencedColumnName = "idOpenMKPML")
    @ManyToOne(optional = false)
    private Openmkpml idOpenMKPML;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKelas")
    private List<PendaftaranDetail> pendaftaranDetailList;

    public Kelaspml() {
    }

    public Kelaspml(Integer idKelas) {
        this.idKelas = idKelas;
    }

    public Kelaspml(Integer idKelas, int kelas, int min, int max, boolean isActive) {
        this.idKelas = idKelas;
        this.kelas = kelas;
        this.min = min;
        this.max = max;
        this.isActive = isActive;
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

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Openmkpml getIdOpenMKPML() {
        return idOpenMKPML;
    }

    public void setIdOpenMKPML(Openmkpml idOpenMKPML) {
        this.idOpenMKPML = idOpenMKPML;
    }

    public List<PendaftaranDetail> getPendaftaranDetailList() {
        return pendaftaranDetailList;
    }

    public void setPendaftaranDetailList(List<PendaftaranDetail> pendaftaranDetailList) {
        this.pendaftaranDetailList = pendaftaranDetailList;
    }

    @Override
    public String toString() {
        return "Kelaspml{" + "idKelas=" + idKelas + ", kelas=" + kelas + ", min=" + min + ", max=" + max + ", isActive=" + isActive + ", idOpenMKPML=" + idOpenMKPML + ", pendaftaranDetailList=" + pendaftaranDetailList + '}';
    }

}
