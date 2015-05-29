/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.UserLogin;

/**
 *
 * @author Home
 */
@Stateless
public class UserLoginFacade extends AbstractFacade<UserLogin> {

    @PersistenceContext(unitName = "Universitas_PML_AppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserLoginFacade() {
        super(UserLogin.class);
    }

    public UserLogin findByLogin(String username, String password) {
        UserLogin userLogin;
        try {
            Query q = em.createQuery("SELECT ul FROM UserLogin ul WHERE ul.userName = :user AND ul.password = :pass");
            q.setParameter("user", username);
            q.setParameter("pass", password);
            userLogin = (UserLogin) q.getSingleResult();
            return userLogin;
        } catch (Exception e) {
            return null;
        }
    }
}
