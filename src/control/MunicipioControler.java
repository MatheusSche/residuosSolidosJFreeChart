/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Municipio;
import javax.swing.table.DefaultTableModel;
import model.dao.MunicipioDAO;


/**
 *
 * @author mathe
 */
public class MunicipioControler {
    
    static Executavel executavel;
    
    public static void preencherTabela(JTable tabela, List<Municipio> lista) {
        
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        dtm.setRowCount(lista.size());
        tabela.setModel(dtm);
        
        int posLinha = 0;
        for (Municipio m1 : lista){
            tabela.setValueAt(m1.getCodigoMunicipio(), posLinha, 0);
            tabela.setValueAt(m1.getNome(), posLinha, 1);
            tabela.setValueAt(m1.getPopUrbana(), posLinha, 2);
            tabela.setValueAt(m1.getPopTotal(), posLinha, 3);
            posLinha++;
        }
        
    
    }
    
    public static void cadastrarMunicipio(String nome, String codigo, String popUrbana, String popTotal){
    
        Municipio m = new Municipio();
        m.setCodigoMunicipio(codigo);
        m.setNome(nome);
        m.setPopUrbana(popUrbana);
        m.setPopTotal(popTotal);
        executavel.municipios.add(m);
        
        JOptionPane.showMessageDialog(null, "Municipio Cadastrado com sucesso", "Sucesso", 1);
    
    }
    
    public static void armazenaBancoDeDados(String nome, String codigo, String popUrbana, String popTotal){
        Municipio m = new Municipio();
        MunicipioDAO dao = new MunicipioDAO();
        
        m.setCodigoMunicipio(codigo);
        m.setNome(nome);
        m.setPopUrbana(popUrbana);
        m.setPopTotal(popTotal);
        
        dao.create(m);
    }
    
    public static void buscaBancoDeDados(){
        MunicipioDAO mdao = new MunicipioDAO();
        
        
        for(Municipio m: mdao.read()){
            executavel.municipios.add(m);
        }
    
    }
    
    public static void editarMunicipio(String nome, String codigo, String popUrbana, String popTotal, int pos){
        Municipio m = new Municipio();
        MunicipioDAO mdao = new MunicipioDAO();
        
        m.setCodigoMunicipio(codigo);
        m.setNome(nome);
        m.setPopUrbana(popUrbana);
        m.setPopTotal(popTotal);
        executavel.municipios.set(pos, m);
        
        mdao.update(m);
        
        JOptionPane.showMessageDialog(null, "Municipio Editado com sucesso", "Sucesso", 1);
    
    
    }
    
    public static void excluirMunicipio(JTable tabela){
         MunicipioDAO mdao = new MunicipioDAO();
         Municipio m = new Municipio();
         
         m.setCodigoMunicipio((String)tabela.getValueAt(tabela.getSelectedRow(), 0));
        
        if(tabela.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um registro", "Erro", 0);
        
        } else {
            int reply = JOptionPane.showConfirmDialog(null, "Tem certeza?", "Excluir Municipio", JOptionPane.YES_NO_OPTION);
            if(reply==JOptionPane.YES_OPTION){
                executavel.municipios.remove(tabela.getSelectedRow());
                mdao.excluir(m);
                JOptionPane.showMessageDialog(null, "Municipio Excluída com Sucesso", "Sucesso", 1);
            }
        }
    
    }
    
}
