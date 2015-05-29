package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T06:23:52")
@StaticMetamodel(Log.class)
public class Log_ { 

    public static volatile SingularAttribute<Log, String> keterangan;
    public static volatile SingularAttribute<Log, Date> tglLog;
    public static volatile SingularAttribute<Log, String> ipAddress;
    public static volatile SingularAttribute<Log, Integer> idLog;

}