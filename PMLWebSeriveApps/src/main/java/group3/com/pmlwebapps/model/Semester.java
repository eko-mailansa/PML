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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "semester")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Semester.findAll", query = "SELECT s FROM Semester s"),
    @NamedQuery(name = "Semester.findByIdSemester", query = "SELECT s FROM Semester s WHERE s.idSemester = :idSemester"),
    @NamedQuery(name = "Semester.findBySemester", query = "SELECT s FROM Semester s WHERE s.semester = :semester"),
    @NamedQuery(name = "Semester.findByTahun1", query = "SELECT s FROM Semester s WHERE s.tahun1 = :tahun1"),
    @NamedQuery(name = "Semester.findByTahun2", query = "SELECT s FROM Semester s WHERE s.tahun2 = :tahun2")})
public class Semester implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSemester")
    private Integer idSemester;
    @Basic(optional = false)
    @NotNull
    @Column(name = "semester")
    private int semester;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tahun1")
    private int tahun1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tahun2")
    private int tahun2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSemester")
    private Collection<Kelas> kelasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSemester")
    private Collection<StatusBayar> statusBayarCollection;

    public Semester() {
    }

    public Semester(Integer idSemester) {
        this.idSemester = idSemester;
    }

    public Semester(Integer idSemester, int semester, int tahun1, int tahun2) {
        this.idSemester = idSemester;
        this.semester = semester;
        this.tahun1 = tahun1;
        this.tahun2 = tahun2;
    }

    public Integer getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(Integer idSemester) {
        this.idSemester = idSemester;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getTahun1() {
        return tahun1;
    }

    public void setTahun1(int tahun1) {
        this.tahun1 = tahun1;
    }

    public int getTahun2() {
        return tahun2;
    }

    public void setTahun2(int tahun2) {
        this.tahun2 = tahun2;
    }

    @XmlTransient
    public Collection<Kelas> getKelasCollection() {
        return kelasCollection;
    }

    public void setKelasCollection(Collection<Kelas> kelasCollection) {
        this.kelasCollection = kelasCollection;
    }

    @XmlTransient
    public Collection<StatusBayar> getStatusBayarCollection() {
        return statusBayarCollection;
    }

    public void setStatusBayarCollection(Collection<StatusBayar> statusBayarCollection) {
        this.statusBayarCollection = statusBayarCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSemester != null ? idSemester.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semester)) {
            return false;
        }
        Semester other = (Semester) object;
        if ((this.idSemester == null && other.idSemester != null) || (this.idSemester != null && !this.idSemester.equals(other.idSemester))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebapps.model.Semester[ idSemester=" + idSemester + " ]";
    }
    
}
