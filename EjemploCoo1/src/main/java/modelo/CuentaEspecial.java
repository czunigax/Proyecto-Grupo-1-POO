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
    
    public CuentaEspecial(String Nombre, String Id,String CodigoCliente, String Telefono, String Nacimiento, String Direccion, String Email, String TipodeCuenta, String NumerodeCuenta, double Monto, String FechaApertura, String nombreCE, int idCE, Date fechaRetiro) {
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


    @Override
    public boolean depositar(double cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    //METODOS
    
    }
    
    @Override
    public String toString() {
        String _infoCuentaEspecial = String.format("Saldo: %f\n"
                                               + "Intereses: %f\n",
                                        this.Monto, this.intereses);
        return super.toString() + _infoCuentaEspecial;
    }
    
  

   

    @Override
    public double consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean retirar(double cantidadRetirar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
 
    
   
    
    
}

    /*    if (cantidadRetirar <= this.Monto ) {
            this.Monto -= cantidadRetirar;
            return true;
        } else {
            return false;
        }
    }*/
 

  
    


