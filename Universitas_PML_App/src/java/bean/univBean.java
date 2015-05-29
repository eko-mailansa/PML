/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import control.KelaspmlFacade;
import control.OpenmkpmlFacade;
import control.PendaftaranFacade;
import control.SettingFacade;
import control.UserLoginFacade;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import model.Kelaspml;
import model.Openmkpml;
import model.Pendaftaran;
import model.PendaftaranDetail;
import model.Setting;
import model.UserLogin;
import org.primefaces.context.RequestContext;
import service.Dosen;
import service.DosenWali;
import service.Fakultas;
import service.MDMService_Service;
import service.Mahasiswa;
import service.MataKuliah;
import service.ProgramStudi;
import service.Semester;
import service.StatusBayar;

/**
 *
 * @author Home
 */
@SessionScoped
@Named("univBean")
public class univBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/MDMService/MDMService.wsdl")
    private MDMService_Service service;

    @EJB
    private UserLoginFacade loginSession;
    @EJB
    private PendaftaranFacade pendaftaranSession;
    @EJB
    private SettingFacade settingSession;
    @EJB
    private OpenmkpmlFacade openmkpmlSession;
    @EJB
    private KelaspmlFacade kelaspmlSession;

    private String username, password;
    private UserLogin userLogin;
    private Mahasiswa mahasiswa;
    private Fakultas fakMahasiswa;
    private ProgramStudi programStudi;
    private DosenWali dosenwali;
    private Dosen dosen;
    private List<StatusBayar> statusBayarMahasiswa;
    private Date serverDate;
    private List<Pendaftaran> myPendaftaran;
    private Pendaftaran myPendaftaranActive;
    private Semester semesterActive;
    private boolean renderRaport;
    private int grade;
    private Setting setting;

    //bukaPML
    private List<MataKuliah> listMKBuka;
    private List<MataKuliah> listMKPilih;
    private List<Openmkpml> listOpenPml;
    //daftarOpenPML
    private List<Kelaspml> daftarKelasPML;
    //pendaftaran
    private List<Openmkpml> listDaftar;
    private List<Openmkpml> myDaftar;
    private boolean cekBayar;
    //wali
    private List<Mahasiswa> listWali;
    private Pendaftaran pendaftaranWali;
    private Mahasiswa mahasiswaWali;

    public univBean() {
    }

    public String getUsername() {
        return username;
    }

    public boolean isCekBayar() {
        return cekBayar;
    }

    public void setCekBayar(boolean cekBayar) {
        this.cekBayar = cekBayar;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Kelaspml> getDaftarKelasPML() {
        daftarKelasPML = kelaspmlSession.findKelasPMLBySemesterDanProdi(semesterActive.getIdSemester(), programStudi.getIdProg());
        return daftarKelasPML;
    }

    public Mahasiswa getMahasiswaWali() {
        return mahasiswaWali;
    }

    public void setMahasiswaWali(Mahasiswa mahasiswaWali) {
        this.mahasiswaWali = mahasiswaWali;
    }

    public Pendaftaran getPendaftaranWali() {
        return pendaftaranWali;
    }

    public void setPendaftaranWali(Pendaftaran pendaftaranWali) {
        this.pendaftaranWali = pendaftaranWali;
    }

    public List<Openmkpml> getListDaftar() {
        listDaftar = openmkpmlSession.findOpenMKPMLByIDSemesterDanIDPrody(semesterActive.getIdSemester(), programStudi.getIdProg());
        return listDaftar;
    }

    public List<Mahasiswa> getListWali() {
        listWali = findMahasiswaWaliByNIP(dosen.getNip());
        return listWali;
    }

    public List<Openmkpml> getMyDaftar() {
        return myDaftar;
    }

    public void setMyDaftar(List<Openmkpml> myDaftar) {
        this.myDaftar = myDaftar;
    }

    public String getPassword() {
        return password;
    }

    public List<Openmkpml> getListOpenPml() {
        return listOpenPml;
    }

    public void setListOpenPml(List<Openmkpml> listOpenPml) {
        this.listOpenPml = listOpenPml;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Fakultas getFakMahasiswa() {
        return fakMahasiswa;
    }

    public void setFakMahasiswa(Fakultas fakMahasiswa) {
        this.fakMahasiswa = fakMahasiswa;
    }

    public ProgramStudi getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(ProgramStudi programStudi) {
        this.programStudi = programStudi;
    }

    public DosenWali getDosenwali() {
        return dosenwali;
    }

    public void setDosenwali(DosenWali dosenwali) {
        this.dosenwali = dosenwali;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public Date getServerDate() {
        serverDate = new Date();
        return serverDate;
    }

    public List<StatusBayar> getStatusBayarMahasiswa() {
        return statusBayarMahasiswa;
    }

    public void setStatusBayarMahasiswa(List<StatusBayar> statusBayarMahasiswa) {
        this.statusBayarMahasiswa = statusBayarMahasiswa;
    }

    public List<MataKuliah> getListMKPilih() {
        return listMKPilih;
    }

    public void setListMKPilih(List<MataKuliah> listMKPilih) {
        this.listMKPilih = listMKPilih;
    }

    public Setting getSetting() {
        setting = settingSession.find(1);
        return setting;
    }

    public List<Pendaftaran> getMyPendaftaran() {
        myPendaftaran = pendaftaranSession.findPendaftaranByNoReg(mahasiswa.getNoReg());
        return myPendaftaran;
    }

    public Semester getSemesterActive() {
        semesterActive = findSemesterActive();
        return semesterActive;
    }

    public void setSemesterActive(Semester semesterActive) {
        this.semesterActive = semesterActive;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Pendaftaran getMyPendaftaranActive() {
        Semester s = findSemesterActive();
        myPendaftaranActive = pendaftaranSession.findPendaftaranByNoRegDanIdSemester(mahasiswa.getNoReg(), s.getIdSemester());
        if (myPendaftaranActive == null) {
            myPendaftaranActive = pendaftaranSession.findPendaftaranByNoRegDanIdSemester(mahasiswa.getNoReg(), (s.getIdSemester() - 1));
        }
        return myPendaftaranActive;
    }

    public boolean isRenderRaport() {
        return renderRaport;
    }

    public void setRenderRaport(boolean renderRaport) {
        this.renderRaport = renderRaport;
    }

    public List<MataKuliah> getListMKBuka() {
        listMKBuka = findMataKuliahByProgramStudi(programStudi.getIdProg());
        return listMKBuka;
    }

    public String login() {
        userLogin = loginSession.findByLogin(username, password);
        if (userLogin != null) {
            if (userLogin.getIsActive()) {
                username = null;
                password = null;
                if (userLogin.getPeran() == 4) {
                    semesterActive = findSemesterActive();
                    userLogin.setPeranKu("Mahasiswa");
                    userLogin.setMenuKu("include/mahasiswa.xhtml");
                    mahasiswa = findMahasiswaByNIM(userLogin.getUserName());
                    programStudi = findProgramStudiByIdProg(mahasiswa.getIdProg());
                    statusBayarMahasiswa = findStatusBayarByNoReg(mahasiswa.getNoReg());
                    fakMahasiswa = findFakultasByIdFak(programStudi.getIdFak());
                    dosenwali = findDosenWaliByNoReg(mahasiswa.getNoReg());
                    dosen = findDosenWaliByNIP(dosenwali.getNip());
                    grade = Integer.parseInt(mahasiswa.getNim().substring(0, 1));
                    StatusBayar sb = findStatusBayarBySemesterDanNoReg(semesterActive.getIdSemester(), mahasiswa.getNoReg());
                    if (sb == null) {
                        cekBayar = false;
                    } else {
                        cekBayar = true;
                    }
                }
                if (userLogin.getPeran() == 1) {
                    dosen = findDosenWaliByNIP(userLogin.getUserName());
                    if (dosen.getPeran() == 1) {
                        userLogin.setPeranKu("Kepala Program Studi Sarjana");
                        userLogin.setMenuKu("include/kaprodi.xhtml");
                        programStudi = findProgramStudiByIdProg(135);
                    } else if (dosen.getPeran() == 2) {
                        userLogin.setPeranKu("Kepala Program Studi Magister");
                        userLogin.setMenuKu("include/kaprodi.xhtml");
                        programStudi = findProgramStudiByIdProg(235);
                    } else if (dosen.getPeran() == 3) {
                        userLogin.setPeranKu("Kepala Program Studi Doktor");
                        userLogin.setMenuKu("include/kaprodi.xhtml");
                        programStudi = findProgramStudiByIdProg(332);
                    } else {
                        dosenwali = findCekDosenWaliByNIP(dosen.getNip());
                        if (dosenwali == null) {
                            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Login failed."));
                            return "index";
                        } else {
                            userLogin.setPeranKu("Dosen");
                            userLogin.setMenuKu("include/dosen_wali.xhtml");
                        }
                    }
                }
                return "home?faces-redirect=true";//?faces-redirect=true
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Login failed."));
                return "index";
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Login failed."));
            return "index";
        }
    }

    public String logout() {
        userLogin = null;
        return "index?faces-redirect=true";
    }

    public String submitViewPML() {
        listOpenPml = new ArrayList<>();
        for (MataKuliah mk : listMKPilih) {
            Openmkpml omp = new Openmkpml();
            omp.setKodeMK(mk.getIdMK());
            omp.setIdSemester(semesterActive.getIdSemester());
            omp.setIdProdi(programStudi.getIdProg());
            omp.setMataKuliah(mk);
            omp.setIsActive(true);
            listOpenPml.add(omp);
        }
        return "kp_openpmlList?faces-redirect=true";
    }

    public String submitPML() {
        for (Openmkpml omp : listOpenPml) {
            List<Kelaspml> kelass = new ArrayList<>();
            for (int i = 0; i < omp.getJumKelas(); i++) {
                Kelaspml kp = new Kelaspml();
                kp.setKelas(i + 1);
                kp.setMax(omp.getJumBangku());
                kp.setMin(10);
                kp.setIsActive(true);
                kelass.add(kp);
            }
            omp.setKelaspmlList(kelass);
        }
        openmkpmlSession.saveOpenMKPML(listOpenPml);
        return "home?faces-redirect=true";
    }

    public String daftarPML() {
        Pendaftaran p = new Pendaftaran();
        p.setIdSemester(semesterActive.getIdSemester());
        p.setNoReg(mahasiswa.getNoReg());
        p.setTglDaftar(new Date());
        List<PendaftaranDetail> myDaftarDetail = new ArrayList<>();
        for (Openmkpml omp : myDaftar) {
            PendaftaranDetail pd = new PendaftaranDetail();
            pd.setIdKelas(omp.getKelaspmlList().get(0));
            pd.setStatusMK(0);
            myDaftarDetail.add(pd);
        }
        p.setPendaftaranDetailList(myDaftarDetail);
        pendaftaranSession.savePML(p);
        return "m_displayStatusMhs?faces-redirect=true";
    }

    public String viewWali(Mahasiswa m) {
        semesterActive = findSemesterActive();
        mahasiswaWali = m;
        programStudi = findProgramStudiByIdProg(mahasiswaWali.getIdProg());
        fakMahasiswa = findFakultasByIdFak(programStudi.getIdFak());
        pendaftaranWali = pendaftaranSession.findPendaftaranByNoRegDanIdSemester(m.getNoReg(), semesterActive.getIdSemester());
        return "dw_lookwali?faces-redirect=true";
    }

    public void saveWali() {
        pendaftaranSession.updatePML(pendaftaranWali);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success!", "Data Berhasil Disimpan."));
    }

    private Mahasiswa findMahasiswaByNIM(java.lang.String param) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findMahasiswaByNIM(param);
    }

    private ProgramStudi findProgramStudiByIdProg(int param) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findProgramStudiByIdProg(param);
    }

    private Fakultas findFakultasByIdFak(int param) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findFakultasByIdFak(param);
    }

    private java.util.List<service.StatusBayar> findStatusBayarByNoReg(java.lang.String param) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findStatusBayarByNoReg(param);
    }

    private Semester findSemesterActive() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findSemesterActive();
    }

    private java.util.List<service.MataKuliah> findMataKuliahByProgramStudi(int param) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findMataKuliahByProgramStudi(param);
    }

    private DosenWali findDosenWaliByNoReg(java.lang.String param) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findDosenWaliByNoReg(param);
    }

    private DosenWali findCekDosenWaliByNIP(java.lang.String param) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findCekDosenWaliByNIP(param);
    }

    private Dosen findDosenWaliByNIP(java.lang.String param) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findDosenWaliByNIP(param);
    }

    private java.util.List<service.Mahasiswa> findMahasiswaWaliByNIP(String param) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findMahasiswaWaliByNIP(param);
    }

    private StatusBayar findStatusBayarBySemesterDanNoReg(int param, java.lang.String param2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.MDMService port = service.getMDMServicePort();
        return port.findStatusBayarBySemesterDanNoReg(param, param2);
    }
}
