/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import Interfaces.Interes;
import java.util.Date;
import java.util.LinkedList;
/**
 *
 * @author kevin, Olbin, Gleny
 */
public class Prestamo implements Interes {
        
    //Atributos
    private Date TiempoPago;
    private String codigoPrestamo;
    private double ValorIntereses;
    private Date FechaInicio;
    private Date FechaFinal;
    private String TipoCuenta;

  
    //Constructor
     public Prestamo(){
         
     }
    
     public Prestamo(Date TiempoPago, String codigoPrestamo, double ValorIntereses,Date FechaInicio,Date FechaFinal,String TipoCuenta){
            this.TiempoPago=TiempoPago;
            this.codigoPrestamo=codigoPrestamo;
            this.ValorIntereses=ValorIntereses;
            this.FechaInicio=FechaInicio;
            this.FechaFinal=FechaFinal;
            this.TipoCuenta=TipoCuenta;
     }
     
    //Getters & Setters
    public Date getTiempoPago(){
         return TiempoPago;
        }
    
    public void setTiempoPago(Date TiempoPago){
            this.TiempoPago=TiempoPago;
        }
        
    public String getCodigoP(){
        return codigoPrestamo;
    }
    
    public void setCodigoP(String codigoPrestamos){
        this.codigoPrestamo=codigoPrestamo;
    }
    
    public double getValorIntereses() {
        return ValorIntereses;
    }

    public void setValorIntereses(double ValorIntereses) {
        this.ValorIntereses = ValorIntereses;
    }
    
    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }
    
        
        
      public void SolicitarPrestamo(){
      
      } 
      
      //RELIZANDO COMPORTAMIENTO POLIMORFICO
      private final LinkedList<Prestamo> _listasPrestamos = new LinkedList<>();
      
      /**
     * MÉTODO PARA OBTENER POSICIÓN DE LA COLECCIÓN DE PAGOS
     *
     * @param posicion
     * @return POSICI�N O INDICE DE LA COLECI�N
     */
      public Prestamo getPrestamsPorPoscion(int posicion) {
        return _listasPrestamos.get(posicion);
      }
      
      /**
     * MÉTODO PARA OBTENER COLECCIÓN
     *
     * @return _listastPagos
     */
    public LinkedList<Prestamo> getPagos() {
        return _listasPrestamos;
    }
    
      /**
     * MÉTODO PARA BUSCAR PRESTAMO
     *
     * @param _codigoPrestamo
     * @return pagobuscado
     */
     public Prestamo buscarPagoCodigo(String _codigoPrestamo) {
        Prestamo prestamoBuscado = null;
        for (int i = 0; i < _listasPrestamos.size(); i++) {
            if (_listasPrestamos.get(i).getCodigoP().equals(_codigoPrestamo)){
            } else {
                prestamoBuscado = _listasPrestamos.get(i);
                break;
            }
        }
        return prestamoBuscado;
     }
    
      public Prestamo buscarPago(Prestamo _Pago) {
        Prestamo pagobuscado = null;
        for (int i = 0; i < _listasPrestamos.size(); i++) {
            if (_listasPrestamos.get(i).equals(_Pago)) {
                pagobuscado = _listasPrestamos.get(i);
                break;
            }
        }
        return pagobuscado;
    }
      
      /**
     * MÉTODO QUE OBTIENE LA POSICION DE LA COLECCION PAGO
     *
     * @param pago
     * @return POSICION DE LA COLECCI�N
     */
        public int buscarPorPosicionPago(Prestamo pago) {
        int posicion = -1;
        for (int i = 0; i < _listasPrestamos.size(); i++) {
            if (_listasPrestamos.get(i).equals(pago)) {
                posicion = i;
            }
        }
        return posicion;
    }
    
   /**
     * MÉTODO QUE AGREGAR PAGO
     *
     * @param PagoPrestamo
     * @return true - SI SE AGREGA CORRECTAMENTE, CASO CONTRARIO return false
     */
    public boolean agregarPagoPrestamo(Prestamo PagoPrestamo) {
        if (buscarPagoCodigo(PagoPrestamo.getCodigoP()) == null) {//Si el pago no esta agregado			
            _listasPrestamos.add(PagoPrestamo);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * MÉTODO QUE MODIFICA EL PAGO DE PRESTAMO
     *
     * @param pagoModificar
     * @param posicion
     * @return true - SI SE MODIFICA CORRECTAMENTE, CASO CONTRARIO return false
     */
    public boolean modificarPago(Prestamo pagoModificar, int posicion) {
        if (posicion < 0 || posicion > _listasPrestamos.size()) {
            return false;
        } else {
            int posicionEncontrada = buscarPorPosicionPago(pagoModificar);
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                _listasPrestamos.set(posicion, pagoModificar);
                return true;
            } else {
                return false;
            }
        }
    }
    
    /**
     * METODO PARA ELIMINAR PAGO DE PRESTAMO
     * @param pagoEliminar
     * @return 
     */
    public boolean eliminarPago(Prestamo pagoEliminar) {
        if (buscarPagoCodigo(pagoEliminar.getCodigoP()) != null) {
            _listasPrestamos.remove(buscarPago(pagoEliminar));
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarPorCodigo(String codigoPago) {
        if (buscarPagoCodigo(codigoPago) == null) {	//Si el motodo buscarPorNumero retorna -1.
            return false;
        } else {													//Caso contrario
            _listasPrestamos.remove(buscarPagoCodigo(codigoPago)); //Le pasamos como argumento a remove la posicion que devuelve el motodo
            return true;											//buscarPorNumero

        }

    }
    
      /**
     * MÉTODO PARA IMPRIMIR TODOS
     */
    public void imprimirTodos() {
        for (int i = 0; i < _listasPrestamos.size(); i++) {
            System.out.println(_listasPrestamos.get(i));
        }
    }
    
    //Metodo toString
    @Override
    public String toString() {
        String _Prestamo = String.format("INFORMACIÓN DE PRESTAMO:\n--------------------------------------\n"
                +"TiempoPago: "+TiempoPago+"\n"
                +"ValorIntereses: "+ValorIntereses+"\n"
                +"FechaInicio: "+FechaInicio+"\n"
                +"FechaFinal: "+FechaFinal+"\n"
                +"TipoCuenta: "+TipoCuenta+"\n"
        );
        return _Prestamo;
    }

    @Override
    public double CalculoInteres(double monto) {
        double Intereses = 0;

        if (monto >= 0 || monto <= 500000) {
            Intereses = (monto * (0.0));
            this.ValorIntereses += Intereses;
            return Intereses;
        } else if (monto >= 500000 || monto <= 1000000) {
            Intereses = (monto * (0.0025));
            this.ValorIntereses += Intereses;
            return Intereses;
        } else if (monto >= 1000000 || monto <= 2000000) {
            Intereses = (monto * (0.005));
            this.ValorIntereses += Intereses;
            return Intereses;
        } else if (monto >= 2000000 || monto > 2000000) {
            Intereses = (monto * (0.0356));
            this.ValorIntereses += Intereses;
            return Intereses;
        } else {
            return Intereses;
        }
    }
      
}
