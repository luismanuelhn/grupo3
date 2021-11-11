/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia
 */
public class Deportista extends Persona {
    private String diciplina;
    private int numeroDoral;
    
    public Deportista() {
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public int getNumeroDoral() {
        return numeroDoral;
    }

    public void setNumeroDoral(int numeroDoral) {
        this.numeroDoral = numeroDoral;
    }

    

    
    @Override
    public void verDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + getNombre() + "\nEdad: " + 
         getEdad() + "\nSexo: " + getSexo() + "\ndiciplina a participar" + getDiciplina()+ "\nNumero Asignado: " 
                + getNumeroDoral());
    }
}
