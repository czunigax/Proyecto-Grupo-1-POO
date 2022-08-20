/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

//import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @authores cristian, Gleny
 */
public abstract class Cuenta extends Cliente{
   //Atributos
   protected String TipodeCuenta;
   protected String NumerodeCuenta;
   protected double Monto;
   protected String FechaApertura;
   double saldo;
    
   //Constructor
    public Cuenta(){
    super();
   }
   
     public Cuenta (String TipodeCuenta, String NumerodeCuenta, double Monto, String FechaApertura ){
       super();
        this.TipodeCuenta=TipodeCuenta;
        this.NumerodeCuenta=NumerodeCuenta;
        this.Monto=Monto;
        this.FechaApertura=FechaApertura;
    }
     
     public Cuenta(String Nombre, String Id,String fechaRegistro, String CodigoCliente, String Telefono, String Nacimiento, String Direccion, String Email, String TipodeCuenta, String NumerodeCuenta, double Monto, String FechaApertura) {
	super(Nombre, Id,CodigoCliente ,fechaRegistro, Telefono, Nacimiento, Direccion, Email);
	this.TipodeCuenta=TipodeCuenta;
        this.NumerodeCuenta=NumerodeCuenta;
        this.Monto=Monto;
        this.FechaApertura=FechaApertura;
	
     }
     
    //Getters & Setters
    public String getTipo(){
    return TipodeCuenta;
    }
    public void setTipo(String TipodeCuenta){
    this.TipodeCuenta=TipodeCuenta;
    }
    public String getNumerodeCuenta(){
    return NumerodeCuenta;
    }
    public void setNumeroC(String NumerodeCuenta){
    this.NumerodeCuenta=NumerodeCuenta;
    }
     public double getMonto(){
    return Monto;
    }
    public void setMonto(double Monto){
        if(Monto <= 0){
            throw new IllegalArgumentException("El saldo debe ser mayor a cero.");
        }else{
            this.Monto=Monto;
        }
    }
    public String getFechaApertura(){
    return FechaApertura;
    }
    public void setFechaApertura(String FechaApertura){
    this.FechaApertura=FechaApertura;
    }
    
     
    //PARA GESTIONES DE LA CLASE CUENTA
    //COLECCIÓN PARA REALIZAR COMPORTAMIENTO POLIMORFICO
    private LinkedList<Cuenta> listacuentas = new LinkedList<>();
   
    
   /**
     * MÉTODO PARA OBTENER CO
     * @return LECCIÓN
     *
     */
    public LinkedList<Cuenta> getCuenta() {
        return listacuentas;
    }
    
    public boolean agregar(Cuenta cuenta) {
		if(buscarcliente(cuenta.getId())==-1){
		listacuentas.add(cuenta);
	    return true;
		}
		else {
		return false;
	}	
	}
    
    public int buscarcliente(String codigo){
		int posicion=-1;
		for(int i=0;i<listacuentas.size();i++){
			if(listacuentas.get(i).getId().equals(codigo)){
				posicion=i;
				break;}
			}
		return posicion;
	}	
    public void imprimirtodo() {
		for(int i=0;i<listacuentas.size();i++) {
			JOptionPane.showMessageDialog(null,listacuentas.get(i));
		}
	}
    /**
     * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCI�N TIPO DE CUENTA
     * @param _index
     * @return POSICIÓN O INDICE DE LA COLECCIÓN
     */
   /* public Cuenta getCuenta(int _index) {
        return _listaTipoCuenta.get(_index);
    }/*
    
   /*
     * MÉTODO QUE BUSCA TIPO DE CUENTA
     *
     * @param numeroCuenta
     * @return null, SI NO SE ENCUENTRA TIPO CUENTA, CASO CONTRARIO return OBJ
     * CUENTA 
     */
     /*public Cuenta buscarTipoCuenta(String numeroCuenta) {
        Cuenta cuentaBuscada = null;
        for (int i = 0; i < _listaTipoCuenta.size(); i++) {
            if (_listaTipoCuenta.get(i).getNumerodeCuenta().equals(numeroCuenta)) {
                cuentaBuscada = _listaTipoCuenta.get(i);
            }
        }
        return cuentaBuscada;
    }*/
     /*
      * METODO BUSCAR TIPO DE CUENTA 
      * @param numeroCuenta
      * @param tipoCta
      * @return 
      */
    
   /* public Cuenta buscarTipoCuenta(String numeroCuenta, String tipoCta) {
        Cuenta cuentaBuscada = null;
        for (int i = 0; i < _listaTipoCuenta.size(); i++) {
            if (_listaTipoCuenta.get(i).getNumerodeCuenta() == numeroCuenta
                    && _listaTipoCuenta.get(i).getTipo().equals(tipoCta)) {
                cuentaBuscada = _listaTipoCuenta.get(i);
            }
        }
        return cuentaBuscada;
    }*/
    
    /*
     * MÉTODO QUE AGREGA TIPO DE CUENTA
     *
     * @param tipoCuenta
     * @return true - SI SE AGREGA CORRECTAMENTE, CASO CONTRARIO return false
     */
    
     /*   public boolean agregarTipoCuenta(Cuenta tipoCuenta) {
        if (buscarTipoCuenta(tipoCuenta.getNumerodeCuenta()) == null) {//Si la cuenta no esta agregada
            _listaTipoCuenta.add(tipoCuenta);
            return true;
        } else {
            return false;
        }
    }*/
        
    //Metodo para eliminar cuenta
   /* public boolean eliminarTipoCuenta(Cuenta tipoCuenta) {
        if (buscarTipoCuenta(tipoCuenta.getNumerodeCuenta()) == null) {
            return false;
        } else {
            _listaTipoCuenta.remove(tipoCuenta);
            return true;
       }
    }
    */
    //DEFINICION DE METODOS ABSTRACTOS
    public abstract boolean depositar(double cantidad);

    public abstract boolean retirar(double cantidadRetirar);

    public abstract double consultar();
    
}
