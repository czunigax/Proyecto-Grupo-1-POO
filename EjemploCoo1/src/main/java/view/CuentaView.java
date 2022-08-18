/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author cris
 */
public class CuentaView {
     private ResultSetMetaData rsmt;
    
    public void ImprimirDatosCuenta(String Nombre, String Id,String CodigoCliente, String Telefono, String Nacimiento, String Direccion, String Email, String TipodeCuenta, String NumerodeCuenta, double Monto, String FechaApertura){
        System.out.println("Identidad: "+Id);
        System.out.println("Nombre: "+Nombre);
        System.out.println("CodigoCliente: "+CodigoCliente);
        System.out.println("Telefono: "+Telefono);
        System.out.println("Nacimiento: "+Nacimiento);
        System.out.println("Direccion: "+Direccion);
        System.out.println("Email: "+Email);
        System.out.println("Tipo: "+TipodeCuenta);
        System.out.println("Numero de Cuenta: "+NumerodeCuenta);
        System.out.println("Monto: "+Monto);
        System.out.println("Fecha de apertura: "+FechaApertura);
    } 

    public void ImprimirSelect(ResultSet rs){
        try {
            rsmt= rs.getMetaData();
            
            int columnas= rsmt.getColumnCount();
            while (rs.next()){
                System.out.println("Datos:");
                for (int i= 1; i <= columnas; i++){
                    System.out.println("Columna "+i+": "+rs.getString(i));
                }
            }            
        } catch (SQLException ex) {
            Logger.getLogger(CuentaView.class.getName()).log(Level.SEVERE, null, ex);
        }                   
    }
}
