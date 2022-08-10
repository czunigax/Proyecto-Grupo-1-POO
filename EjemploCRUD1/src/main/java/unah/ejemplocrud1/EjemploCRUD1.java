/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package unah.ejemplocrud1;
import modelo.Persona;
import view.PersonaView;
import controller.PersonaController;
import controller.RetiroController;
import modelo.Retiro;
import view.RetiroView;

/**
 *
 * @author migsauceda
 */
public class EjemploCRUD1 {

    public static void main(String[] args) {
        System.out.println("Sin persistencia en BD");
        //delcara el modelo y la vista
        Retiro modeloRetiro = InsertNOpersistenteRetiro();
        RetiroView vistaRetiro = new RetiroView();
        Persona modelo= InsertNOpersistente();
        PersonaView vista= new PersonaView();
        
        
        //ahora se instancia el controlador y este actualiza a la vez modelo y vista
        PersonaController controlador= new PersonaController(modelo, vista);
        
        //comprobar que actualizo
        controlador.ActualizarVista();
        
        //ahora probar hacer cambios
        controlador.setNombre("la pepe");
        
        //comprobar el cambio
        controlador.ActualizarVista();
        
       System.out.println("Persistente");
        controlador.Insertar();
        
        //modificar info en base al Id
        System.out.println("Modificar");
        controlador.setNombre("Nombre xd");

       controlador.Update("123");
        
        controlador.ActualizarVista();
        
        //traer info de la BD
        System.out.println("Informacion de la BD");
        controlador.Select("123");
        
       // controlador.ActualizarVista();
       
        RetiroController controladorRetiro= new RetiroController(modeloRetiro, vistaRetiro);
        controladorRetiro.ActualizarVista();
        
        controladorRetiro.setNombre("El abuelo");
        controladorRetiro.setmonto("2000");
       
        controladorRetiro.ActualizarVista();
        
        controladorRetiro.Insertar();
       
       
    }
    
    public static Persona InsertNOpersistente(){
        Persona oPersona= new Persona();
        oPersona.setId("123");
        oPersona.setNombre("Nombre codigo 123");
        
        return oPersona;
    }
    public static Retiro InsertNOpersistenteRetiro(){
        Retiro obRetiro= new Retiro();
        obRetiro.setMonto("500");
        obRetiro.setNombre("el abuelo reforged");
        
        return obRetiro;
    }
}
