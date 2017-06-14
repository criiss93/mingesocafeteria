/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ejbs;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import project.entities.Products;

/**
 *
 * @author cristian
 */
@Stateless
public class Operations {
    @PersistenceContext(unitName = "mingesocafeteriaPU")
    private EntityManager em;

public List<Products> retrieveProducts(){
    return em.createQuery("SELECT p FROM Products p WHERE p.id ='7' or p.id=8 or p.id=9 or p.id=10 or p.id=11 or p.id=12 or p.id=13 or p.id=14 or p.id=15 or p.id=18 or p.id=16 or p.id=19").getResultList();
}
public List<Products> retrieveProducts2(){
    return em.createQuery("SELECT p FROM Products p WHERE p.id ='7' or p.id=8 or p.id=9 or p.id=10 or p.id=11 or p.id=12 or p.id=13 or p.id=14 or p.id=15 or p.id=18 or p.id=17 or p.id=21").getResultList();
}
public List<Products> retrieveProducts3(){
    return em.createQuery("SELECT p FROM Products p WHERE p.id ='7' or p.id=8 or p.id=9 or p.id=10 or p.id=11 or p.id=12 or p.id=13 or p.id=14 or p.id=15 or p.id=18 or p.id=20 or p.id=22").getResultList();
}
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
public int checkIfQueryExists(String query){
    List<Products> products = em.createQuery("SELECT p FROM Products p WHERE p.mark = :mark").setParameter("mark",query).getResultList();
   return products.size();
}

public Products returnProduct(String query){
    Products product = (Products)em.createQuery("SELECT p FROM Products p WHERE p.mark = :mark").setParameter("mark",query).getSingleResult();
    return product;
}

}
