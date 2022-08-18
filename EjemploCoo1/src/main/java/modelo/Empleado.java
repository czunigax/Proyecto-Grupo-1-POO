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
public class Empleado extends Persona {
    private String CodigoEmpleado;
    private  String Cargo;
   
   public Empleado(){
    super();
   }
   
     public Empleado (String CodigoEmpleado, String Cargo){
       super();
        this.CodigoEmpleado=CodigoEmpleado;
        this.Cargo=Cargo;
    }
     
     public Empleado(String Nombre, String Id,String CodigoEmpleado,String Cargo, String Telefono, String Nacimiento, String Direccion, String Email) {
	super(Nombre, Id, Telefono, Nacimiento, Direccion, Email);
	this.CodigoEmpleado=CodigoEmpleado;
        this.Cargo=Cargo;
	
     }
    
    
    public String getCodigoCliente(){
    return CodigoEmpleado;
    }
    public void setCodigoEmpleado(String CodigoEmpleado){
    this.CodigoEmpleado=CodigoEmpleado;
    }
    public String getCargo(){
    return Cargo;
    }
    public void setCargoo(String Cargo){
    this.Cargo=Cargo;
    }
    
}
