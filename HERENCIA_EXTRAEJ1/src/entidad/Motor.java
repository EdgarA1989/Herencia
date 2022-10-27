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
public class Motor extends Barco{
    
    protected Integer cv;

    public Motor() {
    }

    public Motor(Integer cv, Integer matricula, Integer eslora, Integer año) {
        super(matricula, eslora, año);
        this.cv = cv;
    }

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }

      @Override
    public String toString() {
       
        return "Barco:"+" Motor"+ " CV=" +cv + " Matricula=" + matricula + " Eslora=" + eslora + " a\u00f1o=" + año + '}';
    }
    
    @Override
    public double valorBarco() {
        return (eslora*10)+cv;
    }

  
    
}
