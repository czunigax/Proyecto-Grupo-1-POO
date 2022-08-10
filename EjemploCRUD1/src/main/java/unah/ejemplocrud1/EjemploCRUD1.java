/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package unah.ejemplocrud1;
import controller.ClienteController;
import modelo.Persona;
import view.PersonaView;
import controller.PersonaController;
import controller.RetiroController;
import modelo.Cliente;
import modelo.Retiro;
import view.ClienteView;
import view.RetiroView;

/**
 *
 * @author migsauceda
 */
public class EjemploCRUD1 {

    public static void main(String[] args) {
        //delcara el modelo y la vista
       ClienteView vistacliente= new ClienteView();
       Cliente modeloCliente = new Cliente();
        //ahora se instancia el controlador y este actualiza a la vez modelo y vista
        ClienteController controladorCliente= new ClienteController(modeloCliente, vistacliente);
        
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
        
       controladorCliente.ActualizarVistaCliente();
       controladorCliente.Insertar();
       
    }
    

}
