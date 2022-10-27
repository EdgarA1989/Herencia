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
public class Yate extends Motor{

    private Integer camarote;

    public Yate(Integer camarote, Integer cv, Integer matricula, Integer eslora, Integer año) {
        super(cv, matricula, eslora, año);
        this.camarote = camarote;
    }

    public Integer getCamarote() {
        return camarote;
    }

    public void setCamarote(Integer camarote) {
        this.camarote = camarote;
    }

    @Override
   public String toString() {
       
        return "Barco:"+" Yate"+ " CV=" +cv +" Camarote="+ camarote+ " Matricula=" + matricula + " Eslora=" + eslora + " a\u00f1o=" + año + '}';
    }
    
    
    
     @Override
    public double valorBarco() {
      
        return (eslora*10)+cv+camarote;
    }
   
}
