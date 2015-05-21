/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebclientapps.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "mata_kuliah")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MataKuliah.findAll", query = "SELECT m FROM MataKuliah m"),
    @NamedQuery(name = "MataKuliah.findByIdMK", query = "SELECT m FROM MataKuliah m WHERE m.idMK = :idMK"),
    @NamedQuery(name = "MataKuliah.findByNamaMK", query = "SELECT m FROM MataKuliah m WHERE m.namaMK = :namaMK"),
    @NamedQuery(name = "MataKuliah.findBySks", query = "SELECT m FROM MataKuliah m WHERE m.sks = :sks"),
    @NamedQuery(name = "MataKuliah.findBySilabus", query = "SELECT m FROM MataKuliah m WHERE m.silabus = :silabus")})
public class MataKuliah implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "idMK")
    private String idMK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "namaMK")
    private String namaMK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sks")
    private int sks;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "silabus")
    private String silabus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMK")
    private List<Kelas> kelasList;
    @JoinColumn(name = "idProg", referencedColumnName = "idProg")
    @ManyToOne(optional = false)
    private ProgramStudi idProg;

    public MataKuliah() {
    }

    public MataKuliah(String idMK) {
        this.idMK = idMK;
    }

    public MataKuliah(String idMK, String namaMK, int sks, String silabus) {
        this.idMK = idMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.silabus = silabus;
    }

    public String getIdMK() {
        return idMK;
    }

    public void setIdMK(String idMK) {
        this.idMK = idMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getSilabus() {
        return silabus;
    }

    public void setSilabus(String silabus) {
        this.silabus = silabus;
    }

    @XmlTransient
    public List<Kelas> getKelasList() {
        return kelasList;
    }

    public void setKelasList(List<Kelas> kelasList) {
        this.kelasList = kelasList;
    }

    public ProgramStudi getIdProg() {
        return idProg;
    }

    public void setIdProg(ProgramStudi idProg) {
        this.idProg = idProg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMK != null ? idMK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MataKuliah)) {
            return false;
        }
        MataKuliah other = (MataKuliah) object;
        if ((this.idMK == null && other.idMK != null) || (this.idMK != null && !this.idMK.equals(other.idMK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebclientapps.entity.MataKuliah[ idMK=" + idMK + " ]";
    }
    
}
