/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import Helpers.Deportista;
import Helpers.Doctor;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Familia
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner op=new Scanner(System.in);
        Doctor doctor= new Doctor();
        Deportista deportista=new Deportista();
        String nombre,sexo,especialidad,estadoCivil,diciplina;
        int edad,numeroAsignado;
        double salario;
        
        int opcion=0;
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Datos al llenar:\n"
                + "1)Doctor\n2)Deportista\n3)Salir"));
        
        switch(opcion){
            case 1:
                //opteniendo los datos
                JOptionPane.showMessageDialog(null, "Agregando los datos del Medico");
                nombre=JOptionPane.showInputDialog("agrege nombre del medico");
                edad=Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su edad?"));
                sexo=JOptionPane.showInputDialog("¿Cual es el Genero?");
                especialidad=JOptionPane.showInputDialog("¿Cual es su Especialidad?");
                estadoCivil=JOptionPane.showInputDialog("Estado Civil");
                salario=Double.parseDouble(JOptionPane.showInputDialog("¿Cual sera su Salario?"));
               
                //enviando los valores
                doctor.setNombre(nombre);
                doctor.setEdad(edad);
                doctor.setSexo(sexo);
                doctor.setEspecialidad(especialidad);
                doctor.setestadoCivilCasado(estadoCivil);
                doctor.setSalario(salario);
                               
                //imprimiendo las dotos almacenados
                doctor.verDatos();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "agregando datos del Deportista");
                nombre=JOptionPane.showInputDialog("agrege nombre del Competidor");
                edad=Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su edad?"));
                sexo=JOptionPane.showInputDialog("¿Cual es el Genero?");
                numeroAsignado=Integer.parseInt(JOptionPane.showInputDialog("¿Asigne numero al competidor?"));
                
                //almacenando los valores
                deportista.setNombre(nombre);
                deportista.setEdad(edad);
                deportista.setSexo(sexo);
                deportista.setNumeroDoral(numeroAsignado);
               
                //imprimiendo las dotos almacenados
                deportista.verDatos();
                break;
            case 3:
               JOptionPane.showMessageDialog(null, "Salir");
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Error opcion incorrecta");
                break;
             }
    }
    
}
