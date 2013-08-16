/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Scanresults;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author madenem
 */
@Stateless
public class ScanresultsFacade extends AbstractFacade<Scanresults> {
    @PersistenceContext(unitName = "BYODPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ScanresultsFacade() {
        super(Scanresults.class);
    }
    
}
