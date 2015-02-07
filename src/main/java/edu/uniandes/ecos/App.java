package edu.uniandes.ecos;

import edu.uniandes.ecos.data.DataSourcePSP10;
import edu.uniandes.ecos.data.DataSourceResultadosPSP10;
import edu.uniandes.ecos.psp.MetodoPROBE;
import edu.uniandes.ecos.views.ConsolaView;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DataSourcePSP10 datos = new DataSourcePSP10();
        
        double xK = 386;
        
        LinkedList<MetodoPROBE> listaPruebas = new LinkedList<MetodoPROBE>();
        
        //Calcula la prueba 1
        MetodoPROBE test1 = new MetodoPROBE();
        test1.CalcularPROBE(xK, datos.getEstimatedProxy(), datos.getActualAddedModified());
        listaPruebas.add(test1);
        
        //Calcula la prueba 2
        MetodoPROBE test2 = new MetodoPROBE();
        test2.CalcularPROBE(xK, datos.getEstimatedProxy(), datos.getActualDevelopmentHours());
        listaPruebas.add(test2);
        
        //Calcula la prueba 3
        MetodoPROBE test3 = new MetodoPROBE();
        test3.CalcularPROBE(xK, datos.getPlanAddedModified(), datos.getActualAddedModified());
        listaPruebas.add(test3);
        
        //Calcula la prueba 4
        MetodoPROBE test4 = new MetodoPROBE();
        test4.CalcularPROBE(xK, datos.getPlanAddedModified(), datos.getActualDevelopmentHours());
        listaPruebas.add(test4);
        
        DataSourceResultadosPSP10 datosReales = new DataSourceResultadosPSP10();
        MetodoPROBE datosRealesPspLOC = new MetodoPROBE();
        datosRealesPspLOC.CalcularPROBE(112, datosReales.getPlanAddedModified(), datosReales.getActualAddedModified());
        listaPruebas.add(datosRealesPspLOC);
        
        MetodoPROBE datosRealesPspTiempo = new MetodoPROBE();
        datosRealesPspTiempo.CalcularPROBE(112, datosReales.getPlanAddedModified(), datosReales.getActualDevelopmentHours());
        listaPruebas.add(datosRealesPspTiempo);
        
        //Llama la vista y muestra los resultados
        ConsolaView vista = new ConsolaView();
        vista.MostrarPROBE(listaPruebas);
        
    }
}
