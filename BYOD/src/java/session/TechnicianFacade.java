/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Technician;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author madenem
 */
@Stateless
public class TechnicianFacade extends AbstractFacade<Technician> {
    @PersistenceContext(unitName = "BYODPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TechnicianFacade() {
        super(Technician.class);
    }
    
}
