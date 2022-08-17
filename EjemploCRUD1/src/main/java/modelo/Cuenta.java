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
   //Atributos
   private String TipodeCuenta;
   private String NumerodeCuenta;
   private double Monto;
   private String FechaApertura;
   
    
   //Constructor
    public Cuenta(){
    super();
   }
   
     public Cuenta (String TipodeCuenta, String NumerodeCuenta, double Monto, String FechaApertura ){
       super();
        this.TipodeCuenta=TipodeCuenta;
        this.NumerodeCuenta=NumerodeCuenta;
        this.Monto=Monto;
        this.FechaApertura=FechaApertura;
    }
     
     public Cuenta(String Nombre, String Id,String CodigoCliente, String Telefono, String Nacimiento, String Direccion, String Email, String TipodeCuenta, String NumerodeCuenta, double Monto, String FechaApertura) {
	super(Nombre, Id,CodigoCliente, Telefono, Nacimiento, Direccion, Email);
	this.TipodeCuenta=TipodeCuenta;
        this.NumerodeCuenta=NumerodeCuenta;
        this.Monto=Monto;
        this.FechaApertura=FechaApertura;
	
     }
     
    //Getters & Setters
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
    public String getFechaApertura(){
    return FechaApertura;
    }
    public void setFechaApertura(String FechaApertura){
    this.FechaApertura=FechaApertura;
    }
    
    public boolean depositar(double cantidad){
    
    if (cantidad <=0){
    
    return false;
    }
    else{
    
    this.Monto+=cantidad;
    return true;
    }
    }
    
    public boolean retirar (double cantidadretirar){
    if (cantidadretirar <= this.Monto){
   this.Monto-=cantidadretirar;
    return true;
    }else{
return false;
}

}
}
