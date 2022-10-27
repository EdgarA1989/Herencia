/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ej1;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

/**
 *
 * @author EANDRADA
 */
public class HERENCIA_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.mostrarALimento();

        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.mostrarALimento();

        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.mostrarALimento();

        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.mostrarALimento();

    }

}
