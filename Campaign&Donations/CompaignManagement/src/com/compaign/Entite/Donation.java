/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compaign.Entite;
import java.sql.Time;
import java.util.Date;
/**
 *
 * @author Monta
 */
public class Donation {
    private int idDon ;
    private int idUs  ;
    private int idCmp ;
    private int monthly;
    private String mes;
    private int funds ;
    private double given;

    public int getIdDon() {
        return idDon;
    }

    public Donation() {
    }

    public void setIdDon(int idDon) {
        this.idDon = idDon;
    }

    public Donation(int idDon, int idUs, int idCmp) {
        this.idDon = idDon;
        this.idUs = idUs;
        this.idCmp = idCmp;
    }

    public Donation(int idDon, int idUs, int idCmp, int monthly) {
        this.idDon = idDon;
        this.idUs = idUs;
        this.idCmp = idCmp;
        this.monthly = monthly;
    }

    public int getIdUs() {
        return idUs;
    }

    public void setIdUs(int idUs) {
        this.idUs = idUs;
    }

    public int getIdCmp() {
        return idCmp;
    }

    public void setIdCmp(int idCmp) {
        this.idCmp = idCmp;
    }

    public int getMonthly() {
        return monthly;
    }

    public void setMonthly(int monthly) {
        this.monthly = monthly;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public double getGiven() {
        return given;
    }

    public void setGiven(double given) {
        this.given = given;
    }

    public int getAnnonym() {
        return annonym;
    }

    public void setAnnonym(int annonym) {
        this.annonym = annonym;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Time getTimeD() {
        return timeD;
    }

    public void setTimeD(Time timeD) {
        this.timeD = timeD;
    }
    private int annonym; 
    private Date dateD;
    private Time timeD;

    public Donation(int idDon, int idUs, int idCmp, int monthly, String mes, int funds, double given, int annonym, Date dateD, Time timeD) {
        this.idDon = idDon;
        this.idUs = idUs;
        this.idCmp = idCmp;
        this.monthly = monthly;
        this.mes = mes;
        this.funds = funds;
        this.given = given;
        this.annonym = annonym;
        this.dateD = dateD;
        this.timeD = timeD;
    }
    
    
    
}
