/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaabstraccion;

import helpers.IngenieriaComputacion;
import helpers.IngenieriaProduccion;

/**
 *
 * @author pc
 */
public class PracticaAbstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //instanciar las clases
    IngenieriaComputacion ic=new IngenieriaComputacion();
    IngenieriaProduccion ip=new IngenieriaProduccion();
   

   //imprimir facultades
    System.out.println(ic.getFacultad());
    System.out.println(ip.getFacultad());

// TODO code application logic here
    }
    
}
