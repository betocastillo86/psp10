/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp;

import edu.uniandes.ecos.utilidades.CalculosConListas;
import java.util.LinkedList;

/**
 *
 * @author VirtualW7
 */
public class MetodoPROBE {
    
    private double b0;
    private double b1;
    private double rXY;
    private double yK;
    private double xK;
    private LinkedList<Double> lista1;
    private LinkedList<Double> lista2;

    public LinkedList<Double> getLista1() 
    {
        return lista1;
    }

    public LinkedList<Double> getLista2() 
    {
        return lista2;
    }

    public double getB0() 
    {
        return b0;
    }

    public void setB0(double b0) 
    {
        this.b0 = b0;
    }

    public double getB1() 
    {
        return b1;
    }

    public void setB1(double b1) 
    {
        this.b1 = b1;
    }

    public double getrXY() 
    {
        return rXY;
    }

    public void setrXY(double rXY) 
    {
        this.rXY = rXY;
    }

    public double getyK() 
    {
        return yK;
    }

    public void setyK(double yK) 
    {
        this.yK = yK;
    }

    public double getxK() 
    {
        return xK;
    }

    public void setxK(double xK) 
    {
        this.xK = xK;
    }

    public double getR2() 
    {
        return this.rXY * this.rXY;
    }
    
    /****
     * Realiza el calculo de la regresión guardando los datos en B1 y B0
     * @param lista1
     * @param lista2 
     */
    private void CalcularRegresion(LinkedList<Double> lista1, LinkedList<Double> lista2)
    {
       //como la formula es compleja se calcula el coeficiente primero y despues el divisor
       double coeficienteB1 = CalculosConListas.SumatoriaMultiplicada(lista1, lista2) - (lista1.size() * CalculosConListas.CalcularPromedio(lista1) * CalculosConListas.CalcularPromedio(lista2)) ;
       double divisorB1 = CalculosConListas.SumatoriaAlCuadrado(lista1) - (lista1.size() * Math.pow(CalculosConListas.CalcularPromedio(lista1), 2) );
       this.b1 = coeficienteB1 / divisorB1;
       
       //Calcula el b0 con base del b1
       this.b0 = CalculosConListas.CalcularPromedio(lista2) - (this.b1 * CalculosConListas.CalcularPromedio(lista1));
       
       this.yK = this.b0 + (this.b1 * this.xK);
    }
    
    /*****
     * Calcula la correlacion y la asigna a la propiedad Rxy y R2
     * @param lista1
     * @param lista2 
     */
    private void CalcularCorrelacion(LinkedList<Double> lista1, LinkedList<Double> lista2)
    {
        int n = lista1.size();
        double coeficienteRxy = (n * CalculosConListas.SumatoriaMultiplicada(lista1, lista2)) - (CalculosConListas.Sumatoria(lista1) * CalculosConListas.Sumatoria(lista2));
        double divisorRxy = Math.sqrt(((n * CalculosConListas.SumatoriaAlCuadrado(lista1)) - Math.pow(CalculosConListas.Sumatoria(lista1),2)) * ((n * CalculosConListas.SumatoriaAlCuadrado(lista2)) - Math.pow(CalculosConListas.Sumatoria(lista2),2))       );
        this.rXY = coeficienteRxy/divisorRxy;
    }
    
    /***
     * Realiza los caclulos de regresion y correlacion
     * @param xK
     * @param lista1
     * @param lista2
     * @return true si pudo realizar el calculo, false si no puedo realizarlo
     */
    public boolean CalcularPROBE(double xK, LinkedList<Double> lista1, LinkedList<Double> lista2)
    {
        //Valida que las dos listas tengan el mismo tamaño
        if(lista1.size() == lista2.size() && xK > 0)
        {
            this.xK = xK;
            this.lista1 = lista1;
            this.lista2 = lista2;
            CalcularCorrelacion(lista1, lista2);
            CalcularRegresion(lista1, lista2);
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
