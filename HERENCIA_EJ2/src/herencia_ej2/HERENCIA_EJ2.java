/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ej2;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author EANDRADA
 */
public class HERENCIA_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        ArrayList<Electrodomestico> electrodomesticos= new ArrayList();
        
//      Electrodomestico lavadora = new Lavadora();
        Electrodomestico lavadora1 = new Lavadora(38, 1000, "rojo", "B", 8);
        electrodomesticos.add(lavadora1);
        Electrodomestico lavadora2 = new Lavadora(45, 1000, "gris", "C", 17);
        electrodomesticos.add(lavadora2);
        Electrodomestico televisor1 = new Televisor(48,true, 1000, "blanco", "D", 14);
        electrodomesticos.add(televisor1);
        Electrodomestico televisor2 = new Televisor(32,false, 1000, "gris", "B", 12);
        electrodomesticos.add(televisor2);
        int total=0;
        
        for (Electrodomestico aux : electrodomesticos) {
            
            aux.precioFinal();
            total= total +aux.getPrecio();
        }
        System.out.println("El total de todos los electrodomesticos es : $"+total);

//        lavadora.crearElectrodomestico();
//        lavadora.precioFinal();
//
//        Electrodomestico televisor = new Televisor();
//        televisor.crearElectrodomestico();
//        televisor.precioFinal();
    }

}
