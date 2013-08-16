/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Devicenotregistered;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author madenem
 */
@Stateless
public class DevicenotregisteredFacade extends AbstractFacade<Devicenotregistered> {
    @PersistenceContext(unitName = "BYODPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DevicenotregisteredFacade() {
        super(Devicenotregistered.class);
    }
    
}
