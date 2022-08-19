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
 * @author Gleny
 */
public class CuentaEspecial extends Cuenta implements Interes{
    //Atributos
    private String nombreCE;
    private int idCE;
    private double intereses;
    private Date fechaRetiro;
    
    //Constructor
    public CuentaEspecial(){
    super();
    }
    
    public CuentaEspecial(String nombreCE, int idCE, double intereses, Date fechaRetiro){
       super();
        this.intereses=intereses;
        this.nombreCE=nombreCE;
        this.fechaRetiro=fechaRetiro;
        this.idCE=idCE;
    }
    
    public CuentaEspecial(String Nombre, String Id,String CodigoCliente, String Telefono, String Nacimiento, String Direccion, String Email, String TipodeCuenta, String NumerodeCuenta, double Monto, String FechaApertura, double intereses, String nombreCE, int idCE, Date fechaRetiro) {
	super(Nombre, Id,CodigoCliente, Telefono, Nacimiento, Direccion, Email, TipodeCuenta, NumerodeCuenta, Monto, FechaApertura);
	this.nombreCE=nombreCE;
        this.intereses=intereses;
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
    
    public double getIntereses(){
        return intereses;
    }
    
    public void setIntereses(double intereses){
        this.intereses=intereses;
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

   //METODOS
    @Override
    public String toString() {
        String _infoCuentaEspecial = String.format("Saldo: %f\n"
                                               + "Intereses: %f\n",
                                        this.Monto, this.intereses);
        return super.toString() + _infoCuentaEspecial;
    }
    
    @Override
    public boolean depositar(double cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public double consultar() {
        return this.Monto;
    }

    @Override
    public boolean retirar(double cantidadRetirar) {
         if (cantidadRetirar <= this.Monto ) {
            this.Monto -= cantidadRetirar;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean retirar(String tipoCuenta, double cantidadRetirar, Date fechaRetiro){
        if (tipoCuenta == "Cuenta Ahorro"){
            this.Monto -= cantidadRetirar;
            return true;
        } else {
           /* if (tipoCuenta == "Cuenta Navideña"){
                
            }*/
           return false;
        }
      }
 
    @Override
    public double CalculoInteres(double monto) {
        double Interesesremunerados = 0;
        
        switch (nombreCE){
            case "CUENTA AHORRO":
            if (monto >= 0 || monto <= 999.99) {
                 Interesesremunerados = (monto * (0.0005));
                      this.intereses += Interesesremunerados;
                   return Interesesremunerados;
                } else if (monto >= 1000 || monto <= 9999.99) {
                    Interesesremunerados = (monto * (0.0075));
                    this.intereses += Interesesremunerados;
                     return Interesesremunerados;
                 } else if (monto >= 10000 || monto <= 24999.99) {
                    Interesesremunerados = (monto * (0.01));
                     this.intereses += Interesesremunerados;
                     return Interesesremunerados;
                } else if (monto >= 25000) {
                      Interesesremunerados = (monto * (0.0126));
                      this.intereses += Interesesremunerados;
                         return Interesesremunerados;
                } 
            
                 break;
            
                 case "CUENTA NAVIDEÑA":
                     if (monto >= 0 || monto <= 500000) {
                   Interesesremunerados = (monto * (0.0));
                     this.intereses += Interesesremunerados;
                    return Interesesremunerados;
                 } else if (monto >= 500000 || monto <= 1000000) {
                     Interesesremunerados = (monto * (0.0025));
                      this.intereses += Interesesremunerados;
                        return Interesesremunerados;
                } else if (monto >= 1000000 || monto <= 2000000) {
                    Interesesremunerados = (monto * (0.005));
                    this.intereses += Interesesremunerados;
                    return Interesesremunerados;
                 } else if (monto >= 2000000) {
                    Interesesremunerados = (monto * (0.0356));
                    this.intereses += Interesesremunerados;
                    return Interesesremunerados;
                } /*else {
                    return Interesesremunerados;
                }*/
            
                break;
                
                case "CUENTA ESTUDIANTIL":
                    if (monto >= 0 || monto <= 100000) {
                         Interesesremunerados = (monto * (0.0));
                         this.intereses += Interesesremunerados;
                            return Interesesremunerados;
                     } else if (monto >= 100000 || monto <= 500000) {
                       Interesesremunerados = (monto * (0.0025));
                         this.intereses += Interesesremunerados;
                         return Interesesremunerados;
                     } else if (monto >= 500000 || monto <= 1000000) {
                        Interesesremunerados = (monto * (0.005));
                        this.intereses += Interesesremunerados;
                          return Interesesremunerados;
                     } else if (monto >= 1000000 || monto > 3000000) {
                        Interesesremunerados = (monto * (0.0356));
                        this.intereses += Interesesremunerados;
                        return Interesesremunerados;
                    } /*else {
                         return Interesesremunerados;
                     }*/
                    break;
                default:
                    break;
        }
        
        return Interesesremunerados;
    }
    
}