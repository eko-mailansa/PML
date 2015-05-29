/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.PendaftaranDetail;

/**
 *
 * @author Home
 */
@Stateless
public class PendaftaranDetailFacade extends AbstractFacade<PendaftaranDetail> {

    @PersistenceContext(unitName = "Universitas_PML_AppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PendaftaranDetailFacade() {
        super(PendaftaranDetail.class);
    }

}
