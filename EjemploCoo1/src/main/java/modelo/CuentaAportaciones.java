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
public class CuentaAportaciones extends Cuenta {
    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retirar(double cantidadRetirar) {
        if (cantidadRetirar <= this.Monto){
            // CuentaAportaciones.this.eliminarTipoCuenta();
            this.Monto -= cantidadRetirar;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    public double CalculoInteres(double monto) {
        double Intereses = 0;

        if (monto >= 0 || monto <= 100000) {
            Intereses = (monto * (0.0));
            this.interes += Intereses;
            return Intereses;
        } else if (monto >= 100000 || monto <= 500000) {
            Intereses = (monto * (0.0025));
            this.interes += Intereses;
            return Intereses;
        } else if (monto >= 500000 || monto <= 1000000) {
            Intereses = (monto * (0.005));
            this.interes += Intereses;
            return Intereses;
        } else if (monto >= 1000000 || monto > 3000000) {
            Intereses = (monto * (0.0356));
            this.interes += Intereses;
            return Intereses;
        } else {
            return Intereses;
        }
    }
}
