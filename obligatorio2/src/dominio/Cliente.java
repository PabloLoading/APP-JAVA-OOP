
package dominio;

import java.io.Serializable;
import java.util.Observable;

public class Cliente implements Serializable{
    private String nombre;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    private void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String toString(){
        return nombre+" ("+telefono+")";
    }
    public Object clone(){
        Object obj=null;
        try{
            obj=super.clone();
        }
        catch(CloneNotSupportedException e){
        }
        return obj;
    }
    
}
