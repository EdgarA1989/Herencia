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
public abstract class Barco {
    protected Integer matricula;
    protected Integer eslora;
    protected Integer año;

    public Barco() {
    }

    public Barco(Integer matricula, Integer eslora, Integer año) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.año = año;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1o=" + año + '}';
    }
    
    
    public abstract double valorBarco();
}
