/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kevin
 */
public class Cooperativa {
    //Atributos
   private String Nombre;
   private String Dirrecion;

   //Constructor
    public Cooperativa(String Nombre, String Dirrecion) {
        this.Nombre = Nombre;
        this.Dirrecion = Dirrecion;
    }
   
    public Cooperativa(){
    }
    
   //Getters & Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDirrecion() {
        return Dirrecion;
    }

    public void setDirrecion(String Dirrecion) {
        this.Dirrecion = Dirrecion;
    } 
    
}
