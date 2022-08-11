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
public class Cuenta extends Persona {
    private String IdCuenta;
    private String TipoCuenta;
    
    public Cuenta(){
    super();
    }
    
  public Cuenta(String IdCuenta, String TipoCuenta) {
	super();
	this.IdCuenta = IdCuenta;
	this.TipoCuenta = TipoCuenta;
   
}  
  
public Cuenta(String Nombre, String Id,String Direccion, String IdCuenta, String TipoCuenta) {
	super(Nombre, Id);
	this.IdCuenta = IdCuenta;
	this.TipoCuenta = TipoCuenta;
	
}  
  
public String get_idcuenta() {
	return IdCuenta;
}

public void setidcuenta(String IdCuenta) {
	this.IdCuenta = IdCuenta;
}

public String getTipo() {
	return TipoCuenta;
}

public void setTipo(String TipoCuenta) {
	this.TipoCuenta = TipoCuenta;
}
    
}
