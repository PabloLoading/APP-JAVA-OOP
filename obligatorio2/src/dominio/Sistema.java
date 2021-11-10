
package dominio;

import java.util.*;

public class Sistema {
    private ArrayList<Pedido> listaPedidos;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Categoria> listaCategorias;
    
    public Sistema(){
        listaPedidos=new ArrayList<Pedido>();
        listaClientes=new ArrayList<Cliente>();
        listaProductos=new ArrayList<Producto>();
        listaCategorias=new ArrayList<Categoria>();
    }
    
    //adders y gets
    public void agregarPedido(Pedido p){
        listaPedidos.add(p);
    }
    public void agregarCliente(Cliente c){
        listaClientes.add(c);
    }
    public void agregarProducto(Producto p){
        listaProductos.add(p);
    }
    public void agregarCategoria(Categoria c){
        listaCategorias.add(c);
    }
    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }
    
    
    
    
}
