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
public class Doctor extends Persona {
    private double salario;
    private String estadoCivil,especialidad;

    public Doctor() {
    }

    
    
    
   
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = (salario<0.0)?0.0 :salario;
    }

    public String getestadoCivil() {
        return estadoCivil;
    }

    public void setestadoCivilCasado(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
 @Override
    public void verDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + getNombre() + "\nEdad: " + 
         getEdad() + "\nSexo: " + getSexo() + "\nSalario" + getSalario() + "\nEstado Civil: " 
                + getestadoCivil() + "\nEspecialidad: " +
               getEspecialidad());
                
    }

     
     
    
}
