/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Pendaftaran;
import model.PendaftaranDetail;

/**
 *
 * @author Home
 */
@Stateless
public class PendaftaranFacade extends AbstractFacade<Pendaftaran> {

    @PersistenceContext(unitName = "Universitas_PML_AppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public void savePML(Pendaftaran params) {
        params.setStatus("FRS");
        em.persist(params);
        for (PendaftaranDetail pd : params.getPendaftaranDetailList()) {
            pd.setIdDaftar(params);
            pd.setKonfirmasiPS(true);
            em.persist(pd);
        }
    }

    public void updatePML(Pendaftaran params) {
        params.setTglStatusApprove(new Date());
        em.merge(params);
        for (PendaftaranDetail pd : params.getPendaftaranDetailList()) {
            em.merge(pd);
        }
    }

    public PendaftaranFacade() {
        super(Pendaftaran.class);
    }

    public List<Pendaftaran> findPendaftaranByNoReg(String param) {
        try {
            Query q = em.createQuery("SELECT p FROM Pendaftaran p WHERE p.noReg = :param ORDER BY p.idDaftar DESC");
            q.setParameter("param", param);
            return q.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public Pendaftaran findPendaftaranByNoRegDanIdSemester(String param, int param2) {
        try {
            Query q = em.createQuery("SELECT p FROM Pendaftaran p WHERE p.noReg = :param AND p.idSemester = :param2");
            q.setParameter("param", param);
            q.setParameter("param2", param2);
            return (Pendaftaran) q.getResultList().get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
