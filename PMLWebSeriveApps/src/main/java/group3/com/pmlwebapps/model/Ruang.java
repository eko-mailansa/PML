/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebapps.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "ruang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ruang.findAll", query = "SELECT r FROM Ruang r"),
    @NamedQuery(name = "Ruang.findByIdRuang", query = "SELECT r FROM Ruang r WHERE r.idRuang = :idRuang"),
    @NamedQuery(name = "Ruang.findByNamaRuang", query = "SELECT r FROM Ruang r WHERE r.namaRuang = :namaRuang")})
public class Ruang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idRuang")
    private Integer idRuang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "namaRuang")
    private String namaRuang;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRuang")
    private Collection<Jadwal> jadwalCollection;

    public Ruang() {
    }

    public Ruang(Integer idRuang) {
        this.idRuang = idRuang;
    }

    public Ruang(Integer idRuang, String namaRuang) {
        this.idRuang = idRuang;
        this.namaRuang = namaRuang;
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

    @XmlTransient
    public Collection<Jadwal> getJadwalCollection() {
        return jadwalCollection;
    }

    public void setJadwalCollection(Collection<Jadwal> jadwalCollection) {
        this.jadwalCollection = jadwalCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRuang != null ? idRuang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ruang)) {
            return false;
        }
        Ruang other = (Ruang) object;
        if ((this.idRuang == null && other.idRuang != null) || (this.idRuang != null && !this.idRuang.equals(other.idRuang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebapps.model.Ruang[ idRuang=" + idRuang + " ]";
    }
    
}
