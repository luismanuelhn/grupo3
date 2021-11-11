/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *
 * @author Familia
 */
public abstract class Persona {
    private String nombre;
        private String sexo;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   

    
    //Constructor
    public Persona(String nombre,  String sexo, int edad) {
        this.nombre = nombre;        
        this.sexo = sexo;
        this.edad = edad;
    }

    public Persona() {
    }
    
    
    //Metodos Get y Set
    public String getNombre() {
        return nombre;
    }



    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }
   
        
    //metodo abstracto
    abstract public void verDatos();
    
}
