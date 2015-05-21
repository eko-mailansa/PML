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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "fakultas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fakultas.findAll", query = "SELECT f FROM Fakultas f"),
    @NamedQuery(name = "Fakultas.findByIdFak", query = "SELECT f FROM Fakultas f WHERE f.idFak = :idFak"),
    @NamedQuery(name = "Fakultas.findByNamaFak", query = "SELECT f FROM Fakultas f WHERE f.namaFak = :namaFak")})
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFak")
    private Collection<ProgramStudi> programStudiCollection;

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

    @XmlTransient
    public Collection<ProgramStudi> getProgramStudiCollection() {
        return programStudiCollection;
    }

    public void setProgramStudiCollection(Collection<ProgramStudi> programStudiCollection) {
        this.programStudiCollection = programStudiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFak != null ? idFak.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fakultas)) {
            return false;
        }
        Fakultas other = (Fakultas) object;
        if ((this.idFak == null && other.idFak != null) || (this.idFak != null && !this.idFak.equals(other.idFak))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebapps.model.Fakultas[ idFak=" + idFak + " ]";
    }
    
}
