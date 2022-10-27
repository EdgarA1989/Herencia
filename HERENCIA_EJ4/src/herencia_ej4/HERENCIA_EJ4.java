/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ej4;

import entidad.Circulo;
import entidad.Rectangulo;

/**
 *
 * @author EANDRADA
 */
public class HERENCIA_EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangulo rectangulo1 = new Rectangulo(10,20);
       Circulo circulo1 = new Circulo(3);
       
       rectangulo1.calcularArea();
       rectangulo1.calcularPerimetro();
       circulo1.calcularArea();
       circulo1.calcularPerimetro();
       
    }
    
}
