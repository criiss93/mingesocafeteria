/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.web;

import java.io.IOException;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import project.ejbs.Operations;
import project.entities.Products;

/**
 *
 * @author cristian
 */
@ManagedBean
@RequestScoped
public class product implements Serializable{
    @EJB
    private Operations operations;
    
    @ManagedProperty(value = "#{cart}")
    cart myCart;

    public cart getMyCart() {
        return myCart;
    }

    public void setMyCart(cart myCart) {
        this.myCart = myCart;
    }

    /**
     * Creates a new instance of product
     */
    public product() {
    }
    
    public String getQuery(){
        return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("query");
    }

    public void checkIfQueryExists() throws IOException{
        if(operations.checkIfQueryExists(getQuery()) == 0){
            FacesContext.getCurrentInstance().getExternalContext().redirect("error.xhtml");
        }
    }
    
    public Products getProduct(){
        return operations.returnProduct(getQuery());
    }
    
    public void addToCart(){
        String query = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("query");
        myCart.add(operations.returnProduct(query));
    }
}
