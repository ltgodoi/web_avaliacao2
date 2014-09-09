/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if6ae.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author a743062
 */
public class JpaControle 
{
    private static final long serialVersionUID = 1L;
    
    protected static EntityManagerFactory emf = null;
    public JpaControle() {
    }

    public EntityManagerFactory getEMFactory() {
        if (emf == null)
            emf = Persistence.createEntityManagerFactory("projetoPU");
        return emf;
    }

    public EntityManager getEntityManager() {
        return getEMFactory().createEntityManager();
    }
    
}
