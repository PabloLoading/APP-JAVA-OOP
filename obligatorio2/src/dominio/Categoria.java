
package dominio;

public class Categoria {
    private String descripcion;
    private int prioridad;
    private String detalles;

    public Categoria(String descripcion, int prioridad, String detalles) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.detalles = detalles;
    }

    public String getDescripcion() {
        return descripcion;
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    private void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getDetalles() {
        return detalles;
    }

    private void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
    public String toString(){
        return this.descripcion;
    }
   
    public boolean equals(Object o){
        return this.descripcion.equals(((Categoria)o).descripcion);
    }
    
}
