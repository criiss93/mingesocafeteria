/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.web;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import project.ejbs.Operations;
import project.entities.Products;

/**
 *
 * @author cristian
 */
@ManagedBean
@RequestScoped
public class index implements Serializable {
    @EJB
    private Operations operations;

    /**
     * Creates a new instance of index
     */
    private int ind = 0;

    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        this.ind = ind;
    }
    
    public index() {
    }
    public List<Products> getProducts(int i){
        if(i == 1){
            return operations.retrieveProducts();
        }else if(i==2){
            return operations.retrieveProducts2();          
        }else if(i==3){
            return operations.retrieveProducts3();       
        }else{
            return null;
        }
    }
}
