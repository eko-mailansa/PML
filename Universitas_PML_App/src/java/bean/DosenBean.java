/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.xml.ws.WebServiceRef;
import service.*;

/**
 *
 * @author Home
 */
@SessionScoped
@Named("dosenBean")
public class DosenBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MDMService/MDMService.wsdl")
    private MDMService_Service service;
    private List<Dosen> myDosens;

    /**
     * Creates a new instance of DosenBean
     */
    private List<Dosen> myDosen;
    private List<Fakultas> myFakultas;
    private List<MataKuliah> myMatakuliah;

    private List<MyModel> xxx;
    private List<MyModel> xxx2;

    public DosenBean() {
        xxx = new ArrayList<>();
        xxx.add(new MyModel(1, "1"));
        xxx.add(new MyModel(2, "2"));
        xxx.add(new MyModel(3, "3"));
        xxx.add(new MyModel(4, "4"));
        xxx.add(new MyModel(5, "5"));
        myDosens = new ArrayList<>();
    }

    public List<MyModel> getXxx() {
        return xxx;
    }

    public List<MyModel> getXxx2() {
        return xxx2;
    }

    public void setXxx2(List<MyModel> xxx2) {
        this.xxx2 = xxx2;
    }

    public List<Dosen> getMyDosen() {
        myDosen = findAllDosen();
        System.out.println("Jumlah My Dosen" + myDosen.size());
        return myDosen;
    }

    public List<Fakultas> getMyFakultas() {
        myFakultas = findAllFakultas();
        System.out.println("Jumlah My Fakultas" + myFakultas.size());
        for (Fakultas f : myFakultas) {
            System.out.println(f.getIdFak());
        }
        return myFakultas;
    }

    public List<MataKuliah> getMyMatakuliah() {
        myMatakuliah = findMataKuliahByProgramStudi(135);
        System.out.println("Jumlah My Matakuliah" + myMatakuliah.size());
        for (MataKuliah mk : myMatakuliah) {
            System.out.println(mk.getIdMK());
        }
        return myMatakuliah;
    }

    private java.util.List<service.Dosen> findAllDosen() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findAllDosen();
    }

    private java.util.List<service.Fakultas> findAllFakultas() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findAllFakultas();
    }

    private java.util.List<service.MataKuliah> findMataKuliahByProgramStudi(int param) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findMataKuliahByProgramStudi(param);
    }

    public List<Dosen> getMyDosens() {
        return myDosens;
    }

    public void setMyDosens(List<Dosen> myDosens) {
        this.myDosens = myDosens;
    }

    public String out() {
        return "myDosen2";
    }
}
