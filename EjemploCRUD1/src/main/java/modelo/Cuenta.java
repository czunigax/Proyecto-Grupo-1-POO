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
public class Cuenta extends Cliente{
    
   private String TipodeCuenta;
   private String NumerodeCuenta;
   private double Monto;
   private Date FechaApertura;
    
    public Cuenta(){
    super();
   }
   
     public Cuenta (String TipodeCuenta, String NumerodeCuenta, double Monto, Date FechaApertura ){
       super();
        this.TipodeCuenta=TipodeCuenta;
        this.NumerodeCuenta=NumerodeCuenta;
        this.Monto=Monto;
        this.FechaApertura=FechaApertura;
    }
     
     public Cuenta(String Nombre, String Id,String CodigoCliente, String Telefono, Date Nacimiento, String Direccion, String Email, String TipodeCuenta, String NumerodeCuenta, double Monto, Date FechaApertura) {
	super(Nombre, Id,CodigoCliente, Telefono, Nacimiento, Direccion, Email);
	this.TipodeCuenta=TipodeCuenta;
        this.NumerodeCuenta=NumerodeCuenta;
        this.Monto=Monto;
        this.FechaApertura=FechaApertura;
	
     }
     
     
    public String getTipo(){
    return TipodeCuenta;
    }
    public void setTipo(String TipodeCuenta){
    this.TipodeCuenta=TipodeCuenta;
    }
    public String getNumerodeCuenta(){
    return NumerodeCuenta;
    }
    public void setNumeroC(String NumerodeCuenta){
    this.NumerodeCuenta=NumerodeCuenta;
    }
     public double getMonto(){
    return Monto;
    }
    public void setMonto(double Monto){
    this.Monto=Monto;
    }
    public Date getFechaApertura(){
    return FechaApertura;
    }
    public void setFechaApertura(Date FechaApertura){
    this.FechaApertura=FechaApertura;
    }
}
