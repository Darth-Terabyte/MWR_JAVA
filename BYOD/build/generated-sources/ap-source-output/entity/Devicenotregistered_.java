package entity;

import entity.DevicenotregisteredPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-08-14T18:37:11")
@StaticMetamodel(Devicenotregistered.class)
public class Devicenotregistered_ { 

    public static volatile SingularAttribute<Devicenotregistered, Date> dateRegistered;
    public static volatile SingularAttribute<Devicenotregistered, String> model;
    public static volatile SingularAttribute<Devicenotregistered, String> username;
    public static volatile SingularAttribute<Devicenotregistered, DevicenotregisteredPK> devicenotregisteredPK;
    public static volatile SingularAttribute<Devicenotregistered, String> make;
    public static volatile SingularAttribute<Devicenotregistered, String> password;

}