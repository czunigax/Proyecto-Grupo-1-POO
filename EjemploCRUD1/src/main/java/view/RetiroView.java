/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author cristian
 */
public class RetiroView {
    
 private ResultSetMetaData rsmt;  
 
 public void ImprimirDatosRetiro( String Nombre, String Monto){
        System.out.println("Nombre: "+Nombre);
        System.out.println("Monto: "+Monto);
    } 
     public void ImprimirSelectRetiro(ResultSet rs){
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
            Logger.getLogger(RetiroView.class.getName()).log(Level.SEVERE, null, ex);
        }                   
    }
}
