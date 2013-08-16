/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Scanresults;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author madenem
 */
@Stateless
public class ScanManager {
    
    @PersistenceContext(unitName = "BYODPU")
    private EntityManager em;
    
    public void addScan(boolean rooted,boolean debug,boolean unknown,String apps)
    {
        Scanresults scan = new Scanresults(new Date(),rooted,debug,unknown,apps);
        em.persist(scan);
    }

}
