/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Device;
import entity.DevicePK;
import entity.Devicenotregistered;
import entity.DevicenotregisteredPK;
import entity.Employee;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.UserTransaction;

/**
 *
 * @author madenem
 */
@Stateless
public class RegistrationManager {
    
    @PersistenceContext(unitName = "BYODPU")
    private EntityManager em;

public void addDevice(String id)
{

//        Employee emp = result.get(0);
//        TypedQuery<Devicenotregistered> query2 = em.createNamedQuery("Devicenotregistered.findByIDNumber", Devicenotregistered.class);
//        List<Devicenotregistered> result2 = query2.getResultList();
//        Devicenotregistered oldDevice = result2.get(0);
//        DevicePK pk = new DevicePK(oldDevice.getDevicenotregisteredPK().getMACAdress(),oldDevice.getDevicenotregisteredPK().getAndroidID(),oldDevice.getDevicenotregisteredPK().getSerialNumber());
//        Device device = new Device(pk,oldDevice.getMake(),oldDevice.getModel(),new Date(),emp);
//        em.persist(device);
    
 
        TypedQuery<Devicenotregistered> query2 = em.createNamedQuery("Devicenotregistered.findByIDNumber", Devicenotregistered.class).setParameter("iDNumber",id);
        List<Devicenotregistered> result2 = query2.getResultList();
        Devicenotregistered oldDevice = result2.get(0);
        Employee emp = new Employee(oldDevice.getUsername(),oldDevice.getPassword(),new Date(),oldDevice.getName(), oldDevice.getSurname(),id);
        em.persist(emp);
        DevicePK pk = new DevicePK(oldDevice.getDevicenotregisteredPK().getMACAdress(),oldDevice.getDevicenotregisteredPK().getAndroidID(),oldDevice.getDevicenotregisteredPK().getSerialNumber());
        Device device = new Device(pk,oldDevice.getMake(),oldDevice.getModel(),new Date(),emp);
        em.persist(device);
    
   
}

public void addToList(String make, String model, String mac, String uid, String serial,String username,String password,String name,String surname,String id) throws NoSuchAlgorithmException
{
    String composite =mac+uid+serial;
    MessageDigest digester = MessageDigest.getInstance("MD5");
    byte[] hash = digester.digest(composite.getBytes());
    StringBuilder builder = new StringBuilder(2*hash.length);
    for (byte b : hash)
    {
        builder.append(String.format("%02x",b&0xff));
    }
    String hashkey = builder.toString();
	        int skip = Math.round((float)hashkey.length()/5);
	        int index = 0;
	        String token = "";
	        for (int i=0;i<5;i++)
	        {
	        	token += hashkey.charAt(index);
	        	index += skip;
	        }
    
   DevicenotregisteredPK pk = new DevicenotregisteredPK(mac,uid,serial);
   Devicenotregistered device = new Devicenotregistered(pk,make,model,new Date(),token,username,password,id,name,surname);
   em.persist(device);
}    




}
