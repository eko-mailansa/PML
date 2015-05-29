/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.*;

/**
 *
 * @author Home
 */
@Stateless
public class MyFacade implements Serializable {

    @PersistenceContext(unitName = "myServicePU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public void createDosen(Dosen entity) {
        getEntityManager().persist(entity);
    }

    /* ### Method findAll<Entity> ### */
    public List<Dosen> findAllDosen() {
        try {
            javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
            cq.select(cq.from(Dosen.class));
            return getEntityManager().createQuery(cq).getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    /* ### STRUKTUR KURIKULUM 2014 ### */
    public List<Fakultas> findAllFakultas() {
        try {
            javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
            cq.select(cq.from(Fakultas.class));
            return getEntityManager().createQuery(cq).getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public List<ProgramStudi> findProgramStudiByFakultas(int param) {
        try {
            Query q = em.createQuery("SELECT p FROM ProgramStudi p WHERE p.idFak = :param");
            q.setParameter("param", param);
            return q.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public List<MataKuliah> findMataKuliahByProgramStudi(int param) {
        try {
            Query q;
            if (param == 235) {
                q = em.createQuery("SELECT mk FROM MataKuliah mk WHERE mk.idProg = :param ORDER BY mk.opsi");
            } else {
                q = em.createQuery("SELECT mk FROM MataKuliah mk WHERE mk.idProg = :param ORDER BY mk.semester");
            }
            q.setParameter("param", param);
            List<MataKuliah> mks = q.getResultList();
            if (param == 235) {
                for (MataKuliah mk : mks) {
                    String[] tabOpsi = mk.getOpsi().split(",");
                    String opsiString = "";
                    for (int i = 0; i < tabOpsi.length; i++) {
                        if (i == tabOpsi.length - 1) {
                            opsiString += em.createQuery("SELECT o.namaOpsi FROM Opsi o WHERE o.idOpsi=" + tabOpsi[i]).getResultList().get(0).toString() + "";
                        } else {
                            opsiString += em.createQuery("SELECT o.namaOpsi FROM Opsi o WHERE o.idOpsi=" + tabOpsi[i]).getResultList().get(0).toString() + ", ";
                        }
                    }
                    mk.setOpsiString(opsiString);
                }
            }
            return mks;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* ### DISPLAY FAKULTAS & PROGRAMSTUDI & MAHASISWA & DOSEN WALI & SEMESTER AKTIF ### */
    public Fakultas findFakultasByIdFak(int param) {
        try {
            Query q = em.createQuery("SELECT f FROM Fakultas f WHERE f.idFak = :param");
            q.setParameter("param", param);
            return (Fakultas) q.getResultList().get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public ProgramStudi findProgramStudiByIdProg(int param) {
        try {
            Query q = em.createQuery("SELECT ps FROM ProgramStudi ps WHERE ps.idProg = :param");
            q.setParameter("param", param);
            return (ProgramStudi) q.getResultList().get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public Mahasiswa findMahasiswaByNIM(String param) {
        try {
            Query q = em.createQuery("SELECT m FROM Mahasiswa m WHERE m.nim = :param");
            q.setParameter("param", param);
            return (Mahasiswa) q.getResultList().get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public DosenWali findDosenWaliByNoReg(String param) {
        try {
            Query q = em.createQuery("SELECT dw FROM DosenWali dw WHERE dw.noreg = :param");
            q.setParameter("param", param);
            return (DosenWali) q.getResultList().get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public Dosen findDosenWaliByNIP(String param) {
        try {
//            DosenWali dw = findDosenWaliByNoReg(param);
            Query q = em.createQuery("SELECT d FROM Dosen d WHERE d.nip = :param");
            q.setParameter("param", param);
            return (Dosen) q.getResultList().get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public DosenWali findCekDosenWaliByNIP(String param) {
        try {
//            DosenWali dw = findDosenWaliByNoReg(param);
            Query q = em.createQuery("SELECT d FROM DosenWali d WHERE d.nip = :param");
            q.setParameter("param", param);
            return (DosenWali) q.getResultList().get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public Semester findSemesterActive() {
        try {
            Query q = em.createQuery("SELECT s FROM Semester s WHERE s.idSemester = (SELECT MAX(s.idSemester) FROM Semester s)");
            return (Semester) q.getResultList().get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* ### DISPLAY STATUS KEUANGAN MAHASISWA ### */
    public List<StatusBayar> findStatusBayarByNoReg(String param) {
        try {
            List<StatusBayar> statusBayars;
            Query q = em.createQuery("SELECT sb FROM StatusBayar sb WHERE sb.noReg = :param");
            q.setParameter("param", param);
            statusBayars = q.getResultList();
            for (StatusBayar sb : statusBayars) {
                Semester s = (Semester) em.createQuery("SELECT s FROM Semester s WHERE s.idSemester = " + sb.getIdSemester()).getResultList().get(0);
                sb.setSemester(s.getSemester());
                sb.setTahun1(s.getTahun1());
                sb.setTahun2(s.getTahun2());
            }
            return statusBayars;
        } catch (Exception e) {
            return null;
        }
    }

    /* ### DISPLAY STATUS MAHASISWA ### */
    public Semester findSemesterByidSemester(int param) {
        try {
            Query q = em.createQuery("SELECT s FROM Semester s WHERE s.idSemester = :param");
            q.setParameter("param", param);
            return (Semester) q.getResultList().get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public MataKuliah findMataKuliahByidMK(String param) {
        try {
            Query q = em.createQuery("SELECT mk FROM MataKuliah mk WHERE mk.idMK = :param");
            q.setParameter("param", param);
            return (MataKuliah) q.getResultList().get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public List<Opsi> findAllOpsi() {
        try {
            Query q = em.createQuery("SELECT o FROM Opsi o");
            return q.getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    public List<MataKuliah> findMataKuliahByIdOpsi(int param) {
        try {
            Query q = em.createQuery("SELECT mk FROM MataKuliah mk WHERE mk.opsi LIKE '%:param%'");
            q.setParameter("param", param);
            return q.getResultList();
        } catch (Exception e) {
            return null;
        }
    }
}
