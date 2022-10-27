/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class Alquiler {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private Integer dni;
    private Date alquiler;
    private Date devolucion;
    private Integer posamarre;
    private Barco tipobarco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer dni, Date alquiler, Date devolucion, Integer posamarre, Barco tipobarco) {
        this.nombre = nombre;
        this.dni = dni;
        this.alquiler = alquiler;
        this.devolucion = devolucion;
        this.posamarre = posamarre;
        this.tipobarco = tipobarco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Date alquiler) {
        this.alquiler = alquiler;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    public Integer getPosamarre() {
        return posamarre;
    }

    public void setPosamarre(Integer posamarre) {
        this.posamarre = posamarre;
    }

    public Barco getTipobarco() {
        return tipobarco;
    }

    public void setTipobarco(Barco tipobarco) {
        this.tipobarco = tipobarco;
    }
    
    public void calcularAlquiler(){ //Con estas funciones de Date puedo calcular la fecha final segun los dias que ingrese, hace el calculo de la fecha actual y suma los dias indicados
        Date fecha = new Date();
        System.out.println("Ingrese la cantidad de días que va a alquilar el Barco");
        int cantidaddias= leer.nextInt();
        Calendar calendario= Calendar.getInstance(); //
//        calendario.setTime(alquiler);
        alquiler=fecha;
        calendario.add(Calendar.DAY_OF_YEAR,cantidaddias );
        devolucion= calendario.getTime();
        double valorfinal= tipobarco.valorBarco()*cantidaddias;
        System.out.println("El valor final de alquiler es : $"+valorfinal);
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", alquiler=" + alquiler + ", devolucion=" + devolucion + ", posamarre=" + posamarre + '}';
    }

   
    
}
