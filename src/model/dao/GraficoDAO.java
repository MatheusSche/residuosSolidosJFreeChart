/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connect.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Municipio;
import model.atributosGrafico;

/**
 *
 * @author mathe
 */
public class GraficoDAO {
    
    public atributosGrafico read(String nome){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        atributosGrafico atributo = new atributosGrafico ();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM dados_residuos_organicos WHERE municipio = ?");
            stmt.setString(1,nome);
            rs = stmt.executeQuery();
            
          while(rs.next()){
            System.out.println(rs.getString("municipio"));
            
       
            atributo.setNome(rs.getString("municipio"));
            atributo.setOrgJan(rs.getInt("janeiro"));
            atributo.setOrgFev(rs.getInt("fevereiro"));
            atributo.setOrgMar(rs.getInt("marco"));
            atributo.setOrgAbr(rs.getInt("abril"));
            atributo.setOrgMai(rs.getInt("maio"));
            atributo.setOrgJun(rs.getInt("junho"));
            atributo.setOrgJul(rs.getInt("julho"));
            atributo.setOrgAgo(rs.getInt("agosto"));
            atributo.setOrgSet(rs.getInt("setembro"));
            atributo.setOrgOut(rs.getInt("outubro"));
          }
        } catch (SQLException ex) {
            Logger.getLogger(MunicipioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        
        }
        
        return atributo;
    
    
    }
    
    
    
    
}
