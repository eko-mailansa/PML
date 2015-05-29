/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Kelaspml;
import model.Openmkpml;

/**
 *
 * @author Home
 */
@Stateless
public class OpenmkpmlFacade extends AbstractFacade<Openmkpml> {

    @PersistenceContext(unitName = "Universitas_PML_AppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OpenmkpmlFacade() {
        super(Openmkpml.class);
    }

    public void saveOpenMKPML(List<Openmkpml> params) {
        for (Openmkpml param : params) {
            em.persist(param);
            for (Kelaspml kp : param.getKelaspmlList()) {
                kp.setIdOpenMKPML(param);
                em.persist(kp);
            }
        }
    }

    public List<Openmkpml> findOpenMKPMLByIDSemesterDanIDPrody(int param1, int param2) {
        try {
            Query q = em.createQuery("SELECT e FROM Openmkpml e WHERE e.idSemester = :param1 AND e.idProdi = :param2");
            q.setParameter("param1", param1);
            q.setParameter("param2", param2);
            return q.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

}
