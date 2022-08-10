/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import unah.ejemplocrud1.ConectarBD;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cris
 */
public class ClienteController {
    private Cliente Modelo;
    private ClienteView Vista;
    
    private boolean exito;
    private Statement st;
    private Connection cn;
    private ResultSet rs;
    private String sql;
    
        public ClienteController(Cliente Modelo, ClienteView Vista){
        this.Modelo= Modelo;
        this.Vista= Vista;
        }
        
         public String getId() {
        return Modelo.getId();
    }

    public void setId(String Id) {
        this.Modelo.setId(Id);
    }

    public String getNombre() {
    return this.Modelo.getNombre();
    }

    public void setNombre(String Nombre) {
        this.Modelo.setNombre(Nombre);
    } 
    
    public String getDireccion(){
    return this.Modelo.getDireccion();
    }
    public void setDireccion(String Direccion){
    this.Modelo.setDireccion();
    }
    
    public void ActualizarVistaCliente(){
        Vista.ImprimirDatospersona(Modelo.getId(), Modelo.getNombre(), Modelo.getDireccion());
    }
    
    public boolean Insertar(){
        exito= false;
        st= null;
        cn= null;
                
        sql= "insert into cliente values ('"+
                Modelo.getId()+"', '"+Modelo.getNombre()+"','"+Modelo.getDireccion()+"')";
        
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
    
    public boolean Update(String Id){
        exito= false;
        st= null;
        cn= null;
        
        sql= "update cliente set nombre= '"+Modelo.getNombre()+"' "+Modelo.getDireccion()+"' "+
                "where id='"+Modelo.getId()+"'";
        
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
    
    public boolean Select(String Id){
        exito= false;
        st= null;
        cn= null;
        
        sql= "select id, nombre from cliente where id= '"+Id+"'";
        
        try{
            cn= ConectarBD.Conectar();
            st= cn.createStatement();
            rs= st.executeQuery(sql);
            
            Vista.ImprimirSelect(rs);
            
            exito= true;
        } catch(SQLException e){
            System.out.println("Error en la ejecucion select");
        }
        return exito;
    }
    
}
