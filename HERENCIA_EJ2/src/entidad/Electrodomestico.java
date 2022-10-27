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
public class Electrodomestico {

    protected int precio;
    protected String color;
    protected String consumoeenrgetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, String consumoeenrgetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoeenrgetico = consumoeenrgetico;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoeenrgetico() {
        return consumoeenrgetico;
    }

    public void setConsumoeenrgetico(String consumoeenrgetico) {
        this.consumoeenrgetico = consumoeenrgetico;
    }

    public String comprobarColor(String color) {
        while (color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
            return color;
        }
        return "blanco";
    }

    public String comprobarConsumoEnergetico(String letra) {
        while (letra.equals("A") || letra.equals("B") || letra.equals("C") || letra.equals("D") || letra.equals("E")) {
            return letra;
        }
        return letra;
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        this.precio = 1000;
        System.out.println("-Ingrese la letra que representa el consumo electrico:");
        this.consumoeenrgetico = comprobarConsumoEnergetico(leer.next());
        System.out.println("-Ingrese el color del producto:");
        this.color = comprobarColor(leer.next());
        System.out.println("-Ingrese el peso del producto");
        this.peso = leer.nextInt();
        
    }
    public void precioFinal() {
        int precioconsumo=0;
        int preciopeso=0;
        switch (this.getConsumoeenrgetico()){
            case "A":
                precioconsumo=1000;
                break;
            case "B":
                precioconsumo=800;
                break;
             case "C":
                precioconsumo=600;
                break;
            case "D":
                precioconsumo=500;
                break;    
             case "E":
                precioconsumo=300;
                break;
            case "F":
                precioconsumo=100;
                break;
        }
       if (this.getPeso()>0 && this.getPeso()<20){
           preciopeso=100;
       }else if (this.getPeso()>19 && this.getPeso()<50){
           preciopeso=500;
       }else if (this.getPeso()>49 && this.getPeso()<80){
           preciopeso=800;
       }else if (this.getPeso()>79){
           preciopeso=800;
       }
       this.precio= 1000+preciopeso+precioconsumo;
    }
    
}
