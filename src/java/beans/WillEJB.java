/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Usuario;
import entities.Batalla;
import entities.Ruler;
import entities.Cartas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author X6095888Z
 */
@Stateless
public class WillEJB {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceUnit
    EntityManagerFactory emf;

    public boolean insertarUsuario(Usuario t) {
        if (!existeUsuario(t)) {
            EntityManager em = emf.createEntityManager();
            em.persist(t);
            em.close();
            return true;
        }
        return false;
    }

    public boolean existeUsuario(Usuario t) {
        EntityManager em = emf.createEntityManager();
        Usuario usuarioEncontrado = em.find(Usuario.class, t.getNombre());
        em.close();
        return usuarioEncontrado != null;
    }
    
    
}
