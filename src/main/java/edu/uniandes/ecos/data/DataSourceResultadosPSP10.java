/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.data;

import java.util.LinkedList;

/**
 *Clas e para realizar las pruebas y calculos de added y modified
 * @author VirtualW7
 */
public class DataSourceResultadosPSP10 {
    private LinkedList<Double> planAddedModified;
    private LinkedList<Double> actualAddedModified;
    private LinkedList<Double> actualDevelopmentHours;
    
    public DataSourceResultadosPSP10()
    {
        //lineas estimadas adicionadas y modificacdas
        this.planAddedModified = new LinkedList<Double>();
        this.planAddedModified.add(95d);
        this.planAddedModified.add(112d);
        
        //lineas reales adicionadas y modificacdas
        this.actualAddedModified = new LinkedList<Double>();
        this.actualAddedModified.add(195d);
        this.actualAddedModified.add(233d);
        
        //lineas reales adicionadas y modificacdas
        this.actualDevelopmentHours = new LinkedList<Double>();
        this.actualDevelopmentHours.add(445d);
        this.actualDevelopmentHours.add(452d);
    }
    



    public LinkedList<Double> getPlanAddedModified() 
    {
        return planAddedModified;
    }

    public LinkedList<Double> getActualAddedModified() 
    {
        return actualAddedModified;
    }
    
    public LinkedList<Double> getActualDevelopmentHours() 
    {
        return actualDevelopmentHours;
    }

}
