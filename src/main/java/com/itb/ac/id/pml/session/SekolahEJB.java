package com.itb.ac.id.pml.session;

import com.itb.ac.id.pml.entities.UserLogin;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sendy
 */
@Stateless
public class SekolahEJB implements SekolahEJBRemote {

    @PersistenceContext(unitName = "AplikasiSekolah-ejbPU")
    private EntityManager em;

  

    @Override
    public List<UserLogin> tampilUsers() {
        return em.createQuery("SELECT ul FROM UserLogin ul").getResultList();
    }
}
