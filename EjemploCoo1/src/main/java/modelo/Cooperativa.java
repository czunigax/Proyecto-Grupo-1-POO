/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kevin, Olbin
 */
public class Cooperativa {
    //Atributos
   private String Nombre;
   private String Direccion;

   //Constructor
    public Cooperativa(String Nombre, String Direccion) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
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

    public String getDireccion() {
        return Direccion;
    }

    public void setDirrecion(String Direccion) {
        this.Direccion = Direccion;
    } 
    
    //Metodo toString
    @Override
    public String toString() {
       String _Cooperativa = String.format("INFORMACIÓN DE COOPERATIVA:\n--------------------------------------\n"
                +"Nombre: "+Nombre+"\n"
                +"Direccion: "+Direccion+"\n"
        );
        return _Cooperativa;
    
 }
}
