/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package unah.ejemplocrud1;


import controller.CuentaController;

import java.sql.SQLException;

import java.util.Scanner;

import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Cooperativa;
import modelo.Cuenta;
import modelo.CuentaAportaciones;
import modelo.CuentaEspecial;
import modelo.Empleado;
import ventanas.Prestamo;
import view.CuentaView;



/**
 *
 * @author migsauceda, Gleny 
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
    
        //INSTANCIAS DE SCANNER
        Scanner sc = new Scanner(System.in);
        Scanner scnum = new Scanner(System.in);

        //VARIABLES A UTILIZAR
        //VARIABLES DDE DATOS DE CLIENTE
        String nombre, direccion, telefono, id, Email, codigoCliente = null, fechaNacimiento, fechaRegistro,
                nombreEmpresa, direccionEmpresa, tipoCuenta, numeroCuenta, fechaApertura, fechaDeposito,
                nombreCE, fechaRetiro, codigoEmpleado, cargo, tiempoPago, codigoPrestamo, fechaInicio, fechaFinal;
    
        int idCE;
        
        byte opcionInicio;
        double monto, interes, valorInteres, montoPagar;
        
        boolean centinelaInicio = true;
        //HEREDAN DE PERSONA
        Cliente cliente1 = new Cliente();
        Empleado cajero = new Empleado();
        Empleado analista = new Empleado();
        
        //COOPERATIVA
        Cooperativa empresa = new Cooperativa();
        
        //HEREDAN DE CUENTA
        CuentaAportaciones cuentaAP = new CuentaAportaciones();
        CuentaEspecial cuentaE = new CuentaEspecial();
        
        //PRESTAMO
        Prestamo prestamo1 = new Prestamo();
        
 //--------------------------------------INICIO-------------------------------------------//
        while (centinelaInicio){
            System.out.println("MENU DE INICIO");
            System.out.println("1. CREAR CUENTA.");
            System.out.println("2. TRANSACCIONES.");
            System.out.println("3. PRESTAMO.");
            System.out.println("4. CONSULTA");
            System.out.println("5. SALIR.");
            opcionInicio = scnum.nextByte();
            
            switch(opcionInicio){
                case 1://CREAR CUENTA
                    break;
                    
                case 2://TRANSACCIONES
                    byte opcionTransaccion;
                    boolean centinelaTransaccion = true;
                    
                    while (centinelaTransaccion){
                        System.out.println("MENU DE TRANSACCIONES.");
                        System.out.println("1. DEPOSITO.");
                        System.out.println("2. RETIRO.");
                        System.out.println("3. MENU.");
                        opcionTransaccion = scnum.nextByte();
                        
                        switch (opcionTransaccion){
                            case 1://DEPOSITAR
                                System.out.println("Seleccione el tipo de cuenta en la que quiere depositar:");
                                System.out.println("1. Cuenta de ahorro.");
                                System.out.println("2. Cuenta de cheques.");
                                System.out.println("3. Cuenta corriente personal.");
                                //opcion = scnum.nextByte();
                        }
                    }
                    break;
                case 3:
                    break;
                
            }
        } 
     
    }
    

}
