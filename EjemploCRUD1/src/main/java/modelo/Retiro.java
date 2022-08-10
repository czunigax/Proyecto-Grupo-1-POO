/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author cristian
 */
public class Retiro extends Persona{

private String monto;
private String nombre;

public Retiro(){

}

public Retiro(String monto, String nombre){
this.monto=monto;
this.nombre=nombre;
}
public String getNombre(){
return nombre;
}
public void setNombre(String nombre){
this.nombre=nombre;
}
public String getMonto(){
return monto;
}
public void setMonto(String monto){
this.monto=monto;
}
}
