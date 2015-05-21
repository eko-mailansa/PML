/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebclientapps.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "jadwal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jadwal.findAll", query = "SELECT j FROM Jadwal j"),
    @NamedQuery(name = "Jadwal.findByIdJadwal", query = "SELECT j FROM Jadwal j WHERE j.idJadwal = :idJadwal"),
    @NamedQuery(name = "Jadwal.findByHari", query = "SELECT j FROM Jadwal j WHERE j.hari = :hari"),
    @NamedQuery(name = "Jadwal.findByJam", query = "SELECT j FROM Jadwal j WHERE j.jam = :jam"),
    @NamedQuery(name = "Jadwal.findByKegiatan", query = "SELECT j FROM Jadwal j WHERE j.kegiatan = :kegiatan")})
public class Jadwal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idJadwal")
    private Integer idJadwal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hari")
    private boolean hari;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "jam")
    private String jam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kegiatan")
    private boolean kegiatan;
    @JoinColumn(name = "idKelas", referencedColumnName = "idKelas")
    @ManyToOne(optional = false)
    private Kelas idKelas;
    @JoinColumn(name = "idRuang", referencedColumnName = "idRuang")
    @ManyToOne(optional = false)
    private Ruang idRuang;

    public Jadwal() {
    }

    public Jadwal(Integer idJadwal) {
        this.idJadwal = idJadwal;
    }

    public Jadwal(Integer idJadwal, boolean hari, String jam, boolean kegiatan) {
        this.idJadwal = idJadwal;
        this.hari = hari;
        this.jam = jam;
        this.kegiatan = kegiatan;
    }

    public Integer getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(Integer idJadwal) {
        this.idJadwal = idJadwal;
    }

    public boolean getHari() {
        return hari;
    }

    public void setHari(boolean hari) {
        this.hari = hari;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public boolean getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(boolean kegiatan) {
        this.kegiatan = kegiatan;
    }

    public Kelas getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(Kelas idKelas) {
        this.idKelas = idKelas;
    }

    public Ruang getIdRuang() {
        return idRuang;
    }

    public void setIdRuang(Ruang idRuang) {
        this.idRuang = idRuang;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJadwal != null ? idJadwal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jadwal)) {
            return false;
        }
        Jadwal other = (Jadwal) object;
        if ((this.idJadwal == null && other.idJadwal != null) || (this.idJadwal != null && !this.idJadwal.equals(other.idJadwal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebclientapps.entity.Jadwal[ idJadwal=" + idJadwal + " ]";
    }
    
}
