/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author cris, Gissela
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
    public void setCargo(String Cargo){
    this.Cargo=Cargo;
    }
    
    //Metodo toString
    @Override
    public String toString() {
       String _Empleado = String.format("INFORMACIÓN DE EMPLEADO:\n--------------------------------------\n"
                +"CodigoEmpleado: "+CodigoEmpleado+"\n"
                +"Cargo: "+Cargo+"\n"
        );
        return _Empleado;
    }
    
}
