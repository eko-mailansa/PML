/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "program_studi")
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
    @Column(name = "idFak")
    private int idFak;
    @Transient
    private String namaFak;
    @Transient
    private String ketFak;

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

    public int getIdFak() {
        return idFak;
    }

    public void setIdFak(int idFak) {
        this.idFak = idFak;
    }

    public String getNamaFak() {
        return namaFak;
    }

    public void setNamaFak(String namaFak) {
        this.namaFak = namaFak;
    }

    public String getKetFak() {
        return ketFak;
    }

    public void setKetFak(String ketFak) {
        this.ketFak = ketFak;
    }

    @Override
    public String toString() {
        return "ProgramStudi{" + "idProg=" + idProg + ", namaProg=" + namaProg + ", idFak=" + idFak + ", namaFak=" + namaFak + ", ketFak=" + ketFak + '}';
    }

}
