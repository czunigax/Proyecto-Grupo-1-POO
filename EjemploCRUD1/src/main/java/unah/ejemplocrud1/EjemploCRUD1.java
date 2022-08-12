/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package unah.ejemplocrud1;


import controller.CuentaController;
import modelo.Persona;
import view.PersonaView;
import controller.PersonaController;
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


    
        
        //Cliente
     /*  ClienteView vistacliente= new ClienteView();
       Cliente modeloCliente = new Cliente();
       ClienteController controladorCliente= new ClienteController(modeloCliente, vistacliente);
        
       //Cuenta
      /* CuentaView vistacuenta = new CuentaView();
       Cuenta modeloCuenta = new Cuenta();
       CuentaController controladorcuenta = new CuentaController(modeloCuenta, vistacuenta); /*
       
       
       
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
       
     
       String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
       String Id = JOptionPane.showInputDialog("Ingrese su id");
       String Idcuenta = JOptionPane.showInputDialog("Ingrese su idcuenta");
       String Tipo = JOptionPane.showInputDialog("Ingrese su tipo");
      
       //Tabla Cliente
        
        controladorCliente.ActualizarVistaCliente();
        
       
        
       controladorCliente.setNombre(nombre);
       controladorCliente.setId(Id);
       controladorCliente.setDireccion("La torocaua");
       
       
        controladorCliente.Insertar();
        
        controladorCliente.ActualizarVistaCliente();
       
      
      
       
       
       //Tabla Cuenta
       
     
*/     
     
     
    }
    

}
