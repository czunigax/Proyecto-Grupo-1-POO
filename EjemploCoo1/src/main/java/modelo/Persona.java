/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


import java.util.Date;

/**
 *@author gleny
 * 
 */
public class Persona {
    private String Id;
    private String Nombre;
    private String Telefono;
    private String Nacimiento;
    private String Direccion;
    private String Email;
    
    public Persona(){
        
    }
    
    public Persona(String Id, String Nombre, String Telefono, String Nacimiento, String Direccion, String Email){
        this.Id= Id;
        this.Nombre= Nombre;
        this.Telefono= Telefono;
        this.Nacimiento= Nacimiento;  
        this.Direccion= Direccion;
        this.Email= Email;  
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        if (Id == null || Id.equals("")){
            throw new IllegalArgumentException("ID es un dato obligatorio");
        } else {
            this.Id = Id;
        }
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        if (Nombre == null || Nombre.equals("")){
            throw new IllegalArgumentException("Nombre es un dato obligatorio");
        } else {
            this.Nombre = Nombre;
        }
    }
    
     public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
     public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }
     public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        if (Direccion == null || Direccion.equals("")){
            throw new IllegalArgumentException("Dirección es un dato obligatorio");
        }  else {
            this.Direccion = Direccion;
        }
    }
     public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
         if (!Email.contains("@") || !Email.contains(".")) {
            throw new IllegalArgumentException("Correo electrónico es incorrecto");
        } else {
            this.Email = Email;
        }
    }
    
    @Override
    public String toString() {
        String _infoPersona = String.format("Nombre: %s \n"
                + "Fecha nacimiento: %s \n"
                + "DirecciÓn: %s \n"
                + "Telefono: %s \n"
                + "ID: %s \n"
                + "Correo Electronico: %s \n",
                this.Nombre, this.Nacimiento,
                this.Direccion, this.Telefono, this.Id, this.Email);
        return _infoPersona;
    }
}
