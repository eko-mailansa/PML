/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import javax.xml.ws.WebServiceRef;
import service.Fakultas;
import service.MDMService_Service;
import service.MataKuliah;
import service.ProgramStudi;

/**
 *
 * @author Home
 */
@SessionScoped
@Named("kurikulumBean")
public class KurikulumBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MDMService/MDMService.wsdl")
    private MDMService_Service service;

    private int idFak;
    private int idProg;
    private List<Fakultas> fakultasList;
    private List<ProgramStudi> programStudiList;
    private List<MataKuliah> mataKuliahList;

    public KurikulumBean() {
    }

    public int getIdFak() {
        return idFak;
    }

    public void setIdFak(int idFak) {
        this.idFak = idFak;
    }

    public int getIdProg() {
        return idProg;
    }

    public void setIdProg(int idProg) {
        this.idProg = idProg;
    }

    public List<Fakultas> getFakultasList() {
        fakultasList = findAllFakultas();
        idFak = fakultasList.get(0).getIdFak();
        return fakultasList;
    }

    public List<ProgramStudi> getProgramStudiList() {
        programStudiList = findProgramStudiByFakultas(idFak);
        idProg = programStudiList.get(0).getIdProg();
        return programStudiList;
    }

    public void setProgramStudiList(List<ProgramStudi> programStudiList) {
        this.programStudiList = programStudiList;
    }

    public List<MataKuliah> getMataKuliahList() {
        mataKuliahList = findMataKuliahByProgramStudi(idProg);
        return mataKuliahList;
    }

    public void setMataKuliahList(List<MataKuliah> mataKuliahList) {
        this.mataKuliahList = mataKuliahList;
    }

    public void onRefreshClick() {
        idFak = 1;
    }

    private java.util.List<service.Fakultas> findAllFakultas() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findAllFakultas();
    }

    private java.util.List<service.ProgramStudi> findProgramStudiByFakultas(int param) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findProgramStudiByFakultas(param);
    }

    private java.util.List<service.MataKuliah> findMataKuliahByProgramStudi(int param) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findMataKuliahByProgramStudi(param);
    }
}
