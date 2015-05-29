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
public class KelaspmlFacade extends AbstractFacade<Kelaspml> {

    @PersistenceContext(unitName = "Universitas_PML_AppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KelaspmlFacade() {
        super(Kelaspml.class);
    }

    public List<Kelaspml> findKelasPMLBySemesterDanProdi(int param1, int param2) {
        try {
            Query q = em.createQuery("SELECT e FROM Kelaspml e WHERE e.idOpenMKPML.idSemester = :param1 AND e.idOpenMKPML.idProdi = :param2");
            q.setParameter("param1", param1);
            q.setParameter("param2", param2);
            return q.getResultList();
        } catch (Exception e) {
            return null;
        }
    }
}
