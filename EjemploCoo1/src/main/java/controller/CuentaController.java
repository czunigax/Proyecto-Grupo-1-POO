/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import modelo.Cuenta;
import view.CuentaView;

/**
 *
 * @author cris
 */
public class CuentaController {
  
    private CuentaView VistaCuenta;
    private Cuenta ModeloCuenta;
    
    //propiedades
    private boolean exito;
    private Statement st;
    private Connection cn;
    private ResultSet rs;
    private String sql;
    PreparedStatement ps;
    
    
     public CuentaController(Cuenta ModeloCuenta, CuentaView VistaCuenta){
        this.ModeloCuenta= ModeloCuenta;
        this.VistaCuenta= VistaCuenta;
     }

   
     
    public String getId() {
    return ModeloCuenta.getId();
    }

    public void setId(String Id) {
    this.ModeloCuenta.setId(Id);
    }
    
     public String getNombre() {
    return ModeloCuenta.getNombre();
    }

    public void setNombre(String Nombre) {
    this.ModeloCuenta.setNombre(Nombre);
    }
    
    public String getCodigoCliente(){
    return ModeloCuenta.getCodigoCliente();
    }
    
    public void setCodigoCliente(String CodigoCliente){
    this.ModeloCuenta.setCodigoCliente(CodigoCliente);
    }
    
    public String getTelefono(){
    return ModeloCuenta.getTelefono();
    }
    
    public void setTelefono(String Telefono){
    this.ModeloCuenta.setTelefono(Telefono);
    }
    
    public String getNacimiento(){
    return ModeloCuenta.getNacimiento();
    }
    
    public void setNacimiento(String Nacimiento){
    this.ModeloCuenta.setNacimiento(Nacimiento);
    }
    
    public String getDireccion(){
    return ModeloCuenta.getDireccion();
    }
    
    public void setDireccion(String Direccion){
    this.ModeloCuenta.setDireccion(Direccion);
    }
    
    public String getEmail(){
    return ModeloCuenta.getEmail();
    }
    
    public void setEmail(String Email){
    this.ModeloCuenta.setEmail(Email);
    }
    
     public String getNumerodeCuenta(){
    return ModeloCuenta.getEmail();
    }
    
    public void setNumerodeCuenta(String NumerodeCuenta){
    this.ModeloCuenta.setNumeroC(NumerodeCuenta);
    }
    
    public String getTipo(){
    return ModeloCuenta.getTipo();
    }
    
    public void setTipo(String Tipo){
    this.ModeloCuenta.setTipo(Tipo);
    }
    
    public double getMonto(){
    return ModeloCuenta.getMonto();
    }
    
    public void setMonto(double Monto){
    this.ModeloCuenta.setMonto(Monto);
    }
    
    public String getFechaApertura(){
    return ModeloCuenta.getFechaApertura();
    }
    
    public void setFechaApertura(String FechaApertura){
    this.ModeloCuenta.setFechaApertura(FechaApertura);
    }
    
   
     //Crea una nueva cuenta
     public boolean AperturarCuenta(){
        exito= false;
        st= null;
        cn= null;
                
        sql= "insert into cuenta values ('"+ModeloCuenta.getId()+"', '"+ ModeloCuenta.getNombre()+"', '"+ModeloCuenta.getCodigoCliente()+"', '"+ModeloCuenta.getTelefono()
        +"', '"+ModeloCuenta.getNacimiento()+"', '"+ModeloCuenta.getDireccion()+"', '"+ModeloCuenta.getEmail()+"', '"+ModeloCuenta.getTipo()
            +"', '"+ModeloCuenta.getNumerodeCuenta()+"', '"+ModeloCuenta.getMonto()+"', '"+ModeloCuenta.getFechaApertura()  +"')";
        
        try{
            cn= ConectarBD.Conectar();
            st= cn.createStatement();
            st.execute(sql);
            
            exito= true;
            
            st.close();
            cn.close();
            
            
             JOptionPane.showMessageDialog(null, "Agregado Correctamente");
             System.out.println("Agregado correctamente");
           
        }catch(SQLException e){
            System.out.println("Error al crear Cuenta");
        }
        return exito;
    }
     
     public boolean InsertarClientes(){
        exito= false;
        st= null;
        cn= null;
                
        sql= "insert into cliente values ('"+ModeloCuenta.getId()+"', '"+ ModeloCuenta.getNumerodeCuenta()+"', '"+ModeloCuenta.getNombre()+"', '"+ModeloCuenta.getTelefono()
        +"', '"+ModeloCuenta.getNacimiento()+"', '"+ModeloCuenta.getDireccion()+"', '"+ModeloCuenta.getEmail() +"')";
        
        try{
            cn= ConectarBD.Conectar();
            st= cn.createStatement();
            st.execute(sql);
            
            exito= true;
            
            st.close();
            cn.close();
            
            
             JOptionPane.showMessageDialog(null, "Agregado Correctamente");
             System.out.println("Agregado correctamente");
           
        }catch(SQLException e){
            System.out.println("Error al crear Cuenta");
        }
        return exito;
    }
     //Actualiza datos 
     public boolean Actualizar(String Id){
        exito= false;
        st= null;
        cn= null;
        
        sql= "update cuenta set nombre,codigo de cliente, telefono, nacimiento, direccion, email, tipo, numero de cuenta, fecha de apertura= '"+ ModeloCuenta.getNombre()+"', '"+ModeloCuenta.getCodigoCliente()+"', '"+ModeloCuenta.getTelefono()
        +"', '"+ModeloCuenta.getNacimiento()+"', '"+ModeloCuenta.getDireccion()+"', '"+ModeloCuenta.getEmail()+"', '"+ModeloCuenta.getTipo()
            +"', '"+ModeloCuenta.getNumerodeCuenta()+"','"+ModeloCuenta.getFechaApertura()+"' "+
                "where id='"+ModeloCuenta.getId()+"'";
        
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
     //Busca una cuenta en base al ID
      public boolean Buscar(String Id){
        exito= false;
        st= null;
        cn= null;
        
        sql= "select id, nombre from cuenta where id= '"+Id+"'";
        
        try{
            cn= ConectarBD.Conectar();
            st= cn.createStatement();
            rs= st.executeQuery(sql);
            
            VistaCuenta.ImprimirSelect(rs);
            
            exito= true;
        } catch(SQLException e){
            System.out.println("Error en la ejecucion select");
        }
        return exito;
    }
  
           

      public boolean InsertarDeposito(){
        exito= false;
        st= null;
        cn= null;
                
        sql= "insert into deposito values ('"+ModeloCuenta.getNumerodeCuenta()+"', '"+ModeloCuenta.getTipo()+"', '"+ModeloCuenta.getMonto()+"', '"+ ModeloCuenta.getFechaApertura()+"')";
        
        try{
            cn= ConectarBD.Conectar();
            st= cn.createStatement();
            st.execute(sql);
            
            exito= true;
            
            st.close();
            cn.close();
        }catch(SQLException e){
            System.out.println("Error al insertar deposito");
        }
        return exito;
    }
       public boolean InsertarRetiro(){
        exito= false;
        st= null;
        cn= null;
                
        sql= "insert into retiro values ('"+ModeloCuenta.getNumerodeCuenta()+"', '"+ModeloCuenta.getTipo()+"', '"+ModeloCuenta.getMonto()+"', '"+ ModeloCuenta.getFechaApertura()+"')";
        
        try{
            cn= ConectarBD.Conectar();
            st= cn.createStatement();
            st.execute(sql);
            
            exito= true;
            
            st.close();
            cn.close();
        }catch(SQLException e){
            System.out.println("Error al insertar retiro");
        }
        return exito;
    }
       

        public boolean BorrarCuenta(String Id){
        exito= false;
        st= null;
        cn= null;
        
        sql= "delete from deposito where id '"+Id+"'";
        
        try{
            cn= ConectarBD.Conectar();
            st= cn.createStatement();
            st.execute(sql);
            
            exito= true;
            
            st.close();
            cn.close();
        }catch(SQLException e){
            System.out.println("Error en la eliminacion");
        }
        return exito;       
}
   
         public boolean ActualizarmontoCliente(String id){
        exito= false;
        st= null;
        cn= null;
        
        sql= "update cuenta set monto= '"+ModeloCuenta.getMonto()+"' "+ "where codigo_prestamo='"+ModeloCuenta.getId()+"'";
       
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