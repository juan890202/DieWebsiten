package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
// This source file is generated by Oracle tools.
// Contents may be subject to change.
// For reporting problems, use the following:
// Generated by Oracle JDeveloper 11g Release 2 11.1.2.1.0.6081

public class WSPrincipalPortClient
{
  public static void main(String [] args) throws Exception
  {
      
      long timestamp = System.currentTimeMillis();
    WSPrincipal_Service wSPrincipal_Service = new WSPrincipal_Service();
    WSPrincipal wSPrincipal = wSPrincipal_Service.getWSPrincipalPort();
    
      String parametros = "{" +
                           //"\"tipo\": \"PAG\"," +
                           //"\"coleccion\": \"tiposTransacciones\"," +
                           " \"sitioweb\": \"miradorhumadea.com\"," +
                           "\"tipo\": \"SW\"," +
                           "\"basededatos\": \"diewebsiten\"," +
                           "\"tipotransaccion\": \"SELECT\"" +
                           "}";
      
      String parametros1 = "{" +
                           "\"coleccion\": \"tiposTransacciones\"," +
                           " \"sitioweb\": \"miradorhumadea.com\"," +
                           "\"tipo\": \"SW\"," +
                           "\"basededatos\": \"diewebsiten\"," +
                           "\"tipotransaccion\": \"SELECT\"" +
                           "}";
      
      
      
      ExecutorService ejecucionEventos = Executors.newFixedThreadPool(10);
      
      List<Future<String>> grupoEventos = new ArrayList<Future<String>>();
      
      
      for (Future<String> evento : grupoEventos) {
          System.out.println(evento.get());
      }
      
      
    
      System.out.println(wSPrincipal.puntoEntrada(null, null, "CargaInicialPaginaEventos", parametros));
      System.out.println(wSPrincipal.puntoEntrada(null, null, "ConsultarInfoSitioWeb", parametros));
      System.out.println(wSPrincipal.puntoEntrada(null, null, "ConsultarInfoBaseDeDatos", parametros));
      System.out.println(wSPrincipal.puntoEntrada(null, null, "CargaInicialPaginaEventos", parametros1));
      System.out.println(wSPrincipal.puntoEntrada(null, null, "ConsultarInfoSitioWeb", parametros1));
      System.out.println(wSPrincipal.puntoEntrada(null, null, "ConsultarInfoBaseDeDatos", parametros1));
      System.out.println(((System.currentTimeMillis() - timestamp) / 1000) + " seg.");
  }
}
