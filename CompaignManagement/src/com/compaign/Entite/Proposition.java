/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compaign.Entite;

/**
 *
 * @author Monta
 */
public class Proposition {
    private int id_prop;
    private int id_cmp;
    private String details; 

    public Proposition(int id_prop) {
        this.id_prop = id_prop;
    }

    public Proposition(String details) {
        this.details = details;
    }

    public Proposition() {
    }

    public Proposition(int id_prop, int id_cmp, String details) {
        this.id_prop = id_prop;
        this.id_cmp = id_cmp;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Proposition{" + "id_prop=" + id_prop + ", id_cmp=" + id_cmp + ", details=" + details + '}';
    }

    public int getId_prop() {
        return id_prop;
    }

    public void setId_prop(int id_prop) {
        this.id_prop = id_prop;
    }

    public int getId_cmp() {
        return id_cmp;
    }

    public void setId_cmp(int id_cmp) {
        this.id_cmp = id_cmp;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
