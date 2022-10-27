/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_extraej1;

import entidad.Alquiler;
import entidad.Barco;
import entidad.Motor;
import entidad.Velero;
import entidad.Yate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class HERENCIA_EXTRAEJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Barco> listabarcos = new ArrayList();
        Barco velero1 = new Velero(2, 206, 12, 2008);
        listabarcos.add(velero1);
        Barco motor1 = new Motor(100, 207, 6, 2012);
        listabarcos.add(motor1);
        Barco yate1 = new Yate(14, 200, 208, 12, 2019);
        listabarcos.add(yate1);

        Alquiler cliente1 = new Alquiler("Edgar", 34156411, null, null, 12, elegirBarco(listabarcos));
        
        
        cliente1.calcularAlquiler();
        
        System.out.println(cliente1.toString());
        
    }

    public static Barco elegirBarco(ArrayList<Barco> listabarcos) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < listabarcos.size(); i++) {
            System.out.println((i + 1) + "-" + listabarcos.get(i));

        }
        System.out.println("Elija que barco desea");
        int opcion = leer.nextInt();
        return listabarcos.get(opcion-1);
    }
}
