package entity;

import entity.Device;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2013-08-14T18:37:11")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Date> dateRegistered;
    public static volatile SingularAttribute<Employee, Integer> empID;
    public static volatile SingularAttribute<Employee, String> userName;
    public static volatile CollectionAttribute<Employee, Device> deviceCollection;
    public static volatile SingularAttribute<Employee, String> employeeCode;
    public static volatile SingularAttribute<Employee, String> password;

}