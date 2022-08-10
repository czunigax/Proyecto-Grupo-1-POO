/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import unah.ejemplocrud1.ConectarBD;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Retiro;
import view.RetiroView;

/**
 *
 * @author cristian
 */
public class RetiroController {
    
    private RetiroView VistaRetiro;
    private Retiro ModeloRetiro;
    
    private boolean exito;
    private Statement st;
    private Connection cn;
    private ResultSet rs;
    private String sql;
    
    public RetiroController(Retiro ModeloRetiro, RetiroView VistaRetiro){
        this.ModeloRetiro= ModeloRetiro;
        this.VistaRetiro= VistaRetiro;
    }
    
    public String getmonto() {
        return ModeloRetiro.getMonto();
    }

    public void setmonto(String monto) {
        this.ModeloRetiro.setMonto(monto);
    }

    public String getNombre() {
        return this.ModeloRetiro.getNombre();
    }

    public void setNombre(String Nombre) {
        this.ModeloRetiro.setNombre(Nombre);
    } 
    
    public void ActualizarVista(){
        VistaRetiro.ImprimirDatosRetiro(ModeloRetiro.getMonto(), ModeloRetiro.getNombre());
    }
    
     public boolean Insertar(){
        exito= false;
        st= null;
        cn= null;
                
        sql= "insert into retiro values ('"+
                ModeloRetiro.getNombre()+"', '"+ModeloRetiro.getMonto()+"')";
        
        try{
            cn= ConectarBD.Conectar();
            st= cn.createStatement();
            st.execute(sql);
            
            exito= true;
            
            st.close();
            cn.close();
        }catch(SQLException e){
            System.out.println("Error al insert en BD");
        }
        return exito;
    }
     
     public boolean Update(String Nombre){
        exito= false;
        st= null;
        cn= null;
        
        sql= "update retiro set nombre= '"+ModeloRetiro.getNombre()+"' "+
                "where nombre='"+ModeloRetiro.getNombre()+"'";
        
        try{
            cn= ConectarBD.Conectar();
            st= cn.createStatement();
            st.execute(sql);
            
            exito= true;
            
            st.close();
            cn.close();
        }catch(SQLException e){
            System.out.println("Error en la ejecucion update");
        }
        return exito;        
    }
     
      public boolean Select(String Nombre){
        exito= false;
        st= null;
        cn= null;
        
        sql= "select nombre, nombre from retiro where nombre= '"+Nombre+"'";
        
        try{
            cn= ConectarBD.Conectar();
            st= cn.createStatement();
            rs= st.executeQuery(sql);
            
            VistaRetiro.ImprimirSelectRetiro(rs);
            
            exito= true;
        } catch(SQLException e){
            System.out.println("Error en la ejecucion select");
        }
        return exito;
    }
}
