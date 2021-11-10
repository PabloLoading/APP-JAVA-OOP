/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Pedido {
    private Cliente cliente;
    private ArrayList<Producto> listaProductos;
    private String observaciones;
    private int precio;

    public Pedido(Cliente cliente, ArrayList<Producto> producto, String observaciones, int precio) {
        this.cliente = cliente;
        this.listaProductos = producto;
        this.observaciones = observaciones;
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    private void setCliente(Cliente cliente) {
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
