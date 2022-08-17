/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package unah.ejemplocrud1;


import controller.CuentaController;
import modelo.Persona;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Cuenta;
import view.CuentaView;



/**
 *
 * @author migsauceda
 */
public class EjemploCRUD1 {

    public static void main(String[] args) {
        
    CuentaView vistacuenta = new CuentaView();
    Cuenta modelocuenta = new Cuenta();
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
     
     controladorcuenta.setId("080119992222");
     controladorcuenta.setNombre("Manuel Jonhson");
     controladorcuenta.setCodigoCliente("1212");
     controladorcuenta.setTelefono("90897886");
     controladorcuenta.setNacimiento("12/11/92");
     controladorcuenta.setDireccion("Col. loarque 3a calle");
     controladorcuenta.setEmail("poetadelamor@gmail.com");
     controladorcuenta.setTipo("Navidena");
     controladorcuenta.setNumerodeCuenta("#111");
     controladorcuenta.setMonto(20000);
     controladorcuenta.setFechaApertura("21/10/2017");
     
     controladorcuenta.AperturarCuenta();
     controladorcuenta.ActualizarVista();
     
     
      controladorcuenta.ActualizarVista();
     
     controladorcuenta.setId("080119992222");
     controladorcuenta.setNombre("Manuel Jonhson");
     controladorcuenta.setCodigoCliente("1212");
     controladorcuenta.setTelefono("90897886");
     controladorcuenta.setNacimiento("12/11/92");
     controladorcuenta.setDireccion("Col. loarque 3a calle");
     controladorcuenta.setEmail("poetadelamor@gmail.com");
     controladorcuenta.setTipo("Navidena");
     controladorcuenta.setNumerodeCuenta("#111");
     controladorcuenta.setMonto(20000);
     controladorcuenta.setFechaApertura("21/10/2017");
     
     controladorcuenta.AperturarCuenta();
     controladorcuenta.ActualizarVista();
     
     
    }
    

}
