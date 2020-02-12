/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compaign.service;
import com.compaign.Entite.Proposition;
import com.compaign.Iservice.IServiceProposition;
import java.sql.SQLException;
import java.util.List;
import java.sql.*;
import com.compaign.Utils.DataBase;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Monta
 * 
 * 
 */


public class ServiceProposition implements IServiceProposition<Proposition> {
  private Connection con;
    private Statement ste;

     public ServiceProposition() {
        con = DataBase.getInstance().getConnection();
     } 
    
    
    @Override
    public void ajouterProp(Proposition t) throws SQLException {
     PreparedStatement pre=con.prepareStatement("INSERT INTO `swr`.`sugg` ( `id_sugg`, `id_cmp`, `detail`) VALUES ( ?, ?, ?);");
    pre.setInt(1, t.getId_prop());
    pre.setInt(2, t.getId_cmp());
    pre.setString(3, t.getDetails()); 
    pre.executeUpdate();
    }

    @Override
    public boolean deleteProp(Proposition t) throws SQLException {
  PreparedStatement pre=con.prepareStatement("DELETE FROM sugg WHERE id_sugg= ?");
       pre.setInt(1, t.getId_prop());
      if ( pre.executeUpdate()!=0)
      
      {return true; }
      else
        return false;
    }

    @Override
    public boolean updateProp(Proposition t) throws SQLException {
 PreparedStatement pre=con.prepareStatement("update sugg set detail = ?  WHERE id_sugg = ?");
   
    pre.setString(1, t.getDetails());
    pre.setDouble(2, t.getId_prop());
   
      if ( pre.executeUpdate()!=0)
      
      {return true; }
      else
        return false;
    }

    @Override
    public List<Proposition> readAllProp() throws SQLException {
       List<Proposition> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from sugg");
     while (rs.next()) {  
        
                int idProp=rs.getInt(1);
                int idCmp=rs.getInt(2);
                String desc=rs.getString(3);
                Proposition p= new Proposition(idProp,idCmp,desc);
          
     arr.add(p);
     }
    return arr; 
    }
    
       @Override
    public List<Proposition> triMaxDetail() throws SQLException {
       List<Proposition> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from sugg order by MAX(LEN(detail))");
     while (rs.next()) {  
        
                int idProp=rs.getInt(1);
                int idCmp=rs.getInt(2);
                String desc=rs.getString(3);
                Proposition p= new Proposition(idProp,idCmp,desc);
          
     arr.add(p);
     }
    return arr; 
    }
    
    
}
