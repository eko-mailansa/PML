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
@Table(name = "program_studi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProgramStudi.findAll", query = "SELECT p FROM ProgramStudi p"),
    @NamedQuery(name = "ProgramStudi.findByIdProg", query = "SELECT p FROM ProgramStudi p WHERE p.idProg = :idProg"),
    @NamedQuery(name = "ProgramStudi.findByNamaProg", query = "SELECT p FROM ProgramStudi p WHERE p.namaProg = :namaProg")})
public class ProgramStudi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idProg")
    private Integer idProg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "namaProg")
    private String namaProg;
    @JoinColumn(name = "idFak", referencedColumnName = "idFak")
    @ManyToOne(optional = false)
    private Fakultas idFak;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProg")
    private List<Mahasiswa> mahasiswaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProg")
    private List<MataKuliah> mataKuliahList;

    public ProgramStudi() {
    }

    public ProgramStudi(Integer idProg) {
        this.idProg = idProg;
    }

    public ProgramStudi(Integer idProg, String namaProg) {
        this.idProg = idProg;
        this.namaProg = namaProg;
    }

    public Integer getIdProg() {
        return idProg;
    }

    public void setIdProg(Integer idProg) {
        this.idProg = idProg;
    }

    public String getNamaProg() {
        return namaProg;
    }

    public void setNamaProg(String namaProg) {
        this.namaProg = namaProg;
    }

    public Fakultas getIdFak() {
        return idFak;
    }

    public void setIdFak(Fakultas idFak) {
        this.idFak = idFak;
    }

    @XmlTransient
    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public void setMahasiswaList(List<Mahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
    }

    @XmlTransient
    public List<MataKuliah> getMataKuliahList() {
        return mataKuliahList;
    }

    public void setMataKuliahList(List<MataKuliah> mataKuliahList) {
        this.mataKuliahList = mataKuliahList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProg != null ? idProg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgramStudi)) {
            return false;
        }
        ProgramStudi other = (ProgramStudi) object;
        if ((this.idProg == null && other.idProg != null) || (this.idProg != null && !this.idProg.equals(other.idProg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebclientapps.entity.ProgramStudi[ idProg=" + idProg + " ]";
    }
    
}
