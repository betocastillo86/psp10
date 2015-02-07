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
public class WebView {
    /***
     * Muestra los resultados de las pruebas que se le envien
     * @param listadoProbe 
     * @return  Html de la prueba
     */
    public String MostrarPROBE(LinkedList<MetodoPROBE> listadoProbe)
    {
        String html = "";
        //Muestra lso resultados de todos los procesos
        for (int i = 0; i < listadoProbe.size(); i++) {
            
            MetodoPROBE objProbe = listadoProbe.get(i);
            html += "<br><h1> Metodo probe No. "+(i+1)+"</h1>";
            
            //Muestra los valores de la lista 1 con que se calculo el proceso
            html += "<br> Valores Lista 1:";
            for (Double valorLista : objProbe.getLista1()) {
                html += "<br>- " + valorLista;
            }
            
            //Muestra los valores de la lista 2 con que se calculo el proceso
            html += "<br>Valores Lista 2:";
            
            for (Double valorLista : objProbe.getLista2()) {
                html += "<br>- " + valorLista;
            }
            
            //Muestra los resultados del calculo
            html += "<br>Resultados:";
            html += "<br>B0 ---> " + objProbe.getB0();
            html += "<br>Rxy ---> " + objProbe.getrXY();
            html += "<br>R2 ---> " + objProbe.getR2();
            html += "<br>Yk ---> " + objProbe.getyK();
            html += "<br>------------------------------------------------";
            html += "<br>------------------------------------------------";
        }
        
        //Retorna el html con el contenido
        return html;

    }
}
