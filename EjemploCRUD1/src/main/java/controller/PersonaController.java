/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import modelo.Persona;
import view.PersonaView;
import unah.ejemplocrud1.ConectarBD;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author migsauceda
 */
public class PersonaController {
    //crear objetos de modelo y vista
    private PersonaView Vista;
    private Persona Modelo;
    
    //propiedades
    private boolean exito;
    private Statement st;
    private Connection cn;
    private ResultSet rs;
    private String sql;
    
    //constructor inicializr modelo y vista
    public PersonaController(Persona Modelo, PersonaView Vista){
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
    
    
    public void ActualizarVista(){
        Vista.ImprimirDatospersona(Modelo.getId(), Modelo.getNombre());
    }
    //Inserta
    public boolean Insertar(){
        exito= false;
        st= null;
        cn= null;
                
        sql= "insert into persona values ('"+
                Modelo.getId()+"', '"+Modelo.getNombre()+"')";
        
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
    //Modificar Cuenta
    public boolean Update(String Id){
        exito= false;
        st= null;
        cn= null;
        
        sql= "update persona set nombre= '"+Modelo.getNombre()+"' "+
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
    //Buscar Cuenta
    public boolean Select(String Id){
        exito= false;
        st= null;
        cn= null;
        
        sql= "select id, nombre from cuenta where id= '"+Id+"'";
        
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
