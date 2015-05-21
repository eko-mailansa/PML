/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebapps.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "setting")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Setting.findAll", query = "SELECT s FROM Setting s"),
    @NamedQuery(name = "Setting.findByIdSetting", query = "SELECT s FROM Setting s WHERE s.idSetting = :idSetting"),
    @NamedQuery(name = "Setting.findByMinKelas", query = "SELECT s FROM Setting s WHERE s.minKelas = :minKelas"),
    @NamedQuery(name = "Setting.findByMaxKelas", query = "SELECT s FROM Setting s WHERE s.maxKelas = :maxKelas")})
public class Setting implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
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
    public int hashCode() {
        int hash = 0;
        hash += (idSetting != null ? idSetting.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Setting)) {
            return false;
        }
        Setting other = (Setting) object;
        if ((this.idSetting == null && other.idSetting != null) || (this.idSetting != null && !this.idSetting.equals(other.idSetting))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebapps.model.Setting[ idSetting=" + idSetting + " ]";
    }
    
}
