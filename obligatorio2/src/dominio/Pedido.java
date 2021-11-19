/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author pablo
 */
public class Pedido implements Serializable{
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

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    
    public Cliente getCliente() {
        return cliente;
    }
    public int getNumero(){
        return numero;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    public void agregarProducto(Producto p){
        listaProductos.add(p);
    }
    public void eliminarProducto(Producto p){
        listaProductos.remove(p);
    }
    private void setProducto(ArrayList<Producto> p) {
        this.listaProductos = p;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getPrecio() {
        return precio;
    }

    private void setPrecio(int precio) {
        this.precio = precio;
    }
    public void calcularPrecio(){
        int pC=0;
        for(Producto p : listaProductos){
            pC+=p.getPrecio();
        }
        this.setPrecio(pC);
    }
    
    
        @Override
    public String toString(){
        return "Pedido "+numero+" "+cliente.getNombre();
               
    }
    
    
    
    
    
}
