package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T05:59:11")
@StaticMetamodel(UserLogin.class)
public class UserLogin_ { 

    public static volatile SingularAttribute<UserLogin, Date> lastLogin;
    public static volatile SingularAttribute<UserLogin, String> password;
    public static volatile SingularAttribute<UserLogin, Integer> peran;
    public static volatile SingularAttribute<UserLogin, String> userName;
    public static volatile SingularAttribute<UserLogin, Boolean> isActive;

}