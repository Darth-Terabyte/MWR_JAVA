/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Device;
import entity.DevicePK;
import entity.Employee;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author madenem
 */
@Stateless
public class RegistrationManager {
    
    @PersistenceContext(unitName = "BYODPU")
    private EntityManager em;

public void addDevice(String make, String model, Employee emp, String mac, String uid, String serial)
{
   DevicePK pk = new DevicePK(mac,uid,serial);
   Device device = new Device(pk,make,model,new Date(),emp);
   em.persist(device);
}
    


}
