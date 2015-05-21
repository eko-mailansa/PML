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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "dosen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dosen.findAll", query = "SELECT d FROM Dosen d"),
    @NamedQuery(name = "Dosen.findByNip", query = "SELECT d FROM Dosen d WHERE d.nip = :nip"),
    @NamedQuery(name = "Dosen.findByNamaDosen", query = "SELECT d FROM Dosen d WHERE d.namaDosen = :namaDosen"),
    @NamedQuery(name = "Dosen.findByPeran", query = "SELECT d FROM Dosen d WHERE d.peran = :peran")})
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
    @JoinTable(name = "dosen_wali", joinColumns = {
        @JoinColumn(name = "nip", referencedColumnName = "nip")}, inverseJoinColumns = {
        @JoinColumn(name = "nim", referencedColumnName = "noReg")})
    @ManyToMany
    private Collection<Mahasiswa> mahasiswaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nip")
    private Collection<Kelas> kelasCollection;

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

    @XmlTransient
    public Collection<Mahasiswa> getMahasiswaCollection() {
        return mahasiswaCollection;
    }

    public void setMahasiswaCollection(Collection<Mahasiswa> mahasiswaCollection) {
        this.mahasiswaCollection = mahasiswaCollection;
    }

    @XmlTransient
    public Collection<Kelas> getKelasCollection() {
        return kelasCollection;
    }

    public void setKelasCollection(Collection<Kelas> kelasCollection) {
        this.kelasCollection = kelasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nip != null ? nip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dosen)) {
            return false;
        }
        Dosen other = (Dosen) object;
        if ((this.nip == null && other.nip != null) || (this.nip != null && !this.nip.equals(other.nip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebapps.model.Dosen[ nip=" + nip + " ]";
    }
    
}
