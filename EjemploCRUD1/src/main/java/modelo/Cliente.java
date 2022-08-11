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
public class Cliente extends Persona  {
    

   String Direccion;
   
   public Cliente(){
    super();
   }
   
     public Cliente (String Direccion){
       super();
        this.Direccion=Direccion;
    }
     
     public Cliente(String Nombre, String Id,String Direccion) {
	super(Nombre, Id);
	this.Direccion = Direccion;
	
     }
    
    
    public String getDireccion(){
    return Direccion;
    }
    public void setDireccion(String Direccion){
    this.Direccion=Direccion;
    }
    
}
