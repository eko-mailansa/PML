package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.PendaftaranDetail;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T06:23:52")
@StaticMetamodel(Pendaftaran.class)
public class Pendaftaran_ { 

    public static volatile SingularAttribute<Pendaftaran, Integer> idSemester;
    public static volatile SingularAttribute<Pendaftaran, Float> nr;
    public static volatile SingularAttribute<Pendaftaran, Date> tglCetakKSM;
    public static volatile SingularAttribute<Pendaftaran, Integer> idDaftar;
    public static volatile SingularAttribute<Pendaftaran, Boolean> catakKSM;
    public static volatile ListAttribute<Pendaftaran, PendaftaranDetail> pendaftaranDetailList;
    public static volatile SingularAttribute<Pendaftaran, Boolean> statusApprove;
    public static volatile SingularAttribute<Pendaftaran, String> noReg;
    public static volatile SingularAttribute<Pendaftaran, Date> tglDaftar;
    public static volatile SingularAttribute<Pendaftaran, Date> tglStatusApprove;
    public static volatile SingularAttribute<Pendaftaran, String> comment;
    public static volatile SingularAttribute<Pendaftaran, Integer> jumSKS;
    public static volatile SingularAttribute<Pendaftaran, String> status;

}