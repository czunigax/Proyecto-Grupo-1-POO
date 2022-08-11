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
    private Cuenta ModeloC;
    private CuentaView VistaC;
    
    private boolean exito;
    private Statement st;
    private Connection cn;
    private ResultSet rs;
    private String sql;
    
    public CuentaController(Cuenta ModeloC, CuentaView VistaC){
        this.ModeloC= ModeloC;
        this.VistaC= VistaC;
        }
    public String getNombre(){
    return ModeloC.getNombre();
    }
    public void setNombre(String Nombre){
    this.ModeloC.setNombre(Nombre);
    }
    public String getIdcuenta(){
    return ModeloC.get_idcuenta();
    }
    public void setIdcuenta(String Idcuenta){
    this.ModeloC.setidcuenta(Idcuenta);
    }
     public String getId(){
    return ModeloC.getId();
    }
    public void setId(String Id){
    this.ModeloC.setId(Id);
    }
     public String getTipoCuenta(){
    return ModeloC.getTipo();
    }
    public void setTipoCuenta(String TipoCuenta){
    this.ModeloC.setTipo(TipoCuenta);
    }
    
    public void ActualizarVistaCuenta(){
        VistaC.ImprimirDatoscuenta(ModeloC.getNombre(), ModeloC.getId(),ModeloC.get_idcuenta(),ModeloC.getTipo() );
    }
    
    public boolean Insertar(){
        exito= false;
        st= null;
        cn= null;
                
        sql= "insert into cuentas values ('"+
                ModeloC.getNombre()+"', '"+ModeloC.getId()+"','"+ModeloC.get_idcuenta()+"','"+ModeloC.getId()+"','"
                +ModeloC.getTipo()+"')";
        
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
        
        sql= "update cuentas set nombre= '"+ModeloC.getNombre()+"','"+ModeloC.get_idcuenta()+"','"+ModeloC.getTipo()+"' "+
                "where id='"+ModeloC.getId()+"'";
        
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
        
        sql= "select id, nombre from cuentas where id= '"+Id+"'";
        
        try{
            cn= ConectarBD.Conectar();
            st= cn.createStatement();
            rs= st.executeQuery(sql);
            
            VistaC.ImprimirSelectCuenta(rs);
            
            exito= true;
        } catch(SQLException e){
            System.out.println("Error en la ejecucion select");
        }
        return exito;
    }
}
