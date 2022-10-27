/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import interfaces.CalculosFormas;

/**
 *
 * @author EANDRADA
 */
public class Rectangulo implements CalculosFormas{
    private double altura;
    private double base;


    public Rectangulo(double altura, double base) {
       
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El calculo del perimetro es " + altura*2 + base*2);
    }

    @Override
    public void calcularArea() {
        System.out.println("El calculo del area es " + base * altura);
    }


}
