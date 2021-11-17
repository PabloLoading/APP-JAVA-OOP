
package dominio;

import java.util.*;

public class Sistema extends Observable {
    private ArrayList<Pedido> listaPedidos;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Categoria> listaCategorias;
    public Pedido pedidoActual; 
    
    public Sistema(){
        listaPedidos=new ArrayList<Pedido>();
        listaClientes=new ArrayList<Cliente>();
        listaProductos=new ArrayList<Producto>();
        listaCategorias=new ArrayList<Categoria>();
        pedidoActual=new Pedido();
    }
    
    //adders y gets
    public void agregarPedido(Pedido p){
        listaPedidos.add(p);
        setChanged();
        notifyObservers();
    }
    public void agregarCliente(Cliente c){
        listaClientes.add(c);
        setChanged();
        notifyObservers();
    }
    public void agregarProducto(Producto p){
        listaProductos.add(p);
        setChanged();
        notifyObservers();
    }
    public void agregarCategoria(Categoria c){
        listaCategorias.add(c);
        setChanged();
        notifyObservers();
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
    public Pedido getPedidoActual(){
        return pedidoActual;
    }
    public void actualizarTodo(){
        setChanged();
        notifyObservers();
    }
    
    
    
    
}
