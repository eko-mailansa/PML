/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebclientapps.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "status_bayar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusBayar.findAll", query = "SELECT s FROM StatusBayar s"),
    @NamedQuery(name = "StatusBayar.findByIdStatusBayar", query = "SELECT s FROM StatusBayar s WHERE s.idStatusBayar = :idStatusBayar"),
    @NamedQuery(name = "StatusBayar.findByStatusBayar", query = "SELECT s FROM StatusBayar s WHERE s.statusBayar = :statusBayar"),
    @NamedQuery(name = "StatusBayar.findByTglBayar", query = "SELECT s FROM StatusBayar s WHERE s.tglBayar = :tglBayar")})
public class StatusBayar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idStatusBayar")
    private Integer idStatusBayar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "statusBayar")
    private boolean statusBayar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tglBayar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglBayar;
    @JoinColumn(name = "noReg", referencedColumnName = "noReg")
    @ManyToOne(optional = false)
    private Mahasiswa noReg;
    @JoinColumn(name = "idSemester", referencedColumnName = "idSemester")
    @ManyToOne(optional = false)
    private Semester idSemester;

    public StatusBayar() {
    }

    public StatusBayar(Integer idStatusBayar) {
        this.idStatusBayar = idStatusBayar;
    }

    public StatusBayar(Integer idStatusBayar, boolean statusBayar, Date tglBayar) {
        this.idStatusBayar = idStatusBayar;
        this.statusBayar = statusBayar;
        this.tglBayar = tglBayar;
    }

    public Integer getIdStatusBayar() {
        return idStatusBayar;
    }

    public void setIdStatusBayar(Integer idStatusBayar) {
        this.idStatusBayar = idStatusBayar;
    }

    public boolean getStatusBayar() {
        return statusBayar;
    }

    public void setStatusBayar(boolean statusBayar) {
        this.statusBayar = statusBayar;
    }

    public Date getTglBayar() {
        return tglBayar;
    }

    public void setTglBayar(Date tglBayar) {
        this.tglBayar = tglBayar;
    }

    public Mahasiswa getNoReg() {
        return noReg;
    }

    public void setNoReg(Mahasiswa noReg) {
        this.noReg = noReg;
    }

    public Semester getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(Semester idSemester) {
        this.idSemester = idSemester;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStatusBayar != null ? idStatusBayar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusBayar)) {
            return false;
        }
        StatusBayar other = (StatusBayar) object;
        if ((this.idStatusBayar == null && other.idStatusBayar != null) || (this.idStatusBayar != null && !this.idStatusBayar.equals(other.idStatusBayar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebclientapps.entity.StatusBayar[ idStatusBayar=" + idStatusBayar + " ]";
    }
    
}
