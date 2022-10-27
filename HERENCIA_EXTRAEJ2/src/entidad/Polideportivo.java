/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author EANDRADA
 */
public class Polideportivo extends Edificio{
    private String nombre;
    private boolean techado;

    public Polideportivo(double ancho, double alto, double largo, String Nombre, boolean techado ) {
        super(ancho, alto, largo);
        this.nombre = Nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public void calcularSuperficie() {
        double superficie = ancho * largo;
        System.out.println("La superficie del Polideportivo "+ nombre +" es " + superficie+"m2");
    }

    @Override
    public void calcularVolumen() {
        double volumen = ancho * largo * alto;
        System.out.println("El volumen del Polideportivo "+ nombre +" es " + volumen+"m3");
    }
    
    
}
