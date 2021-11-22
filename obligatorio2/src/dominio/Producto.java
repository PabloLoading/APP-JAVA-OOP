//Pablo Duran (270956) , Santiago Villar (256345)
package dominio;

import java.io.Serializable;

public class Producto implements Serializable{
    private String nombre;
    private int precio;
    private Categoria[] categorias;

    public Producto(String nombre, int precio, Categoria[] categorias) {
        this.nombre = nombre;
        this.precio = precio;
        this.categorias = categorias;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    private void setPrecio(int precio) {
        this.precio = precio;
    }

    public Categoria[] getCategorias() {
        return categorias;
    }

    private void setCategorias(Categoria[] categorias) {
        this.categorias = categorias;
    }
    public String toString(){
        return nombre+" $"+precio;
    }
    
}
