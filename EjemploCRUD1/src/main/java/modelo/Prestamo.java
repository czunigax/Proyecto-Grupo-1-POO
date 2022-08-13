/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Date;
/**
 *
 * @author kevin
 */
public class Prestamo {
        
    //Atributos
    private Date TiempoPago;
    private double ValorIntereses;
    private Date FechaInicio;
    private Date FechaFinal;
    private String TipoCuenta;

  
    //Constructor
     public Prestamo(){
         
     }
    
        public Prestamo(Date TiempoPago,double ValorIntereses,Date FechaInicio,Date FechaFinal,String TipoCuenta){
            this.TiempoPago=TiempoPago;
            this.ValorIntereses=ValorIntereses;
            this.FechaInicio=FechaInicio;
            this.FechaFinal=FechaFinal;
            this.TipoCuenta=TipoCuenta;
        }
     
        //Getters & Setters
        public Date getTiempoPago(){
            return TiempoPago;
        }
        public void setTiempoPago(Date TiempoPago){
            this.TiempoPago=TiempoPago;
        }
        
          public double getValorIntereses() {
        return ValorIntereses;
    }

    public void setValorIntereses(double ValorIntereses) {
        this.ValorIntereses = ValorIntereses;
    }

    
       
     
        public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }
    
        
        
      public void SolicitarPrestamo(){
      
      }
        
      public void PagarPrestamo(){
      
      }  
      
      public void CalculoInteres(){
      
      }
      
}
