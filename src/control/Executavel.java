/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;
import view.*;
import model.Municipio;

/**
 *
 * @author mathe
 */
public class Executavel {
    
    public static FrmPrincipal formPrin;
    public static List<Municipio> municipios;
    
    public static void main(String[] args){
        
    municipios = new ArrayList<Municipio>();
    
    formPrin = new FrmPrincipal();
    formPrin.setVisible(true);
    
    
   
    
    }
    
}
