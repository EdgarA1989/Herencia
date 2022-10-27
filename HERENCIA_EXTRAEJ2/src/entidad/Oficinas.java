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
public class Oficinas extends Edificio{
    Scanner leer = new Scanner(System.in);
    private int cantidadoficinas;
    private int cantidadpersonas;
    private int pisos;

    public Oficinas(double ancho, double alto, double largo) {
        super(ancho, alto, largo);
    }

    public Oficinas(double ancho, double alto, double largo,int cantidadoficinas, int cantidadpersonas, int pisos) {
        super(ancho, alto, largo);
        this.cantidadoficinas = cantidadoficinas;
        this.cantidadpersonas = cantidadpersonas;
        this.pisos = pisos;
    }
    
  
    public int getCantidadoficinas() {
        return cantidadoficinas;
    }

    public void setCantidadoficinas(int cantidadoficinas) {
        this.cantidadoficinas = cantidadoficinas;
    }

    public int getCantidadpersonas() {
        return cantidadpersonas;
    }

    public void setCantidadpersonas(int cantidadpersonas) {
        this.cantidadpersonas = cantidadpersonas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
    public void completarOficinas(){
        System.out.println("Ingrese la cantidad de pisos del Edificio");
        pisos=(leer.nextInt());
        System.out.println("Ingrese la cantidad de oficinas del Edificio ");
        cantidadoficinas=(leer.nextInt());
        System.out.println("Ingrese la cantidad de personas que entran en cada oficina");
        cantidadpersonas=(leer.nextInt());
    }
   
    public void cantPersonas(){
        int cantidadpiso= cantidadpersonas*cantidadoficinas;
        System.out.println("Por piso entran " + cantidadpiso + " personas.");
        int cantidadtotal= cantidadpiso*pisos;
        System.out.println("En total en el edificio entran "+cantidadtotal+ " personas.");
    }
    @Override
    public void calcularSuperficie() {
        double superficie = ancho * largo;
        System.out.println("La superficie del Edificio de "+pisos+ " pisos es "+ superficie+"m2");
    }

    @Override
    public void calcularVolumen() {
        double volumen = ancho * largo * alto;
        System.out.println("El volumen del Edificio de "+pisos+ " pisos es "+ volumen+"m3");
    }

    @Override
    public String toString() {
        return "Oficinas{" + "cantidadoficinas=" + cantidadoficinas + ", cantidadpersonas=" + cantidadpersonas + ", pisos=" + pisos + '}';
    }
    
    
    
    
}
