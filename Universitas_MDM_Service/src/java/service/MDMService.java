/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import controller.MyFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Dosen;
import model.DosenWali;
import model.Fakultas;
import model.Mahasiswa;
import model.MataKuliah;
import model.Opsi;
import model.ProgramStudi;
import model.Semester;
import model.StatusBayar;

/**
 *
 * @author Home
 */
@WebService(serviceName = "MDMService")
@Stateless()
public class MDMService {
    @EJB
    private MyFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createDosen")
    @Oneway
    public void createDosen(@WebParam(name = "entity") Dosen entity) {
        ejbRef.createDosen(entity);
    }

    @WebMethod(operationName = "findAllDosen")
    public List<Dosen> findAllDosen() {
        return ejbRef.findAllDosen();
    }

    @WebMethod(operationName = "findAllFakultas")
    public List<Fakultas> findAllFakultas() {
        return ejbRef.findAllFakultas();
    }

    @WebMethod(operationName = "findProgramStudiByFakultas")
    public List<ProgramStudi> findProgramStudiByFakultas(@WebParam(name = "param") int param) {
        return ejbRef.findProgramStudiByFakultas(param);
    }

    @WebMethod(operationName = "findMataKuliahByProgramStudi")
    public List<MataKuliah> findMataKuliahByProgramStudi(@WebParam(name = "param") int param) {
        return ejbRef.findMataKuliahByProgramStudi(param);
    }

    @WebMethod(operationName = "findFakultasByIdFak")
    public Fakultas findFakultasByIdFak(@WebParam(name = "param") int param) {
        return ejbRef.findFakultasByIdFak(param);
    }

    @WebMethod(operationName = "findProgramStudiByIdProg")
    public ProgramStudi findProgramStudiByIdProg(@WebParam(name = "param") int param) {
        return ejbRef.findProgramStudiByIdProg(param);
    }

    @WebMethod(operationName = "findMahasiswaByNIM")
    public Mahasiswa findMahasiswaByNIM(@WebParam(name = "param") String param) {
        return ejbRef.findMahasiswaByNIM(param);
    }

    @WebMethod(operationName = "findDosenWaliByNoReg")
    public DosenWali findDosenWaliByNoReg(@WebParam(name = "param") String param) {
        return ejbRef.findDosenWaliByNoReg(param);
    }

    @WebMethod(operationName = "findDosenWaliByNIP")
    public Dosen findDosenWaliByNIP(@WebParam(name = "param") String param) {
        return ejbRef.findDosenWaliByNIP(param);
    }

    @WebMethod(operationName = "findCekDosenWaliByNIP")
    public DosenWali findCekDosenWaliByNIP(@WebParam(name = "param") String param) {
        return ejbRef.findCekDosenWaliByNIP(param);
    }

    @WebMethod(operationName = "findSemesterActive")
    public Semester findSemesterActive() {
        return ejbRef.findSemesterActive();
    }

    @WebMethod(operationName = "findStatusBayarByNoReg")
    public List<StatusBayar> findStatusBayarByNoReg(@WebParam(name = "param") String param) {
        return ejbRef.findStatusBayarByNoReg(param);
    }

    @WebMethod(operationName = "findSemesterByidSemester")
    public Semester findSemesterByidSemester(@WebParam(name = "param") int param) {
        return ejbRef.findSemesterByidSemester(param);
    }

    @WebMethod(operationName = "findMataKuliahByidMK")
    public MataKuliah findMataKuliahByidMK(@WebParam(name = "param") String param) {
        return ejbRef.findMataKuliahByidMK(param);
    }

    @WebMethod(operationName = "findAllOpsi")
    public List<Opsi> findAllOpsi() {
        return ejbRef.findAllOpsi();
    }

    @WebMethod(operationName = "findMataKuliahByIdOpsi")
    public List<MataKuliah> findMataKuliahByIdOpsi(@WebParam(name = "param") int param) {
        return ejbRef.findMataKuliahByIdOpsi(param);
    }

    @WebMethod(operationName = "findMahasiswaWaliByNIP")
    public List<Mahasiswa> findMahasiswaWaliByNIP(@WebParam(name = "param") String param) {
        return ejbRef.findMahasiswaWaliByNIP(param);
    }

    @WebMethod(operationName = "findStatusBayarBySemesterDanNoReg")
    public StatusBayar findStatusBayarBySemesterDanNoReg(@WebParam(name = "param") int param, @WebParam(name = "param2") String param2) {
        return ejbRef.findStatusBayarBySemesterDanNoReg(param, param2);
    }
    
}
