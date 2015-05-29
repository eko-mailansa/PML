package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Kelaspml;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T06:23:52")
@StaticMetamodel(Openmkpml.class)
public class Openmkpml_ { 

    public static volatile SingularAttribute<Openmkpml, String> kodeMK;
    public static volatile ListAttribute<Openmkpml, Kelaspml> kelaspmlList;
    public static volatile SingularAttribute<Openmkpml, Integer> idSemester;
    public static volatile SingularAttribute<Openmkpml, Integer> idOpenMKPML;
    public static volatile SingularAttribute<Openmkpml, Integer> idProdi;
    public static volatile SingularAttribute<Openmkpml, Boolean> isActive;

}