/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author pablo
 */
public class Pedido{
    private int numero;
    private Cliente cliente;
    private ArrayList<Producto> listaProductos;
    private String observaciones;
    private int precio;

    public Pedido() {
        this.numero=1;
        this.cliente = null;
        this.listaProductos = new ArrayList<Producto>();
        this.observaciones ="";
        this.precio = 0;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    private void setProducto(ArrayList<Producto> p) {
        this.listaProductos = p;
    }

    public String getObservaciones() {
        return observaciones;
    }

    private void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getPrecio() {
        return precio;
    }

    private void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
    
}
