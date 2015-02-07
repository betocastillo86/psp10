/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos;

import edu.uniandes.ecos.data.DataSourcePSP10;
import edu.uniandes.ecos.psp.MetodoPROBE;
import edu.uniandes.ecos.views.WebView;
import java.io.IOException;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 *
 * @author VirtualW7
 */
public class Main extends HttpServlet {
  
    public static void main(String[] args) 
            throws Exception {
    //Server server = new Server(8080);
    Server server = new Server(Integer.valueOf(System.getenv("PORT")));
    ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
    context.setContextPath("/");
    server.setHandler(context);
    context.addServlet(new ServletHolder(new Main()),"/*");
    server.start();
    server.join();
  }
    
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
        
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
      
        //Escribe el resultado en la respuesta
        WebView vista = new WebView();
        resp.getWriter().print( vista.MostrarPROBE(listaPruebas));
  }
}
