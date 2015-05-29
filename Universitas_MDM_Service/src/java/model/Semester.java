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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "semester")
public class Semester implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
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

    @Override
    public String toString() {
        return "Semester{" + "idSemester=" + idSemester + ", semester=" + semester + ", tahun1=" + tahun1 + ", tahun2=" + tahun2 + '}';
    }

}
