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
public class Velero extends Barco{

private Integer mastiles;

    public Velero() {
    }



    public Velero(Integer mastiles, Integer matricula, Integer eslora, Integer año) {
        super(matricula, eslora, año);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }
     
    
//    @Override
//    public String toString() {
//        return "Velero{" + "mastiles=" + mastiles + '}';
//    }
    @Override
    public String toString() {
       
        return "Barco:"+" Velero"+ " Mastiles=" +mastiles + " Matricula=" + matricula + " Eslora=" + eslora + " a\u00f1o=" + año + '}';
    }

    
    @Override
    public double valorBarco() {
        
       return (eslora*10)+mastiles;
    }


}
