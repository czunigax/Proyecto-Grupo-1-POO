/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Cuenta;
import unah.ejemplocrud1.ConectarBD;
import view.CuentaView;
/**
 *
 * @author cris
 */
public class CuentaController {
    private Cuenta Modelo;
    private CuentaView Vista;
    
    private boolean exito;
    private Statement st;
    private Connection cn;
    private ResultSet rs;
    private String sql;
    
    public CuentaController(Cuenta Modelo, CuentaView Vista){
        this.Modelo= Modelo;
        this.Vista= Vista;
        }
    public String getNombre(){
    return Modelo.getNombre();
    }
    public void setNombre(String Nombre){
    this.Modelo.setNombre(Nombre);
    }
    public String getIdcuenta(){
    return Modelo.get_idcuenta();
    }
    public void setIdcuenta(String Idcuenta){
    this.Modelo.setidcuenta(Idcuenta);
    }
     public String getId(){
    return Modelo.getId();
    }
    public void setId(String Id){
    this.Modelo.setId(Id);
    }
     public String getTipoCuenta(){
    return Modelo.getTipo();
    }
    public void setTipoCuenta(String TipoCuenta){
    this.Modelo.setTipo(TipoCuenta);
    }
    
    public void ActualizarVistaCuenta(){
        Vista.ImprimirDatoscuenta(Modelo.getNombre(), Modelo.get_idcuenta(), Modelo.getId(),Modelo.getTipo() );
    }
    
    public boolean Insertar(){
        exito= false;
        st= null;
        cn= null;
                
        sql= "insert into cuenta values ('"+
                Modelo.getId()+"', '"+Modelo.getNombre()+"','"+Modelo.get_idcuenta()+"','"+Modelo.getId()+"','"
                +Modelo.getTipo()+"')";
        
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
        
        sql= "update cuenta set nombre= '"+Modelo.getNombre()+"','"+Modelo.get_idcuenta()+"','"+Modelo.getTipo()+"' "+
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
