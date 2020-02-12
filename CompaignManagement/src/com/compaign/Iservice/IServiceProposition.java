/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compaign.Iservice;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Monta
 */
public interface IServiceProposition <T> {
    
    
    void ajouterProp(T t) throws SQLException;
    boolean deleteProp(T t) throws SQLException;
    boolean updateProp(T t) throws SQLException;
    List<T> readAllProp() throws SQLException;  
    List<T> triMaxDetail() throws SQLException;
    
}
