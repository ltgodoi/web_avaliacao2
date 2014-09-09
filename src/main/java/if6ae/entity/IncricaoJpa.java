/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if6ae.entity;

import java.io.Serializable;
import javax.persistence.EntityManager;

/**
 *
 * @author a743062
 */
public class IncricaoJpa extends JpaControle implements Serializable
{
    //metodos findByNumero e findByCpf
    protected EntityManager em;
    
    public Object findByNumero(int numero) {
        try {
            em = this.getEntityManager();
            return em.find(numero);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public Object findByCpf(long cpf) {
        try {
            em = this.getEntityManager();
            return em.find(cpf);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}
