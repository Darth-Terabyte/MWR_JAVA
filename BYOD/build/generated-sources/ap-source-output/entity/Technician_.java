package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-08-14T18:37:11")
@StaticMetamodel(Technician.class)
public class Technician_ { 

    public static volatile SingularAttribute<Technician, Date> dateRegistered;
    public static volatile SingularAttribute<Technician, Integer> technicianID;
    public static volatile SingularAttribute<Technician, Boolean> admin;
    public static volatile SingularAttribute<Technician, String> userName;
    public static volatile SingularAttribute<Technician, String> employeeCode;
    public static volatile SingularAttribute<Technician, String> password;
    public static volatile SingularAttribute<Technician, byte[]> photo;

}