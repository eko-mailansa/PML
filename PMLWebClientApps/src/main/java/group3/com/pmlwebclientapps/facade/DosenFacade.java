/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebclientapps.facade;

import group3.com.pmlwebclientapps.entity.Dosen;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Home
 */
@Stateless
public class DosenFacade extends AbstractFacade<Dosen> {
    @PersistenceContext(unitName = "group3.com_PMLWebClientApps_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DosenFacade() {
        super(Dosen.class);
    }
    
}
