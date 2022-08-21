/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import unah.ejemplocrud1.ConectarBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Prestamo;
import view.PrestamoView;
 
// @author Kevin
 
public class PrestamoController {
   private PrestamoView VistaPrestamo;
   private Prestamo ModeloPrestamo;

    public PrestamoController(PrestamoView VistaPrestamo, Prestamo ModeloPrestamo) {
        this.VistaPrestamo = VistaPrestamo;
        this.ModeloPrestamo = ModeloPrestamo;
    }
 
    
      private boolean exito;
    private Statement st;
    private Connection cn;
    private ResultSet rs;
    private String sql;
    PreparedStatement ps;
  
    
    
      public String getCodigoPrestamo() {
        return ModeloPrestamo.getCodigoPrestamo();
    }

    public void setCodigoPrestamo(String codigoPrestamo) {
        this.ModeloPrestamo.setCodigoPrestamo(codigoPrestamo);
    }

    
    public double getValorIntereses() {
        return ModeloPrestamo.getValorIntereses();
    }

    public void setValorIntereses(double ValorIntereses) {
        this.ModeloPrestamo.setValorIntereses(ValorIntereses);
    }
    
    
    public boolean CreacionPrestamo(){
        exito= false;
        st= null;
        cn= null;
        
        sql="insert into prestamos values('"+ModeloPrestamo.getCodigoPrestamo()+"', '"+ModeloPrestamo.getValorIntereses()+"', '"+ModeloPrestamo.getTiempoPago()
                +"', '"+ModeloPrestamo.getFechaInicio()+"', '"+ModeloPrestamo.getFechaFinal()+"', '"+ModeloPrestamo.getTipoCuenta()+"', '"+ModeloPrestamo.getMontoPagar()+"', '"+ModeloPrestamo.getMonto()+"')";
         try{
            cn= ConectarBD.Conectar();
            st= cn.createStatement();
            st.execute(sql);
            
            exito= true;
            
            st.close();
            cn.close();
        }catch(SQLException e){
            System.out.println("Error al crear Prestamo");
        }
        return exito;
                
        
    }
     public boolean ActualizarmontoPrestamo(String NumerodeCuenta){
        exito= false;
        st= null;
        cn= null;
        
        sql= "update prestamos set monto_restante= '"+ModeloPrestamo.getMonto()+"' "+"where codigo_prestamo='"+NumerodeCuenta+"'";
       
        try{
            cn= ConectarBD.Conectar();
            st= cn.createStatement();
            st.execute(sql);
            
            exito= true;
            
            st.close();
            cn.close();
        }catch(SQLException e){
            System.out.println("Error en la actualizacion");
        }
        return exito;       
}
     
     
}
