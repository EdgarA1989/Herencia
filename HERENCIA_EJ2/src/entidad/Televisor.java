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
public class Televisor extends Electrodomestico{
    Scanner leer = new Scanner(System.in);
    private int pulgadas;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean tdt, int precio, String color, String consumoeenrgetico, int peso) {
        super(precio, color, consumoeenrgetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }


    @Override
    public void crearElectrodomestico() {
        int opcion=0;
       super.crearElectrodomestico();
        System.out.println("-Ingrese las pulgadas de la TV: ");
       this.pulgadas=leer.nextInt();
        while (opcion!=1 && opcion !=2){
        System.out.println("-Ingrese si posee sintonizador de TV");
        System.out.println("1-SI");
        System.out.println("2-NO");
        opcion= leer.nextInt();
        switch (opcion){
            case 1:
                this.tdt=true;
                break;
            case 2:
                this.tdt=false;
        }
        }
    }
    
    public void precioFinal(){
        super.precioFinal();
        if (this.pulgadas>40){
            precio= (int) (precio+(precio*0.3));
        }
        if (this.tdt=true){
            precio= precio+500;
        }
        System.out.println("El valor de la television es: ");
        System.out.println("$"+precio);
    }
   
}
