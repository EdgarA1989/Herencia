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
public class Circulo implements CalculosFormas{
    private double radio;

    public Circulo(double radio) {
  
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    

   
   
    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del ciruclo es " + pi * radio);
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del circulo es " + (radio*radio)* pi );
    }

  


}
