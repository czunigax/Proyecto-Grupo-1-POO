/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package unah.ejemplocrud1;


import controller.CuentaController;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Cuenta;
import view.CuentaView;



/**
 *
 * @author migsauceda
 */
public class EjemploCRUD1 {

    public static void main(String[] args) throws SQLException {
        
    CuentaView vistacuenta = new CuentaView();
    Cuenta modelocuenta = new Cuenta() {
        @Override
        public boolean depositar(double cantidad) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean retirar(double cantidadRetirar) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public double consultar() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    CuentaController controladorcuenta = new CuentaController(modelocuenta, vistacuenta);


    
        
        
       
       
      /*
       //modificar info en base al Id
        System.out.println("Modificar");
        controlador.setNombre("Nombre xd");

        controlador.Update("123");
        
        controlador.ActualizarVista();
        
        //traer info de la BD
        System.out.println("Informacion de la BD");
        controlador.Select("123");
        
       // controlador.ActualizarVista();
       
    
       
      
      
       
       
       //Tabla Cuenta
       
     
*/     
     controladorcuenta.ActualizarVista();
   //  controladorcuenta.SumadeMonto();
     
     //controladorcuenta.setId("1");
    // controladorcuenta.setNombre("d d");
    // controladorcuenta.setCodigoCliente("1");
     //controladorcuenta.setTelefono("1");
    // controladorcuenta.setNacimiento("12/11/92");
    // controladorcuenta.setDireccion("Col. loarque 3a calle");
    // controladorcuenta.setEmail("er@gmail.com");
     /*controladorcuenta.setNumerodeCuenta("2");
     controladorcuenta.setTipo("enfermo");
     controladorcuenta.setMonto(9);
     controladorcuenta.setFechaApertura("21/10/2017");*/
     
    /* controladorcuenta.setNumerodeCuenta("2");
    
     controladorcuenta.setMonto(20);*/
     
    // controladorcuenta.InsertarDeposito();
    
  
    
     
    }
    

}
