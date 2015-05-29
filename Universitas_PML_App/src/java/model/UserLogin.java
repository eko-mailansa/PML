/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "user_login")
public class UserLogin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "userName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peran")
    private int peran;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isActive")
    private boolean isActive;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lastLogin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "password")
    private String password;
    @Transient
    private String peranKu;
    @Transient
    private String menuKu;

    public UserLogin() {
    }

    public UserLogin(String userName) {
        this.userName = userName;
    }

    public UserLogin(String userName, int peran, boolean isActive, Date lastLogin, String password) {
        this.userName = userName;
        this.peran = peran;
        this.isActive = isActive;
        this.lastLogin = lastLogin;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPeran() {
        return peran;
    }

    public void setPeran(int peran) {
        this.peran = peran;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPeranKu() {
        return peranKu;
    }

    public void setPeranKu(String peranKu) {
        this.peranKu = peranKu;
    }

    public String getMenuKu() {
        return menuKu;
    }

    public void setMenuKu(String menuKu) {
        this.menuKu = menuKu;
    }

    @Override
    public String toString() {
        return "UserLogin{" + "userName=" + userName + ", peran=" + peran + ", isActive=" + isActive + ", lastLogin=" + lastLogin + ", password=" + password + ", peranKu=" + peranKu + ", menuKu=" + menuKu + '}';
    }

}
