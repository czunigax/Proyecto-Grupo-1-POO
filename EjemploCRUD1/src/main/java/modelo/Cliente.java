/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author cris
 */
public class Cliente   {
    
    String Id;
   String Nombre:
   String Direccion;
   
   public Cliente(){
   }
   
     public Cliente (String Id, String Nombre. String Direccion){
        this.Id= Id;
        this.Nombre= Nombre; 
        this.Direccion=Direccion;
    }
    
       public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getDireccion(){
    return Direccion;
    }
    public setDireccion(String Direccion){
    this.Direccion=Direccion;
    }
    
}
