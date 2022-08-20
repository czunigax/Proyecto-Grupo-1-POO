/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

//import java.util.Date;

/**
 *
 * @author cris, gleny
 */
public class Cliente extends Persona  {
   //ATRIBUTOS
   String CodigoCliente;
   String fechaRegistro;
   
   //CONTRUCTOR
   public Cliente(){
    super();
   }
   
     public Cliente (String CodigoCliente, String fechaRegistro){
       super();
        this.CodigoCliente=CodigoCliente;
        this.fechaRegistro=fechaRegistro;
    }
     
     public Cliente(String Nombre, String Id,String CodigoCliente, String fechaRegistro, String Telefono, String Nacimiento, String Direccion, String Email) {
	super(Nombre, Id, Telefono, Nacimiento, Direccion, Email);
	this.CodigoCliente = CodigoCliente;
	this.fechaRegistro = fechaRegistro;
     }
    
   
     //Getters & Setters
    public String getCodigoCliente(){
    return CodigoCliente;
    }
    
    public void setCodigoCliente(String CodigoCliente){
    this.CodigoCliente=CodigoCliente;
    }
    
    public String getFechaRegistro(){
    return CodigoCliente;
    }
    
    public void setFechaRegistro(String CodigoCliente, String fechaRegistro){
    this.CodigoCliente=CodigoCliente;
    this.fechaRegistro=fechaRegistro;
    }
    
    //Metodo toString
    @Override
    public String toString() {      
        String _infoCliente = String.format("INFORMACIÓN DEL CLIENTE:\n--------------------------------------\n"
                + "Código: %s\n"
                + "Fecha registro: %s\n"
                + super.toString()
                , this.fechaRegistro);
        return _infoCliente;
    }
}
