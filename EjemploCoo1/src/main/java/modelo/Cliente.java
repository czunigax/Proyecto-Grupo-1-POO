/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

//import java.util.Date;

import java.util.LinkedList;


/**
 *
 * @author cris, gleny
 */
public class Cliente extends Persona  {
   //ATRIBUTOS
   String CodigoCliente;
   String fechaRegistro;
   
   //CONTRUCTOR
   public Cliente(){
    super();
   }
   
     public Cliente (String CodigoCliente, String fechaRegistro){
       super();
        this.CodigoCliente=CodigoCliente;
        this.fechaRegistro=fechaRegistro;
    }
     
     public Cliente(String Nombre, String Id,String CodigoCliente, String fechaRegistro, String Telefono, String Nacimiento, String Direccion, String Email) {
	super(Nombre, Id, Telefono, Nacimiento, Direccion, Email);
	this.CodigoCliente = CodigoCliente;
	this.fechaRegistro = fechaRegistro;
     }
    
   
     //Getters & Setters
   /* public String getCodigoCliente(){
    return CodigoCliente;
    }*/
    
    public void setCodigoCliente(String CodigoCliente){
    this.CodigoCliente=CodigoCliente;
    }
    
    public String getFechaRegistro(){
    return CodigoCliente;
    }
    
    public void setFechaRegistro(String CodigoCliente, String fechaRegistro){
    this.CodigoCliente=CodigoCliente;
    this.fechaRegistro=fechaRegistro;
    }
    
    //METODOS
    
    //COLECCIÓN
    private LinkedList<Cliente> _listaCliente = new LinkedList<>();
    
    /**
     * MÉTODO QUE OBTIENE UN CLIENTE DE LA COLECCIÓN
     *
     * @return ELEMETO COLECCIÓN
     */
    public LinkedList<Cliente> getCliente() {
        return _listaCliente;
    }

    public Cliente getClienteByIndex(int _index){
        return _listaCliente.get(_index);
    }
    public int buscarPosicionCliente(String Id) {
        int posicion = -1;
        for (int i = 0; i < _listaCliente.size();) {
            if (_listaCliente.get(i).getId().equals(Id)) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    
    /**
     * MÉTODO PARA BUSCAR CLIENTE POR ID
     *
     * @param Id
     * @return OBJCLIENTE
     */
    public Cliente buscarCliente(String Id) {
        Cliente clienteBuscado1 = null;
        for (int i = 0; i < _listaCliente.size(); i++) {
            if (_listaCliente.get(i).getId().equals(Id)) {
                clienteBuscado1 = _listaCliente.get(i);
                break;
            }
        }
        return clienteBuscado1;
    }
    
    /**
     * MÉTODO PARA AGREGAR CLIENTE
     *
     * @param cliente
     * @return true - SI SE AGREGO CORRECTAMENTE, CASO CONTRARIO return false
     */
    public boolean agregarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getId()) == null) {
            _listaCliente.add(cliente);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * MÉTODO PARA ELIMINAR CLIENTE DE LA COLECCIÓN
     *
     * @param cliente
     * @return true - SI SE ELIMINO CORRECTAMENTE, CASO CONTRARIO return false
     */
    public boolean eliminarCliente(Cliente cliente) {
        if (buscarPosicionCliente(cliente.getId()) == -1) {
            return false;
        } else {
            _listaCliente.remove(cliente);
            return true;
        }
    }
    
    public boolean eliminarbyIndex(int _posicion){
        _listaCliente.remove(_posicion);
        return true;
    }

    /**
     * MÉTODO PARA MODIFICAR CLIENTE
     *
     * @param clienteModificado
     * @param posicion
     * @return true - SI SE MODIFICO CORRECTAMENTE, CASO CONTRARIO return false.
     */
    public boolean modificarCliente(Cliente clienteModificado, int posicion) {
        if (posicion < 0 || posicion > _listaCliente.size()) {
            return false;
        } else {
            int posicionEncontrada = buscarPosicionCliente(clienteModificado.getId());

            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                _listaCliente.set(posicion, clienteModificado);
                return true;
            } else {
                return false;
            }
        }
    }
    
    /**
     * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN CLIENTE
     *
     * @param posicion
     * @return POSICIÓN O INDICE DE LA COLECIÓN
     */
    public Cliente getClientePorPosicion(int posicion) {
        return _listaCliente.get(posicion);
    }

    /**
     * MÉTODO PARA IMPRIMIR TODA LA COLECCIÓN
     */
    public void imprimirTodos() {
        for (int i = 0; i < _listaCliente.size(); i++) {
            System.out.println(_listaCliente.get(i));
        }
    }
    
    /**
     * MÉTODO PARA CONFIRMAR SI DOS DATOS SON IGUALES
     *
     * @param dato1
     * @param dato2
     * @return true - SI LOS
     */
    public boolean confirmar(String dato1, String dato2) {
        if (dato1.equals(dato2)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * MÉTODO PARA GENERAR CODIGO DE CLIENTE
     *
     * @return CODIGO CLIENTE
     */
    public String getCodigoCliente() {
        String _numCliente = "CLI_" + Integer.toString(_listaCliente.size() + 1);

        return _numCliente;
    }
    
    /*public String getInfoReporteCSV() {
        String _resultado = "Código; Nombre completo; Fecha de nacimiento; Dirección; Teléfono; RTN; Correo electronico; Referecia;\n";
        for (int i = 0; i < _listaCliente.size(); i++) {
            _resultado += _listaCliente.get(i).getCodigoCliente()+ ";" + _listaCliente.get(i).getNombre() + " " +
                    + ";" + _listaCliente.get(i).getFechaNacimiento() + ";" + _listaCliente.get(i).get_direccion()
                    + ";" + _listaCliente.get(i).get_telefono() + ";" + _listaCliente.get(i).get_rtn()
                    + ";" + _listaCliente.get(i).get_referencia().get_nombre() + " " + _listaCliente.get(i).get_referencia().get_apellido() + ";\n";
        }
        return _resultado;
    }*/
    
    //Metodo toString
    @Override
    public String toString() {      
        String _infoCliente = String.format("INFORMACIÓN DEL CLIENTE:\n--------------------------------------\n"
                + "Código: %s\n"
                + "Fecha registro: %s\n"
                + super.toString()
                , this.fechaRegistro);
        return _infoCliente;
    }
}
