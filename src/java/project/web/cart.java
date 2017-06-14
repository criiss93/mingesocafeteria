/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import project.entities.Products;


/**
 *
 * @author cristian
 */
@ManagedBean
@SessionScoped
public class cart implements Serializable{

    private List<Products> products = new ArrayList<>();
    /**
     * Creates a new instance of cart
     */
    public cart() {
    }
    public int total = 0;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public void add(Products p){
        products.add(p);
        this.total = p.getPrice() + this.total;        
    }
    public void remove(Products p){
        products.remove(p);
        this.total = this.total - p.getPrice();
    }
    public int getCartCount(){
        return products.size();
    }
    public Map<Products, Integer> getCartContents(){
        Map<Products, Integer> cartContents = new HashMap<>();
        for(Products obj : products){
            if(cartContents.containsKey(obj)){
                cartContents.put(obj,cartContents.get(obj)+1);
            }else{
                cartContents.put(obj, 1);
            }
        } 
        return cartContents;
    
    }
    
             

    
}
