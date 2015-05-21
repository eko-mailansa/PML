/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebapps.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@Table(name = "user_login")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserLogin.findAll", query = "SELECT u FROM UserLogin u"),
    @NamedQuery(name = "UserLogin.findByUserName", query = "SELECT u FROM UserLogin u WHERE u.userName = :userName"),
    @NamedQuery(name = "UserLogin.findByPeran", query = "SELECT u FROM UserLogin u WHERE u.peran = :peran"),
    @NamedQuery(name = "UserLogin.findByIsLogin", query = "SELECT u FROM UserLogin u WHERE u.isLogin = :isLogin"),
    @NamedQuery(name = "UserLogin.findByIsAvtive", query = "SELECT u FROM UserLogin u WHERE u.isAvtive = :isAvtive"),
    @NamedQuery(name = "UserLogin.findByLastLogin", query = "SELECT u FROM UserLogin u WHERE u.lastLogin = :lastLogin")})
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
    private boolean peran;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isLogin")
    private boolean isLogin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isAvtive")
    private boolean isAvtive;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lastLogin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;

    public UserLogin() {
    }

    public UserLogin(String userName) {
        this.userName = userName;
    }

    public UserLogin(String userName, boolean peran, boolean isLogin, boolean isAvtive, Date lastLogin) {
        this.userName = userName;
        this.peran = peran;
        this.isLogin = isLogin;
        this.isAvtive = isAvtive;
        this.lastLogin = lastLogin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean getPeran() {
        return peran;
    }

    public void setPeran(boolean peran) {
        this.peran = peran;
    }

    public boolean getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }

    public boolean getIsAvtive() {
        return isAvtive;
    }

    public void setIsAvtive(boolean isAvtive) {
        this.isAvtive = isAvtive;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userName != null ? userName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLogin)) {
            return false;
        }
        UserLogin other = (UserLogin) object;
        if ((this.userName == null && other.userName != null) || (this.userName != null && !this.userName.equals(other.userName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "group3.com.pmlwebapps.model.UserLogin[ userName=" + userName + " ]";
    }
    
}
