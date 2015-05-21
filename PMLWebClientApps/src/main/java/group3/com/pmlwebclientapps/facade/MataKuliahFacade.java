/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebclientapps.facade;

import group3.com.pmlwebclientapps.entity.MataKuliah;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Home
 */
@Stateless
public class MataKuliahFacade extends AbstractFacade<MataKuliah> {
    @PersistenceContext(unitName = "group3.com_PMLWebClientApps_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MataKuliahFacade() {
        super(MataKuliah.class);
    }
    
}
