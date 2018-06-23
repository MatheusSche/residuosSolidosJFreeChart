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
import javax.swing.JOptionPane;
import model.Municipio;

/**
 *
 * @author mathe
 */
public class MunicipioDAO {
    public void create(Municipio m){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO municipios(id, municipio, pop_Total, pop_Rural)VALUES(?,?,?,?)");
            stmt.setString(1,m.getCodigoMunicipio());
            stmt.setString(2,m.getNome());
            stmt.setString(3,m.getPopTotal());
            stmt.setString(4,m.getPopUrbana());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo no banco de dados");
            
        } catch(SQLException ex) {
            Logger.getLogger(MunicipioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    
    }
    
    public List<Municipio> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Municipio> municipios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM municipios");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Municipio municipio = new Municipio();
                
                municipio.setCodigoMunicipio(rs.getString("id"));
                municipio.setNome(rs.getString("municipio"));
                municipio.setPopUrbana(rs.getString("pop_Total"));
                municipio.setPopTotal(rs.getString("pop_Rural"));
                
                municipios.add(municipio);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(MunicipioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        
        }
        
        return municipios;
    
    
    }
    
    public void update(Municipio m){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE municipios SET  municipio=?, pop_Total=?, pop_Rural=? WHERE id=?");
            stmt.setString(4,m.getCodigoMunicipio());
            stmt.setString(1,m.getNome());
            stmt.setString(2,m.getPopTotal());
            stmt.setString(3,m.getPopUrbana());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado no banco de dados");
            
        } catch(SQLException ex) {
            Logger.getLogger(MunicipioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    
    }
    
      public void excluir(Municipio m){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE from municipios WHERE id=?");
            stmt.setString(1,m.getCodigoMunicipio());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido no banco de dados");
            
        } catch(SQLException ex) {
            Logger.getLogger(MunicipioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    
    }
    
    
}
