/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import Interfaces.Interes;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.text.Position;



/**
 *
 * @author kevin, Olbin, Gleny
 */
public class Prestamo implements Interes {
        
    //Atributos
    private String TiempoPago;
    private double montoPagar;
    private String codigoPrestamo;
    private double ValorIntereses;
    private String FechaInicio;
    private String FechaFinal;
    private String TipoCuenta;
    private double Monto;

 
  
    //Constructor
     public Prestamo(){
         
     }
    
     public Prestamo(String TiempoPago,double montoPagar, String codigoPrestamo, double ValorIntereses,String FechaInicio,String FechaFinal,String TipoCuenta, double Monto){
            this.TiempoPago=TiempoPago;
            this.montoPagar=montoPagar;
            this.codigoPrestamo=codigoPrestamo;
            this.ValorIntereses=ValorIntereses;
            this.FechaInicio=FechaInicio;
            this.FechaFinal=FechaFinal;
            this.TipoCuenta=TipoCuenta;
            this.Monto=Monto;
     }
     
    //Getters & Setters
        public String getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public void setCodigoPrestamo(String codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }

     
    public String getTiempoPago(){
         return TiempoPago;
    }
    
    public void setTiempoPago(String TiempoPago){
            this.TiempoPago=TiempoPago;
    }
        
    public double getMontoPagar(){
         return montoPagar;
    }
    
    public void setTiempoPago(double montoPagar){
            this.montoPagar=montoPagar;
    }
    
    public String getCodigoP(){
        return codigoPrestamo;
    }
    
    public void setCodigoP(String codigoPrestamo){
        this.codigoPrestamo=codigoPrestamo;
    }
    
    public double getValorIntereses() {
        return ValorIntereses;
    }

    public void setValorIntereses(double ValorIntereses) {
        this.ValorIntereses = ValorIntereses;
    }
    
    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(String FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }
    
        
      
    //Metodo toString
    @Override
    public String toString() {
        String _Prestamo = String.format("INFORMACIÓN DE PRESTAMO:\n--------------------------------------\n"
                +"TiempoPago: "+TiempoPago+"\n"
                +"ValorIntereses: "+ValorIntereses+"\n"
                +"FechaInicio: "+FechaInicio+"\n"
                +"FechaFinal: "+FechaFinal+"\n"
                +"TipoCuenta: "+TipoCuenta+"\n"
        );
        return _Prestamo;
    }

    @Override
    public  double CalculoInteres(double monto) {
        double Intereses = 0;

        if (monto >= 0 || monto <= 500000) {
            Intereses = (monto * (0.0));
            this.ValorIntereses += Intereses;
            return Intereses;
        } else if (monto >= 500000 || monto <= 1000000) {
            Intereses = (monto * (0.0025));
            this.ValorIntereses += Intereses;
            return Intereses;
        } else if (monto >= 1000000 || monto <= 2000000) {
            Intereses = (monto * (0.005));
            this.ValorIntereses += Intereses;
            return Intereses;
        } else if (monto >= 2000000 || monto > 2000000) {
            Intereses = (monto * (0.0356));
            this.ValorIntereses += Intereses;
            return Intereses;
        } else {
            return Intereses;
        }
    }
    
        public double MontoTotal(double monto ){
            double Intereses = 0;
        if (monto >= 0 || monto <= 500000) {
            Intereses = (monto * (0.0));
            this.ValorIntereses += Intereses;
            return ValorIntereses;
        } else if (monto >= 500000 || monto <= 1000000) {
            Intereses = (monto * (0.0025));
            this.ValorIntereses += Intereses;
            return ValorIntereses;
        } else if (monto >= 1000000 || monto <= 2000000) {
            Intereses = (monto * (0.005));
            this.ValorIntereses += Intereses;
            return ValorIntereses;
        } else if (monto >= 2000000 || monto > 2000000) {
            Intereses = (monto * (0.0356));
            this.ValorIntereses += Intereses;
            return ValorIntereses;
        } else {
            return ValorIntereses;
        }
            
        }
      
}
