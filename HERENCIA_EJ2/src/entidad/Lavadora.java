/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public final class Lavadora extends Electrodomestico {
    Scanner leer = new Scanner(System.in);
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, String consumoeenrgetico, int peso) {
        super(precio, color, consumoeenrgetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }


   
    @Override
    public void crearElectrodomestico() {
        super.crearElectrodomestico();
        System.out.println("-Ingrese el valor de carga e KG de la Lavadora");
        this.carga= leer.nextInt(); 
        
    }
    
    public void precioFinal(){
        super.precioFinal();
        if (this.getCarga()>30){
            precio=precio+500;
        }
        System.out.println("-El valor de la lavadora es: ");
        System.out.println("$"+precio);
    }
     
}
