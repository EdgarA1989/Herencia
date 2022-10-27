/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_extraej2;

import entidad.Edificio;
import entidad.Oficinas;
import entidad.Polideportivo;
import java.util.ArrayList;


/**
 *
 * @author EANDRADA
 */
public class HERENCIA_EXTRAEJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //VARIABLES OBJETOS
        ArrayList<Edificio> listaedificios= new ArrayList();
        
      
        Oficinas edificio1 = new Oficinas(10,20,5);
        edificio1.completarOficinas();
        listaedificios.add(edificio1);
        
        Oficinas edificio2 = new Oficinas(20,10,5);
        edificio2.completarOficinas();
        listaedificios.add(edificio2);
        
        Polideportivo polideportivo1 = new Polideportivo(10,20,5, "SEC", true);
        listaedificios.add(polideportivo1);
        Polideportivo polideportivo2 = new Polideportivo(20,10,5, "ROTONDA", false);
        listaedificios.add(polideportivo2);
        
        for (Edificio aux : listaedificios) {
            if (aux instanceof Oficinas) {
                Oficinas object = (Oficinas) aux;
                  aux.calcularSuperficie();
                  aux.calcularVolumen();
                  ((Oficinas) aux).cantPersonas();
                  System.out.println("");
                  continue;
            }
              if (aux instanceof Polideportivo) {
                Polideportivo object = (Polideportivo) aux;
                System.out.println("");
                aux.calcularSuperficie();
                aux.calcularVolumen();
                if (((Polideportivo) aux).isTechado()==true){
                    System.out.println("El polideportivo " + ((Polideportivo) aux).getNombre()+ " es techado");
            }else{
                    System.out.println("El polideportivo "+ ((Polideportivo) aux).getNombre()+ " no es techado");
                }
                continue;
            }
        }

    }
    
}
