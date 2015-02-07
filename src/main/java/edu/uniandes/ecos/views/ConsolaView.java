/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.views;

import edu.uniandes.ecos.psp.MetodoPROBE;
import java.util.LinkedList;

/**
 *
 * @author VirtualW7
 */
public class ConsolaView {
    
    /***
     * Muestra los resultados de las pruebas que se le envien
     * @param listadoProbe 
     */
    public void MostrarPROBE(LinkedList<MetodoPROBE> listadoProbe)
    {
        //Muestra lso resultados de todos los procesos
        for (int i = 0; i < listadoProbe.size(); i++) {
            
            MetodoPROBE objProbe = listadoProbe.get(i);
            System.out.println("Metodo probe No. "+(i+1));
            
            //Muestra los valores de la lista 1 con que se calculo el proceso
            System.out.println("Valores Lista 1:");
            for (Double valorLista : objProbe.getLista1()) {
                System.out.println("- " + valorLista);
            }
            
            //Muestra los valores de la lista 2 con que se calculo el proceso
            System.out.println("Valores Lista 2:");
            for (Double valorLista : objProbe.getLista2()) {
                System.out.println("- " + valorLista);
            }
            
            //Muestra los resultados del calculo
            System.out.println("Resultados:");
            System.out.println("B0 ---> " + objProbe.getB0());
            System.out.println("B1 ---> " + objProbe.getB1());
            System.out.println("Rxy ---> " + objProbe.getrXY());
            System.out.println("R2 ---> " + objProbe.getR2());
            System.out.println("Yk ---> " + objProbe.getyK());
            System.out.println("------------------------------------------------");
            System.out.println("------------------------------------------------");
        }

    }
    
}
