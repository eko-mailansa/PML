
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindProgramStudiByIdProgResponse_QNAME = new QName("http://service/", "findProgramStudiByIdProgResponse");
    private final static QName _FindDosenWaliByNIP_QNAME = new QName("http://service/", "findDosenWaliByNIP");
    private final static QName _FindSemesterActiveResponse_QNAME = new QName("http://service/", "findSemesterActiveResponse");
    private final static QName _FindStatusBayarByNoReg_QNAME = new QName("http://service/", "findStatusBayarByNoReg");
    private final static QName _FindSemesterActive_QNAME = new QName("http://service/", "findSemesterActive");
    private final static QName _FindAllFakultas_QNAME = new QName("http://service/", "findAllFakultas");
    private final static QName _FindMahasiswaByNIMResponse_QNAME = new QName("http://service/", "findMahasiswaByNIMResponse");
    private final static QName _FindProgramStudiByFakultas_QNAME = new QName("http://service/", "findProgramStudiByFakultas");
    private final static QName _FindMahasiswaWaliByNIPResponse_QNAME = new QName("http://service/", "findMahasiswaWaliByNIPResponse");
    private final static QName _FindStatusBayarBySemesterDanNoReg_QNAME = new QName("http://service/", "findStatusBayarBySemesterDanNoReg");
    private final static QName _FindCekDosenWaliByNIP_QNAME = new QName("http://service/", "findCekDosenWaliByNIP");
    private final static QName _FindDosenWaliByNIPResponse_QNAME = new QName("http://service/", "findDosenWaliByNIPResponse");
    private final static QName _FindProgramStudiByFakultasResponse_QNAME = new QName("http://service/", "findProgramStudiByFakultasResponse");
    private final static QName _FindStatusBayarBySemesterDanNoRegResponse_QNAME = new QName("http://service/", "findStatusBayarBySemesterDanNoRegResponse");
    private final static QName _FindDosenWaliByNoRegResponse_QNAME = new QName("http://service/", "findDosenWaliByNoRegResponse");
    private final static QName _FindMataKuliahByProgramStudiResponse_QNAME = new QName("http://service/", "findMataKuliahByProgramStudiResponse");
    private final static QName _FindStatusBayarByNoRegResponse_QNAME = new QName("http://service/", "findStatusBayarByNoRegResponse");
    private final static QName _FindMahasiswaWaliByNIP_QNAME = new QName("http://service/", "findMahasiswaWaliByNIP");
    private final static QName _FindMataKuliahByIdOpsi_QNAME = new QName("http://service/", "findMataKuliahByIdOpsi");
    private final static QName _FindMataKuliahByidMK_QNAME = new QName("http://service/", "findMataKuliahByidMK");
    private final static QName _CreateDosen_QNAME = new QName("http://service/", "createDosen");
    private final static QName _FindAllDosen_QNAME = new QName("http://service/", "findAllDosen");
    private final static QName _FindMahasiswaByNIM_QNAME = new QName("http://service/", "findMahasiswaByNIM");
    private final static QName _FindProgramStudiByIdProg_QNAME = new QName("http://service/", "findProgramStudiByIdProg");
    private final static QName _FindSemesterByidSemesterResponse_QNAME = new QName("http://service/", "findSemesterByidSemesterResponse");
    private final static QName _FindCekDosenWaliByNIPResponse_QNAME = new QName("http://service/", "findCekDosenWaliByNIPResponse");
    private final static QName _FindMataKuliahByIdOpsiResponse_QNAME = new QName("http://service/", "findMataKuliahByIdOpsiResponse");
    private final static QName _FindAllOpsi_QNAME = new QName("http://service/", "findAllOpsi");
    private final static QName _FindFakultasByIdFak_QNAME = new QName("http://service/", "findFakultasByIdFak");
    private final static QName _FindSemesterByidSemester_QNAME = new QName("http://service/", "findSemesterByidSemester");
    private final static QName _FindDosenWaliByNoReg_QNAME = new QName("http://service/", "findDosenWaliByNoReg");
    private final static QName _FindMataKuliahByProgramStudi_QNAME = new QName("http://service/", "findMataKuliahByProgramStudi");
    private final static QName _FindAllOpsiResponse_QNAME = new QName("http://service/", "findAllOpsiResponse");
    private final static QName _FindAllFakultasResponse_QNAME = new QName("http://service/", "findAllFakultasResponse");
    private final static QName _FindAllDosenResponse_QNAME = new QName("http://service/", "findAllDosenResponse");
    private final static QName _FindMataKuliahByidMKResponse_QNAME = new QName("http://service/", "findMataKuliahByidMKResponse");
    private final static QName _FindFakultasByIdFakResponse_QNAME = new QName("http://service/", "findFakultasByIdFakResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindCekDosenWaliByNIPResponse }
     * 
     */
    public FindCekDosenWaliByNIPResponse createFindCekDosenWaliByNIPResponse() {
        return new FindCekDosenWaliByNIPResponse();
    }

    /**
     * Create an instance of {@link CreateDosen }
     * 
     */
    public CreateDosen createCreateDosen() {
        return new CreateDosen();
    }

    /**
     * Create an instance of {@link FindAllDosen }
     * 
     */
    public FindAllDosen createFindAllDosen() {
        return new FindAllDosen();
    }

    /**
     * Create an instance of {@link FindMahasiswaByNIM }
     * 
     */
    public FindMahasiswaByNIM createFindMahasiswaByNIM() {
        return new FindMahasiswaByNIM();
    }

    /**
     * Create an instance of {@link FindProgramStudiByIdProg }
     * 
     */
    public FindProgramStudiByIdProg createFindProgramStudiByIdProg() {
        return new FindProgramStudiByIdProg();
    }

    /**
     * Create an instance of {@link FindSemesterByidSemesterResponse }
     * 
     */
    public FindSemesterByidSemesterResponse createFindSemesterByidSemesterResponse() {
        return new FindSemesterByidSemesterResponse();
    }

    /**
     * Create an instance of {@link FindFakultasByIdFak }
     * 
     */
    public FindFakultasByIdFak createFindFakultasByIdFak() {
        return new FindFakultasByIdFak();
    }

    /**
     * Create an instance of {@link FindAllOpsi }
     * 
     */
    public FindAllOpsi createFindAllOpsi() {
        return new FindAllOpsi();
    }

    /**
     * Create an instance of {@link FindMataKuliahByIdOpsiResponse }
     * 
     */
    public FindMataKuliahByIdOpsiResponse createFindMataKuliahByIdOpsiResponse() {
        return new FindMataKuliahByIdOpsiResponse();
    }

    /**
     * Create an instance of {@link FindMataKuliahByProgramStudi }
     * 
     */
    public FindMataKuliahByProgramStudi createFindMataKuliahByProgramStudi() {
        return new FindMataKuliahByProgramStudi();
    }

    /**
     * Create an instance of {@link FindDosenWaliByNoReg }
     * 
     */
    public FindDosenWaliByNoReg createFindDosenWaliByNoReg() {
        return new FindDosenWaliByNoReg();
    }

    /**
     * Create an instance of {@link FindSemesterByidSemester }
     * 
     */
    public FindSemesterByidSemester createFindSemesterByidSemester() {
        return new FindSemesterByidSemester();
    }

    /**
     * Create an instance of {@link FindFakultasByIdFakResponse }
     * 
     */
    public FindFakultasByIdFakResponse createFindFakultasByIdFakResponse() {
        return new FindFakultasByIdFakResponse();
    }

    /**
     * Create an instance of {@link FindAllDosenResponse }
     * 
     */
    public FindAllDosenResponse createFindAllDosenResponse() {
        return new FindAllDosenResponse();
    }

    /**
     * Create an instance of {@link FindMataKuliahByidMKResponse }
     * 
     */
    public FindMataKuliahByidMKResponse createFindMataKuliahByidMKResponse() {
        return new FindMataKuliahByidMKResponse();
    }

    /**
     * Create an instance of {@link FindAllFakultasResponse }
     * 
     */
    public FindAllFakultasResponse createFindAllFakultasResponse() {
        return new FindAllFakultasResponse();
    }

    /**
     * Create an instance of {@link FindAllOpsiResponse }
     * 
     */
    public FindAllOpsiResponse createFindAllOpsiResponse() {
        return new FindAllOpsiResponse();
    }

    /**
     * Create an instance of {@link FindStatusBayarByNoReg }
     * 
     */
    public FindStatusBayarByNoReg createFindStatusBayarByNoReg() {
        return new FindStatusBayarByNoReg();
    }

    /**
     * Create an instance of {@link FindDosenWaliByNIP }
     * 
     */
    public FindDosenWaliByNIP createFindDosenWaliByNIP() {
        return new FindDosenWaliByNIP();
    }

    /**
     * Create an instance of {@link FindSemesterActiveResponse }
     * 
     */
    public FindSemesterActiveResponse createFindSemesterActiveResponse() {
        return new FindSemesterActiveResponse();
    }

    /**
     * Create an instance of {@link FindProgramStudiByIdProgResponse }
     * 
     */
    public FindProgramStudiByIdProgResponse createFindProgramStudiByIdProgResponse() {
        return new FindProgramStudiByIdProgResponse();
    }

    /**
     * Create an instance of {@link FindMahasiswaWaliByNIPResponse }
     * 
     */
    public FindMahasiswaWaliByNIPResponse createFindMahasiswaWaliByNIPResponse() {
        return new FindMahasiswaWaliByNIPResponse();
    }

    /**
     * Create an instance of {@link FindAllFakultas }
     * 
     */
    public FindAllFakultas createFindAllFakultas() {
        return new FindAllFakultas();
    }

    /**
     * Create an instance of {@link FindMahasiswaByNIMResponse }
     * 
     */
    public FindMahasiswaByNIMResponse createFindMahasiswaByNIMResponse() {
        return new FindMahasiswaByNIMResponse();
    }

    /**
     * Create an instance of {@link FindProgramStudiByFakultas }
     * 
     */
    public FindProgramStudiByFakultas createFindProgramStudiByFakultas() {
        return new FindProgramStudiByFakultas();
    }

    /**
     * Create an instance of {@link FindSemesterActive }
     * 
     */
    public FindSemesterActive createFindSemesterActive() {
        return new FindSemesterActive();
    }

    /**
     * Create an instance of {@link FindCekDosenWaliByNIP }
     * 
     */
    public FindCekDosenWaliByNIP createFindCekDosenWaliByNIP() {
        return new FindCekDosenWaliByNIP();
    }

    /**
     * Create an instance of {@link FindStatusBayarBySemesterDanNoReg }
     * 
     */
    public FindStatusBayarBySemesterDanNoReg createFindStatusBayarBySemesterDanNoReg() {
        return new FindStatusBayarBySemesterDanNoReg();
    }

    /**
     * Create an instance of {@link FindMataKuliahByidMK }
     * 
     */
    public FindMataKuliahByidMK createFindMataKuliahByidMK() {
        return new FindMataKuliahByidMK();
    }

    /**
     * Create an instance of {@link FindMahasiswaWaliByNIP }
     * 
     */
    public FindMahasiswaWaliByNIP createFindMahasiswaWaliByNIP() {
        return new FindMahasiswaWaliByNIP();
    }

    /**
     * Create an instance of {@link FindMataKuliahByIdOpsi }
     * 
     */
    public FindMataKuliahByIdOpsi createFindMataKuliahByIdOpsi() {
        return new FindMataKuliahByIdOpsi();
    }

    /**
     * Create an instance of {@link FindMataKuliahByProgramStudiResponse }
     * 
     */
    public FindMataKuliahByProgramStudiResponse createFindMataKuliahByProgramStudiResponse() {
        return new FindMataKuliahByProgramStudiResponse();
    }

    /**
     * Create an instance of {@link FindStatusBayarByNoRegResponse }
     * 
     */
    public FindStatusBayarByNoRegResponse createFindStatusBayarByNoRegResponse() {
        return new FindStatusBayarByNoRegResponse();
    }

    /**
     * Create an instance of {@link FindDosenWaliByNoRegResponse }
     * 
     */
    public FindDosenWaliByNoRegResponse createFindDosenWaliByNoRegResponse() {
        return new FindDosenWaliByNoRegResponse();
    }

    /**
     * Create an instance of {@link FindProgramStudiByFakultasResponse }
     * 
     */
    public FindProgramStudiByFakultasResponse createFindProgramStudiByFakultasResponse() {
        return new FindProgramStudiByFakultasResponse();
    }

    /**
     * Create an instance of {@link FindStatusBayarBySemesterDanNoRegResponse }
     * 
     */
    public FindStatusBayarBySemesterDanNoRegResponse createFindStatusBayarBySemesterDanNoRegResponse() {
        return new FindStatusBayarBySemesterDanNoRegResponse();
    }

    /**
     * Create an instance of {@link FindDosenWaliByNIPResponse }
     * 
     */
    public FindDosenWaliByNIPResponse createFindDosenWaliByNIPResponse() {
        return new FindDosenWaliByNIPResponse();
    }

    /**
     * Create an instance of {@link Opsi }
     * 
     */
    public Opsi createOpsi() {
        return new Opsi();
    }

    /**
     * Create an instance of {@link DosenWali }
     * 
     */
    public DosenWali createDosenWali() {
        return new DosenWali();
    }

    /**
     * Create an instance of {@link Dosen }
     * 
     */
    public Dosen createDosen() {
        return new Dosen();
    }

    /**
     * Create an instance of {@link ProgramStudi }
     * 
     */
    public ProgramStudi createProgramStudi() {
        return new ProgramStudi();
    }

    /**
     * Create an instance of {@link Fakultas }
     * 
     */
    public Fakultas createFakultas() {
        return new Fakultas();
    }

    /**
     * Create an instance of {@link Mahasiswa }
     * 
     */
    public Mahasiswa createMahasiswa() {
        return new Mahasiswa();
    }

    /**
     * Create an instance of {@link StatusBayar }
     * 
     */
    public StatusBayar createStatusBayar() {
        return new StatusBayar();
    }

    /**
     * Create an instance of {@link MataKuliah }
     * 
     */
    public MataKuliah createMataKuliah() {
        return new MataKuliah();
    }

    /**
     * Create an instance of {@link Semester }
     * 
     */
    public Semester createSemester() {
        return new Semester();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProgramStudiByIdProgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findProgramStudiByIdProgResponse")
    public JAXBElement<FindProgramStudiByIdProgResponse> createFindProgramStudiByIdProgResponse(FindProgramStudiByIdProgResponse value) {
        return new JAXBElement<FindProgramStudiByIdProgResponse>(_FindProgramStudiByIdProgResponse_QNAME, FindProgramStudiByIdProgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDosenWaliByNIP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findDosenWaliByNIP")
    public JAXBElement<FindDosenWaliByNIP> createFindDosenWaliByNIP(FindDosenWaliByNIP value) {
        return new JAXBElement<FindDosenWaliByNIP>(_FindDosenWaliByNIP_QNAME, FindDosenWaliByNIP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSemesterActiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findSemesterActiveResponse")
    public JAXBElement<FindSemesterActiveResponse> createFindSemesterActiveResponse(FindSemesterActiveResponse value) {
        return new JAXBElement<FindSemesterActiveResponse>(_FindSemesterActiveResponse_QNAME, FindSemesterActiveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStatusBayarByNoReg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findStatusBayarByNoReg")
    public JAXBElement<FindStatusBayarByNoReg> createFindStatusBayarByNoReg(FindStatusBayarByNoReg value) {
        return new JAXBElement<FindStatusBayarByNoReg>(_FindStatusBayarByNoReg_QNAME, FindStatusBayarByNoReg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSemesterActive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findSemesterActive")
    public JAXBElement<FindSemesterActive> createFindSemesterActive(FindSemesterActive value) {
        return new JAXBElement<FindSemesterActive>(_FindSemesterActive_QNAME, FindSemesterActive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllFakultas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findAllFakultas")
    public JAXBElement<FindAllFakultas> createFindAllFakultas(FindAllFakultas value) {
        return new JAXBElement<FindAllFakultas>(_FindAllFakultas_QNAME, FindAllFakultas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMahasiswaByNIMResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findMahasiswaByNIMResponse")
    public JAXBElement<FindMahasiswaByNIMResponse> createFindMahasiswaByNIMResponse(FindMahasiswaByNIMResponse value) {
        return new JAXBElement<FindMahasiswaByNIMResponse>(_FindMahasiswaByNIMResponse_QNAME, FindMahasiswaByNIMResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProgramStudiByFakultas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findProgramStudiByFakultas")
    public JAXBElement<FindProgramStudiByFakultas> createFindProgramStudiByFakultas(FindProgramStudiByFakultas value) {
        return new JAXBElement<FindProgramStudiByFakultas>(_FindProgramStudiByFakultas_QNAME, FindProgramStudiByFakultas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMahasiswaWaliByNIPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findMahasiswaWaliByNIPResponse")
    public JAXBElement<FindMahasiswaWaliByNIPResponse> createFindMahasiswaWaliByNIPResponse(FindMahasiswaWaliByNIPResponse value) {
        return new JAXBElement<FindMahasiswaWaliByNIPResponse>(_FindMahasiswaWaliByNIPResponse_QNAME, FindMahasiswaWaliByNIPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStatusBayarBySemesterDanNoReg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findStatusBayarBySemesterDanNoReg")
    public JAXBElement<FindStatusBayarBySemesterDanNoReg> createFindStatusBayarBySemesterDanNoReg(FindStatusBayarBySemesterDanNoReg value) {
        return new JAXBElement<FindStatusBayarBySemesterDanNoReg>(_FindStatusBayarBySemesterDanNoReg_QNAME, FindStatusBayarBySemesterDanNoReg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCekDosenWaliByNIP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findCekDosenWaliByNIP")
    public JAXBElement<FindCekDosenWaliByNIP> createFindCekDosenWaliByNIP(FindCekDosenWaliByNIP value) {
        return new JAXBElement<FindCekDosenWaliByNIP>(_FindCekDosenWaliByNIP_QNAME, FindCekDosenWaliByNIP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDosenWaliByNIPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findDosenWaliByNIPResponse")
    public JAXBElement<FindDosenWaliByNIPResponse> createFindDosenWaliByNIPResponse(FindDosenWaliByNIPResponse value) {
        return new JAXBElement<FindDosenWaliByNIPResponse>(_FindDosenWaliByNIPResponse_QNAME, FindDosenWaliByNIPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProgramStudiByFakultasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findProgramStudiByFakultasResponse")
    public JAXBElement<FindProgramStudiByFakultasResponse> createFindProgramStudiByFakultasResponse(FindProgramStudiByFakultasResponse value) {
        return new JAXBElement<FindProgramStudiByFakultasResponse>(_FindProgramStudiByFakultasResponse_QNAME, FindProgramStudiByFakultasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStatusBayarBySemesterDanNoRegResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findStatusBayarBySemesterDanNoRegResponse")
    public JAXBElement<FindStatusBayarBySemesterDanNoRegResponse> createFindStatusBayarBySemesterDanNoRegResponse(FindStatusBayarBySemesterDanNoRegResponse value) {
        return new JAXBElement<FindStatusBayarBySemesterDanNoRegResponse>(_FindStatusBayarBySemesterDanNoRegResponse_QNAME, FindStatusBayarBySemesterDanNoRegResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDosenWaliByNoRegResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findDosenWaliByNoRegResponse")
    public JAXBElement<FindDosenWaliByNoRegResponse> createFindDosenWaliByNoRegResponse(FindDosenWaliByNoRegResponse value) {
        return new JAXBElement<FindDosenWaliByNoRegResponse>(_FindDosenWaliByNoRegResponse_QNAME, FindDosenWaliByNoRegResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMataKuliahByProgramStudiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findMataKuliahByProgramStudiResponse")
    public JAXBElement<FindMataKuliahByProgramStudiResponse> createFindMataKuliahByProgramStudiResponse(FindMataKuliahByProgramStudiResponse value) {
        return new JAXBElement<FindMataKuliahByProgramStudiResponse>(_FindMataKuliahByProgramStudiResponse_QNAME, FindMataKuliahByProgramStudiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStatusBayarByNoRegResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findStatusBayarByNoRegResponse")
    public JAXBElement<FindStatusBayarByNoRegResponse> createFindStatusBayarByNoRegResponse(FindStatusBayarByNoRegResponse value) {
        return new JAXBElement<FindStatusBayarByNoRegResponse>(_FindStatusBayarByNoRegResponse_QNAME, FindStatusBayarByNoRegResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMahasiswaWaliByNIP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findMahasiswaWaliByNIP")
    public JAXBElement<FindMahasiswaWaliByNIP> createFindMahasiswaWaliByNIP(FindMahasiswaWaliByNIP value) {
        return new JAXBElement<FindMahasiswaWaliByNIP>(_FindMahasiswaWaliByNIP_QNAME, FindMahasiswaWaliByNIP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMataKuliahByIdOpsi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findMataKuliahByIdOpsi")
    public JAXBElement<FindMataKuliahByIdOpsi> createFindMataKuliahByIdOpsi(FindMataKuliahByIdOpsi value) {
        return new JAXBElement<FindMataKuliahByIdOpsi>(_FindMataKuliahByIdOpsi_QNAME, FindMataKuliahByIdOpsi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMataKuliahByidMK }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findMataKuliahByidMK")
    public JAXBElement<FindMataKuliahByidMK> createFindMataKuliahByidMK(FindMataKuliahByidMK value) {
        return new JAXBElement<FindMataKuliahByidMK>(_FindMataKuliahByidMK_QNAME, FindMataKuliahByidMK.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDosen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "createDosen")
    public JAXBElement<CreateDosen> createCreateDosen(CreateDosen value) {
        return new JAXBElement<CreateDosen>(_CreateDosen_QNAME, CreateDosen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllDosen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findAllDosen")
    public JAXBElement<FindAllDosen> createFindAllDosen(FindAllDosen value) {
        return new JAXBElement<FindAllDosen>(_FindAllDosen_QNAME, FindAllDosen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMahasiswaByNIM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findMahasiswaByNIM")
    public JAXBElement<FindMahasiswaByNIM> createFindMahasiswaByNIM(FindMahasiswaByNIM value) {
        return new JAXBElement<FindMahasiswaByNIM>(_FindMahasiswaByNIM_QNAME, FindMahasiswaByNIM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProgramStudiByIdProg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findProgramStudiByIdProg")
    public JAXBElement<FindProgramStudiByIdProg> createFindProgramStudiByIdProg(FindProgramStudiByIdProg value) {
        return new JAXBElement<FindProgramStudiByIdProg>(_FindProgramStudiByIdProg_QNAME, FindProgramStudiByIdProg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSemesterByidSemesterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findSemesterByidSemesterResponse")
    public JAXBElement<FindSemesterByidSemesterResponse> createFindSemesterByidSemesterResponse(FindSemesterByidSemesterResponse value) {
        return new JAXBElement<FindSemesterByidSemesterResponse>(_FindSemesterByidSemesterResponse_QNAME, FindSemesterByidSemesterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCekDosenWaliByNIPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findCekDosenWaliByNIPResponse")
    public JAXBElement<FindCekDosenWaliByNIPResponse> createFindCekDosenWaliByNIPResponse(FindCekDosenWaliByNIPResponse value) {
        return new JAXBElement<FindCekDosenWaliByNIPResponse>(_FindCekDosenWaliByNIPResponse_QNAME, FindCekDosenWaliByNIPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMataKuliahByIdOpsiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findMataKuliahByIdOpsiResponse")
    public JAXBElement<FindMataKuliahByIdOpsiResponse> createFindMataKuliahByIdOpsiResponse(FindMataKuliahByIdOpsiResponse value) {
        return new JAXBElement<FindMataKuliahByIdOpsiResponse>(_FindMataKuliahByIdOpsiResponse_QNAME, FindMataKuliahByIdOpsiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllOpsi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findAllOpsi")
    public JAXBElement<FindAllOpsi> createFindAllOpsi(FindAllOpsi value) {
        return new JAXBElement<FindAllOpsi>(_FindAllOpsi_QNAME, FindAllOpsi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFakultasByIdFak }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findFakultasByIdFak")
    public JAXBElement<FindFakultasByIdFak> createFindFakultasByIdFak(FindFakultasByIdFak value) {
        return new JAXBElement<FindFakultasByIdFak>(_FindFakultasByIdFak_QNAME, FindFakultasByIdFak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSemesterByidSemester }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findSemesterByidSemester")
    public JAXBElement<FindSemesterByidSemester> createFindSemesterByidSemester(FindSemesterByidSemester value) {
        return new JAXBElement<FindSemesterByidSemester>(_FindSemesterByidSemester_QNAME, FindSemesterByidSemester.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDosenWaliByNoReg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findDosenWaliByNoReg")
    public JAXBElement<FindDosenWaliByNoReg> createFindDosenWaliByNoReg(FindDosenWaliByNoReg value) {
        return new JAXBElement<FindDosenWaliByNoReg>(_FindDosenWaliByNoReg_QNAME, FindDosenWaliByNoReg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMataKuliahByProgramStudi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findMataKuliahByProgramStudi")
    public JAXBElement<FindMataKuliahByProgramStudi> createFindMataKuliahByProgramStudi(FindMataKuliahByProgramStudi value) {
        return new JAXBElement<FindMataKuliahByProgramStudi>(_FindMataKuliahByProgramStudi_QNAME, FindMataKuliahByProgramStudi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllOpsiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findAllOpsiResponse")
    public JAXBElement<FindAllOpsiResponse> createFindAllOpsiResponse(FindAllOpsiResponse value) {
        return new JAXBElement<FindAllOpsiResponse>(_FindAllOpsiResponse_QNAME, FindAllOpsiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllFakultasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findAllFakultasResponse")
    public JAXBElement<FindAllFakultasResponse> createFindAllFakultasResponse(FindAllFakultasResponse value) {
        return new JAXBElement<FindAllFakultasResponse>(_FindAllFakultasResponse_QNAME, FindAllFakultasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllDosenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findAllDosenResponse")
    public JAXBElement<FindAllDosenResponse> createFindAllDosenResponse(FindAllDosenResponse value) {
        return new JAXBElement<FindAllDosenResponse>(_FindAllDosenResponse_QNAME, FindAllDosenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMataKuliahByidMKResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findMataKuliahByidMKResponse")
    public JAXBElement<FindMataKuliahByidMKResponse> createFindMataKuliahByidMKResponse(FindMataKuliahByidMKResponse value) {
        return new JAXBElement<FindMataKuliahByidMKResponse>(_FindMataKuliahByidMKResponse_QNAME, FindMataKuliahByidMKResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFakultasByIdFakResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "findFakultasByIdFakResponse")
    public JAXBElement<FindFakultasByIdFakResponse> createFindFakultasByIdFakResponse(FindFakultasByIdFakResponse value) {
        return new JAXBElement<FindFakultasByIdFakResponse>(_FindFakultasByIdFakResponse_QNAME, FindFakultasByIdFakResponse.class, null, value);
    }

}
