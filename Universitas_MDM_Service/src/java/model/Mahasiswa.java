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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "mahasiswa")
public class Mahasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "noReg")
    private String noReg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "nim")
    private String nim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "namaMahasiswa")
    private String namaMahasiswa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "kodePos")
    private String kodePos;
    @Column(name = "idProg")
    private int idProg;

    public Mahasiswa() {
    }

    public Mahasiswa(String noReg) {
        this.noReg = noReg;
    }

    public Mahasiswa(String noReg, String nim, String namaMahasiswa, String alamat, String kodePos) {
        this.noReg = noReg;
        this.nim = nim;
        this.namaMahasiswa = namaMahasiswa;
        this.alamat = alamat;
        this.kodePos = kodePos;
    }

    public String getNoReg() {
        return noReg;
    }

    public void setNoReg(String noReg) {
        this.noReg = noReg;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public int getIdProg() {
        return idProg;
    }

    public void setIdProg(int idProg) {
        this.idProg = idProg;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "noReg=" + noReg + ", nim=" + nim + ", namaMahasiswa=" + namaMahasiswa + ", alamat=" + alamat + ", kodePos=" + kodePos + ", idProg=" + idProg + '}';
    }

}
