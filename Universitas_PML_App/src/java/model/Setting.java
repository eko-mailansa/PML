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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "setting")
@NamedQueries({
    @NamedQuery(name = "Setting.findAll", query = "SELECT s FROM Setting s"),
    @NamedQuery(name = "Setting.findByIdSetting", query = "SELECT s FROM Setting s WHERE s.idSetting = :idSetting"),
    @NamedQuery(name = "Setting.findByMinKelas", query = "SELECT s FROM Setting s WHERE s.minKelas = :minKelas"),
    @NamedQuery(name = "Setting.findByMaxKelas", query = "SELECT s FROM Setting s WHERE s.maxKelas = :maxKelas")})
public class Setting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSetting")
    private Integer idSetting;
    @Basic(optional = false)
    @NotNull
    @Column(name = "minKelas")
    private int minKelas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "maxKelas")
    private int maxKelas;

    public Setting() {
    }

    public Setting(Integer idSetting) {
        this.idSetting = idSetting;
    }

    public Setting(Integer idSetting, int minKelas, int maxKelas) {
        this.idSetting = idSetting;
        this.minKelas = minKelas;
        this.maxKelas = maxKelas;
    }

    public Integer getIdSetting() {
        return idSetting;
    }

    public void setIdSetting(Integer idSetting) {
        this.idSetting = idSetting;
    }

    public int getMinKelas() {
        return minKelas;
    }

    public void setMinKelas(int minKelas) {
        this.minKelas = minKelas;
    }

    public int getMaxKelas() {
        return maxKelas;
    }

    public void setMaxKelas(int maxKelas) {
        this.maxKelas = maxKelas;
    }

    @Override
    public String toString() {
        return "Setting{" + "idSetting=" + idSetting + ", minKelas=" + minKelas + ", maxKelas=" + maxKelas + '}';
    }

}
