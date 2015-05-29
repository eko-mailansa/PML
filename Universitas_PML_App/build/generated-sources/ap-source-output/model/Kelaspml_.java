package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Openmkpml;
import model.PendaftaranDetail;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T05:59:11")
@StaticMetamodel(Kelaspml.class)
public class Kelaspml_ { 

    public static volatile SingularAttribute<Kelaspml, Integer> min;
    public static volatile SingularAttribute<Kelaspml, Integer> max;
    public static volatile SingularAttribute<Kelaspml, Openmkpml> idOpenMKPML;
    public static volatile SingularAttribute<Kelaspml, Integer> kelas;
    public static volatile SingularAttribute<Kelaspml, Integer> idKelas;
    public static volatile SingularAttribute<Kelaspml, Boolean> isActive;
    public static volatile ListAttribute<Kelaspml, PendaftaranDetail> pendaftaranDetailList;

}