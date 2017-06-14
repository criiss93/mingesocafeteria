/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import project.entities.Products;

/**
 *
 * @author Niyaz-laptop
 */
@ManagedBean(name = "mailgctr")
@SessionScoped
public class mail implements Serializable {

    private String fromMail;
    private String username;
    private String password;
    private String toMail;
    private String subject;
    private String message; //Total
    private String message2; //cantidad de productos
    private String hora; // hora envio
    private String direccion; 
    private String mpago;

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMpago() {
        return mpago;
    }

    public void setMpago(String mpago) {
        this.mpago = mpago;
    }
 
    
    private List<Products> elementos = new ArrayList<>();

    public List<Products> getElementos() {
        return elementos;
    }

    public void setElementos(List<Products> elementos) {
        this.elementos = elementos;
    }

    public String getFromMail() {
        return fromMail;
    }

    public void setFromMail(String fromMail) {
        this.fromMail = fromMail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToMail() {
        return toMail;
    }

    public void setToMail(String toMail) {
        this.toMail = toMail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void send() {
        try {
            MailSender mailSender=new MailSender();
            mailSender.sendMail("cafeteria.mingeso@gmail.com", "cafeteria.mingeso@gmail.com", "cafeteriamingeso", "cristianlinerosm@gmail.com", "Detalle de orden", "Usted acaba de realizar una compra por: $"+message+". Su pedido será enviado a la dirección: "+direccion+" a las "+hora+" hrs. Método de pago: "+mpago+". Gracias por su compra.");
        } catch (Exception e) {
        }
    }
}
