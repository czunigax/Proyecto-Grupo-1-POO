/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author cris
 */
public class Cliente extends Persona  {
    

   String CodigoCliente;
   
   public Cliente(){
    super();
   }
   
     public Cliente (String CodigoCliente){
       super();
        this.CodigoCliente=CodigoCliente;
    }
     
     public Cliente(String Nombre, String Id,String CodigoCliente, String Telefono, String Nacimiento, String Direccion, String Email) {
	super(Nombre, Id, Telefono, Nacimiento, Direccion, Email);
	this.CodigoCliente = CodigoCliente;
	
     }
    
    
    public String getCodigoCliente(){
    return CodigoCliente;
    }
    public void setCodigoCliente(String CodigoCliente){
    this.CodigoCliente=CodigoCliente;
    }
    
}
