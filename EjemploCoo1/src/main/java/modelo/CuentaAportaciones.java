/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Interfaces.Interes;
import java.util.Date;
/**
 *
 * @author gleny
 */
public class CuentaAportaciones extends Cuenta implements Interes{
    
    //Atributos
    private Date fechaDeposito;
    private double interes;
    
    //Constructor
    public CuentaAportaciones(){
    super();
    }
    
    public CuentaAportaciones(Date fechaDeposito){
       super();
        this.fechaDeposito=fechaDeposito;
    }
    
    public CuentaAportaciones(String Nombre, String Id,String CodigoCliente, String Telefono, String Nacimiento, String Direccion, String Email, String TipodeCuenta, String NumerodeCuenta, double Monto, String FechaApertura, Date fechaDeposito) {
	super(Nombre, Id,CodigoCliente, Telefono, Nacimiento, Direccion, Email, TipodeCuenta, NumerodeCuenta, Monto, FechaApertura);
	this.fechaDeposito=fechaDeposito;
     }
    //Getters & Setters
    public Date getFechaDeposito(){
    return fechaDeposito;
    }
    
    public void setFechaDeposito(Date fechaDeposito){
    this.fechaDeposito=fechaDeposito;
    }

    //METODOS
    
    @Override
    public String toString() {        
        String _infoCuentaAportaciones = String.format("Saldo: %f\n", this.Monto);
        return super.toString() + _infoCuentaAportaciones;
    }
    
    @Override
    public boolean depositar(double cantidad) {
        if (cantidad <= 0) {
            return false;
        } else {
            this.Monto += cantidad;
            return true;
        }
    }

    @Override
    public boolean retirar(double cantidadRetirar) {
        cantidadRetirar = Monto;
        
        if (cantidadRetirar <= this.Monto){
            this.Monto -= cantidadRetirar;
            System.out.print("Su cuenta sera cancelada.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double consultar() {
        return this.Monto;
    }
  
    @Override
    public double CalculoInteres(double monto) {
        return 0;
    }
}
