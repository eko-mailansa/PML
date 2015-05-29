package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T06:09:33")
@StaticMetamodel(StatusBayar.class)
public class StatusBayar_ { 

    public static volatile SingularAttribute<StatusBayar, Integer> idStatusBayar;
    public static volatile SingularAttribute<StatusBayar, String> noReg;
    public static volatile SingularAttribute<StatusBayar, Boolean> statusAktif;
    public static volatile SingularAttribute<StatusBayar, Integer> idSemester;
    public static volatile SingularAttribute<StatusBayar, Boolean> statusDaftar;
    public static volatile SingularAttribute<StatusBayar, Date> tglBayar;
    public static volatile SingularAttribute<StatusBayar, Boolean> statusBayar;
    public static volatile SingularAttribute<StatusBayar, Double> jumBayar;

}