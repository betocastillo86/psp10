/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.data;

import java.util.LinkedList;

/**
 *
 * @author VirtualW7
 */
public class DataSourcePSP10 {
    private LinkedList<Double> estimatedProxy;
    private LinkedList<Double> planAddedModified;
    private LinkedList<Double> actualAddedModified;
    private LinkedList<Double> actualDevelopmentHours;
    
    public DataSourcePSP10()
    {
        //Carga los valores de tamaño del proxy estimado
        this.estimatedProxy = new LinkedList<Double>();
        this.estimatedProxy.add(130d);
        this.estimatedProxy.add(650d);
        this.estimatedProxy.add(99d);
        this.estimatedProxy.add(150d);
        this.estimatedProxy.add(128d);
        this.estimatedProxy.add(302d);
        this.estimatedProxy.add(95d);
        this.estimatedProxy.add(945d);
        this.estimatedProxy.add(368d);
        this.estimatedProxy.add(961d);
        
        //lineas estimadas adicionadas y modificacdas
        this.planAddedModified = new LinkedList<Double>();
        this.planAddedModified.add(163d);
        this.planAddedModified.add(765d);
        this.planAddedModified.add(141d);
        this.planAddedModified.add(166d);
        this.planAddedModified.add(137d);
        this.planAddedModified.add(355d);
        this.planAddedModified.add(136d);
        this.planAddedModified.add(1206d);
        this.planAddedModified.add(433d);
        this.planAddedModified.add(1130d);
        
        //lineas reales adicionadas y modificacdas
        this.actualAddedModified = new LinkedList<Double>();
        this.actualAddedModified.add(186d);
        this.actualAddedModified.add(699d);
        this.actualAddedModified.add(132d);
        this.actualAddedModified.add(272d);
        this.actualAddedModified.add(291d);
        this.actualAddedModified.add(331d);
        this.actualAddedModified.add(199d);
        this.actualAddedModified.add(1890d);
        this.actualAddedModified.add(788d);
        this.actualAddedModified.add(1601d);
        
        //horas de desarrollo
        this.actualDevelopmentHours = new LinkedList<Double>();
        this.actualDevelopmentHours.add(15d);
        this.actualDevelopmentHours.add(69.9);
        this.actualDevelopmentHours.add(6.5);
        this.actualDevelopmentHours.add(22.4);
        this.actualDevelopmentHours.add(28.4);
        this.actualDevelopmentHours.add(65.9);
        this.actualDevelopmentHours.add(19.4);
        this.actualDevelopmentHours.add(198.7);
        this.actualDevelopmentHours.add(38.8);
        this.actualDevelopmentHours.add(138.2);
    }
    

    public LinkedList<Double> getEstimatedProxy() 
    {
        return estimatedProxy;
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
