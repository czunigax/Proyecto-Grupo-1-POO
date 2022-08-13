/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
/**
 *
 * @author gleny
 */
public class CuentaEspecial extends Cuenta {
    //Atributos
    private String nombreCE;
    private int idCE;
    private Date fechaRetiro;
    
    //Constructor
    public CuentaEspecial(){
    super();
    }
    
    public CuentaEspecial(String nombreCE, int idCE, Date fechaRetiro){
       super();
        this.nombreCE=nombreCE;
        this.fechaRetiro=fechaRetiro;
        this.idCE=idCE;
    }
    
    public CuentaEspecial(String Nombre, String Id,String CodigoCliente, String Telefono, String Nacimiento, String Direccion, String Email, String TipodeCuenta, String NumerodeCuenta, double Monto, String FechaApertura, String nombreCE, int idCE, Date fechaRetiro) {
	super(Nombre, Id,CodigoCliente, Telefono, Nacimiento, Direccion, Email, TipodeCuenta, NumerodeCuenta, Monto, FechaApertura);
	this.nombreCE=nombreCE;
        this.fechaRetiro=fechaRetiro;
        this.idCE=idCE;
     }
    
    //Getters & Setters
    public String getNombreCE(){
    return nombreCE;
    }
    
    public void setNombreCE(String nombreCE){
    this.nombreCE=nombreCE;
    }
    
    public int getIdCE(){
    return idCE;
    }
    
    public void serIdCE(int idCE){
    this.idCE=idCE;
    }
    
    public Date getFechaRetiro(){
    return fechaRetiro;
    }
    
    public void setFechaRetiro(Date fechaRetiro){
    this.fechaRetiro=fechaRetiro;
    }
}
