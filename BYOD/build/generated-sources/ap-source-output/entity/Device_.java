package entity;

import entity.DevicePK;
import entity.Employee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-08-14T18:37:11")
@StaticMetamodel(Device.class)
public class Device_ { 

    public static volatile SingularAttribute<Device, Date> dateRegistered;
    public static volatile SingularAttribute<Device, String> model;
    public static volatile SingularAttribute<Device, DevicePK> devicePK;
    public static volatile SingularAttribute<Device, String> make;
    public static volatile SingularAttribute<Device, Employee> employeeempID;

}