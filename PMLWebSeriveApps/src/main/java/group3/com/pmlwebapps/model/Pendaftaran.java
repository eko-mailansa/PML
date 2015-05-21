/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebapps.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "pendaftaran")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pendaftaran.findAll", query = "SELECT p FROM Pendaftaran p"),
    @NamedQuery(name = "Pendaftaran.findByIdDaftar", query = "SELECT p FROM Pendaftaran p WHERE p.idDaftar = :idDaftar"),
    @NamedQuery(name = "Pendaftaran.findByTglDaftar", query = "SELECT p FROM Pendaftaran p WHERE p.tglDaftar = :tglDaftar"),
    @NamedQuery(name = "Pendaftaran.findByStatusDaftar", query = "SELECT p FROM Pendaftaran p WHERE p.statusDaftar = :statusDaftar"),
    @NamedQuery(name = "Pendaftaran.findByTglStatus", query = "SELECT p FROM Pendaftaran p WHERE p.tglStatus = :tglStatus"),
    @NamedQuery(name = "Pendaftaran.findByKsm", query = "SELECT p FROM Pendaftaran p WHERE p.ksm = :ksm"),
    @NamedQuery(name = "Pendaftaran.findByTglKsm", query = "SELECT p FROM Pendaftaran p WHERE p.tglKsm = :tglKsm"),
    @NamedQuery(name = "Pendaftaran.findByIdSemester", query = "SELECT p FROM Pendaftaran p WHERE p.idSemester = :idSemester")})
public class Pendaftaran implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDaftar")
    private Integer idDaftar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tglDaftar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglDaftar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "statusDaftar")
    private boolean statusDaftar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tglStatus")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ksm")
    private boolean ksm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tglKsm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglKsm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSemester")
    private int idSemester;
    @JoinColumn(name = "noReg", referencedColumnName = "noReg")
    @ManyToOne(optional = false)
    private Mahasiswa noReg;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDaftar")
    private Collection<PendaftaranDetail> pendaftaranDetailCollection;

    public Pendaftaran() {
    }

    public Pendaftaran(Integer idDaftar) {
        this.idDaftar = idDaftar;
    }

    public Pendaftaran(Integer idDaftar, Date tglDaftar, boolean statusDaftar, Date tglStatus, boolean ksm, Date tglKsm, int idSemester) {
        this.idDaftar = idDaftar;
        this.tglDaftar = tglDaftar;
        this.statusDaftar = statusDaftar;
        this.tglStatus = tglStatus;
        this.ksm = ksm;
        this.tglKsm = tglKsm;
        this.idSemester = idSemester;
    }

    public Integer getIdDaftar() {
        return idDaftar;
    }

    public void setIdDaftar(Integer idDaftar) {
        this.idDaftar = idDaftar;
    }

    public Date getTglDaftar() {
        return tglDaftar;
    }

    public void setTglDaftar(Date tglDaftar) {
        this.tglDaftar = tglDaftar;
    }

    public boolean getStatusDaftar() {
        return statusDaftar;
    }

    public void setStatusDaftar(boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public Date getTglStatus() {
        return tglStatus;
    }

    public void setTglStatus(Date tglStatus) {
        this.tglStatus = tglStatus;
    }

    public boolean getKsm() {
        return ksm;
    }

    public void setKsm(boolean ksm) {
        this.ksm = ksm;
    }

    public Date getTglKsm() {
        return tglKsm;
    }

    public void setTglKsm(Date tglKsm) {
        this.tglKsm = tglKsm;
    }

    public int getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(int idSemester) {
        this.idSemester = idSemester;
    }

    public Mahasiswa getNoReg() {
        return noReg;
    }

    public void setNoReg(Mahasiswa noReg) {
        this.noReg = noReg;
    }

    @XmlTransient
    public Collection<PendaftaranDetail> getPendaftaranDetailCollection() {
        return pendaftaranDetailCollection;
    }

    public void setPendaftaranDetailCollection(Collection<PendaftaranDetail> pendaftaranDetailCollection) {
        this.pendaftaranDetailCollection = pendaftaranDetailCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDaftar != null ? idDaftar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pendaftaran)) {
            return false;
        }
        Pendaftaran other = (Pendaftaran) object;
        if ((this.idDaftar == null && other.idDaftar != null) || (this.idDaftar != null && !this.idDaftar.equals(other.idDaftar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebapps.model.Pendaftaran[ idDaftar=" + idDaftar + " ]";
    }
    
}
