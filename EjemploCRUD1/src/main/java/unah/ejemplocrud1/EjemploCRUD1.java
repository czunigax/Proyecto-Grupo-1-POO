/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package unah.ejemplocrud1;
import controller.ClienteController;
import controller.CuentaController;
import modelo.Persona;
import view.PersonaView;
import controller.PersonaController;
import controller.RetiroController;
import modelo.Cliente;
import modelo.Cuenta;
import modelo.Retiro;
import view.ClienteView;
import view.CuentaView;
import view.RetiroView;

/**
 *
 * @author migsauceda
 */
public class EjemploCRUD1 {

    public static void main(String[] args) {
        //Cliente
       ClienteView vistacliente= new ClienteView();
       Cliente modeloCliente = new Cliente();
       ClienteController controladorCliente= new ClienteController(modeloCliente, vistacliente);
        
       //Cuenta
       CuentaView vistacuenta = new CuentaView();
       Cuenta modeloCuenta = new Cuenta();
       CuentaController controladorcuenta = new CuentaController(modeloCuenta, vistacuenta); 
       
       
       
      /*
       //modificar info en base al Id
        System.out.println("Modificar");
        controlador.setNombre("Nombre xd");

        controlador.Update("123");
        
        controlador.ActualizarVista();
        
        //traer info de la BD
        System.out.println("Informacion de la BD");
        controlador.Select("123");
        
       // controlador.ActualizarVista();*/
       
     
        
        //Tabla Cliente
        
        controladorCliente.ActualizarVistaCliente();
        
        controladorCliente.setNombre("Karim Benzema");
        controladorCliente.setId("090019");
        controladorCliente.setDireccion("La torocaua");
        controladorcuenta.setIdcuenta("200");
        controladorcuenta.setTipoCuenta("Navidena");
       
        
       controladorCliente.ActualizarVistaCliente();
       controladorcuenta.Insertar();
       controladorCliente.Insertar();
       
       //Tabla Cuenta
       
       
       
    }
    

}
