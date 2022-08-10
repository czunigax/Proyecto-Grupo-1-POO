/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cris
 */
public class ClienteView {
    private ResultSetMetaData rsmt;
    
 public void ImprimirDatoscliente(String Id, String Nombre, String Direccion){
        System.out.println("Identidad: "+Id);
        System.out.println("Nombre: "+Nombre);
        System.out.println("Direccion: "+Direccion);
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
            Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }                   
    }
 
}
