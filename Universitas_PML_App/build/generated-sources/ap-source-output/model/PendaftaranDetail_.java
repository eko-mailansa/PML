package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Kelaspml;
import model.Pendaftaran;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T06:23:52")
@StaticMetamodel(PendaftaranDetail.class)
public class PendaftaranDetail_ { 

    public static volatile SingularAttribute<PendaftaranDetail, Integer> idDaftarDetail;
    public static volatile SingularAttribute<PendaftaranDetail, String> komen;
    public static volatile SingularAttribute<PendaftaranDetail, String> nilaiPS;
    public static volatile SingularAttribute<PendaftaranDetail, Float> nilai;
    public static volatile SingularAttribute<PendaftaranDetail, Integer> konfirmasiPS;
    public static volatile SingularAttribute<PendaftaranDetail, Integer> statusMK;
    public static volatile SingularAttribute<PendaftaranDetail, Kelaspml> idKelas;
    public static volatile SingularAttribute<PendaftaranDetail, Pendaftaran> idDaftar;

}