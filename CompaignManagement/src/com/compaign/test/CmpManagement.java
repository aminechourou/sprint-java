/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compaign.test;
import com.compaign.Utils.DataBase;
import com.compaign.Entite.Compaign;
import com.compaign.service.ServiceCompaign;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Monta
 */
public class CmpManagement {
     
    
    
    public static void main(String[] args) {
    
    ServiceCompaign Ser =new ServiceCompaign ();
    Compaign C1=new Compaign ("MontaTesting",45,23,"url",3,4," Desc this test");
   
  //  Compaign C2=new Compaign (2);
   // Compaign C3=new Compaign (4,"Winter");
      
         try {
           //  boolean delete = Ser.delete(C2);
           // System.out.print(delete);   
             Ser.ajouterCmp(C1);
        //  boolean update = Ser.updateCmp(C1);
         // System.out.println(update);
             
          // String s1="sa";
          //   List<Compaign> list = Ser.rechercheAvCmp(s1);
           
        // System.out.println(list);
        } catch (SQLException ex) {
        System.out.println(ex);
        }
    
    }
}