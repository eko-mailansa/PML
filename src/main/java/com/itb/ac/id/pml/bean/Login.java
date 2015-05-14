/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itb.ac.id.pml.bean;

import com.itb.ac.id.pml.entities.UserLogin;
import com.itb.ac.id.pml.session.SekolahEJBRemote;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Frencius Leo Nardus
 */
public class Login {

    @EJB
    private SekolahEJBRemote sEJB;
    private String user = "";
    private String pass = "";
    private UserLogin ul;
    private List<UserLogin> uls;

    public String Login() {
        uls = sEJB.tampilUsers();
        ul = new UserLogin();
        for (UserLogin ulx : uls) {
            if (user.equals(ulx.getUsername()) && pass.equals(ulx.getPassword())) {
                ul = ulx;
                System.out.println("behasil");
                break;
            }
        }
        try {

        } catch (Exception e) {
        }
        return "home";

    }

}
