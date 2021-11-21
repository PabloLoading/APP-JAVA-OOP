
package dominio;

import java.io.Serializable;
import java.util.*;

public class Sistema extends Observable implements Serializable{
    private ArrayList<Pedido> listaPedidos;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Categoria> listaCategorias;
    private Pedido pedidoActual; 
    
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
    public void pedidoNuevo(){
        pedidoActual=new Pedido();
    }
    public Categoria buscarCatgoria(String n){
        boolean encontro=false;
        Categoria cat=null;
        for (int i = 0; i <listaCategorias.size() && !encontro; i++) {
            if(listaCategorias.get(i).getDescripcion().equals(n)){
                encontro=true;
                cat=listaCategorias.get(i);
            }
        }
        return cat;
    }
    
    
    public void actualizarPrecioPedido(){
        pedidoActual.calcularPrecio();
    }
    public void setNumPedido(){
        pedidoActual.setNumero(listaPedidos.size()+1);
    }
    public void ordenarPorDescripcion(){
        Collections.sort(listaCategorias,new Comparator<Categoria>(){
            public int compare(Categoria cat1,Categoria cat2){
                return cat1.getDescripcion().toLowerCase().compareTo(cat2.getDescripcion().toLowerCase());
            }
        });
    }
    public void ordenarPorPrioridad(){
    listaCategorias.sort(new criterioPrioridad());
    }
    private class criterioPrioridad implements Comparator<Categoria>{
       @Override
       public int compare(Categoria cat1,Categoria cat2){
       return cat2.getPrioridad()-cat1.getPrioridad();
       }
    
    }
    public boolean stringValido(String unString){
    boolean esValido=true;
        if(unString.trim().equals("")){
            esValido=false;
        }
    return esValido;
    }
    public boolean clienteValido(String unNombre){
        boolean esValido=stringValido(unNombre);
        for (int i = 0; i < listaClientes.size()&&esValido; i++) {
            if(listaClientes.get(i).getNombre().toLowerCase().trim().equals(unNombre.toLowerCase().trim())){
                esValido=false;
            }
            
        }
        return esValido;
    }
    
    public boolean productoValido(String unNombre){
        boolean esValido=stringValido(unNombre);
        for (int i = 0; i < listaProductos.size()&&esValido; i++) {
            if(listaProductos.get(i).getNombre().toLowerCase().trim().equals(unNombre.toLowerCase().trim())){
                esValido=false;
            }
    }
        return esValido;
    }
    
    public boolean categoriaValido(String unNombre){
        boolean esValido=stringValido(unNombre);
        for (int i = 0; i < listaCategorias.size()&&esValido; i++) {
            if(listaCategorias.get(i).getDescripcion().toLowerCase().trim().equals(unNombre.toLowerCase().trim())){
                esValido=false;
            }
        }
        return esValido;
    }
    
    public boolean esNumero(String num) {
    if (num == null) {
        return false;
    }
    int length = num.length();
    if (length == 0) {
        return false;
    }
    int i = 0;
    if (num.charAt(0) == '-') {
        if (length == 1) {
            return false;
        }
        i = 1;
    }
    for (; i < length; i++) {
        char c = num.charAt(i);
        if (c < '0' || c > '9') {
            return false;
        }
    }
    return true;
}
}

    

