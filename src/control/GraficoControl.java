/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static control.MunicipioControler.executavel;
import java.awt.Dimension;
import java.util.ArrayList;
import model.Municipio;
import model.atributosGrafico;
import model.dao.GraficoDAO;
import model.dao.MunicipioDAO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author mathe
 */
public class GraficoControl {
    String id;
    
    public GraficoControl(String id){
        this.id = id;
    }
    
    public CategoryDataset createDataSet(atributosGrafico atributo) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        
        dataset.addValue(atributo.getOrgJan(), "Janeiro", "");
        dataset.addValue(atributo.getOrgFev(),"Fevereiro", "");
        dataset.addValue(atributo.getOrgMar(),"Março", "");
        dataset.addValue(atributo.getOrgAbr(),"Abril", "");
        dataset.addValue(atributo.getOrgMai(),"Maio", "");
        dataset.addValue(atributo.getOrgJun(),"Junho", "");
        dataset.addValue(atributo.getOrgJul(),"Julho", "");
        dataset.addValue(atributo.getOrgAgo(),"Agosto", "");
        dataset.addValue(atributo.getOrgSet(),"Setembro", "");
        dataset.addValue(atributo.getOrgOut(),"Outubro", "");
        
        return dataset;
        
    }
    
    public JFreeChart createBarChart(CategoryDataset dataset){
        
        JFreeChart graficoBarras = ChartFactory.createBarChart(
                this.id, 
                "Meses", 
                "Quantidade em Toneladas", 
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false);
        
        return graficoBarras;
    
    }
    
    
    public ChartPanel criarGrafico(atributosGrafico atributo){
        CategoryDataset dataset = this.createDataSet(atributo);
        
        JFreeChart grafico = this.createBarChart(dataset);
        
        ChartPanel painelDoGrafico = new ChartPanel(grafico);
        
        painelDoGrafico.setPreferredSize(new Dimension(400,400));
        
        return painelDoGrafico;
    }
    
    
     public static atributosGrafico buscaBancoDeDados(String nome){
        GraficoDAO mdao = new GraficoDAO();
        atributosGrafico atributo = new atributosGrafico ();
        
        
        atributo = mdao.read(nome);
        
        return atributo;
       
    
    }
    
    
    
}
