/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author thepu
 */
public class Residence {
    private StringProperty ciudad = new SimpleStringProperty();
    private String stciudad;
        private StringProperty calle = new SimpleStringProperty();

    public StringProperty getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad.set(ciudad);
    }
    public StringProperty getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle.set(calle);
    }
    

    public Residence(String ciudad, String calle) {
        this.ciudad.set(ciudad);
        this.calle.set(calle);
    }
    
     public Residence(String ciudad, String calle,String stciudad) {
        this.ciudad.set(ciudad);
        this.calle.set(calle);
        this.stciudad = stciudad;
    }
    
    public String laDireccion(){
        return (this.getCiudad().get()+" - "+this.getCalle().get());
    }

    public String getStciudad() {
        return stciudad;
    }

    public void setStciudad(String stciudad) {
        this.stciudad = stciudad;
    }
    
    
    
    
    
}
