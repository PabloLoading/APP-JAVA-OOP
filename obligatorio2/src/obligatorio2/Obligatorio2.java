


package obligatorio2;
import interfaz.*;
import dominio.*;

public class Obligatorio2 {

    public static void main(String[] args) {
        Sistema sistema=new Sistema();
        
        
        VentanaInicio vent=new VentanaInicio(sistema);
        vent.setVisible(true);
        //Valores default para probar
        
        Categoria cat1=new Categoria("carnes",4,"carnes blancas");
        Categoria cat2=new Categoria("bebidas",7,"bebidas de todo tipo");
        sistema.agregarCategoria(cat1);
        sistema.agregarCategoria(cat2);
        
        Cliente c1=new Cliente("Pablo","Benito Blanco 1340","092452251");
        Cliente c2=new Cliente("Jorge","Bulevar Artigas 1530","092256211");
        sistema.agregarCliente(c1);
        sistema.agregarCliente(c2);

        Categoria[] cats= new Categoria[1];
        cats[0]=cat1;
        Producto p1=new Producto("carne roja",120,cats);
        Producto p2=new Producto("carne blanca",140,cats);
        Categoria[] cats2= new Categoria[1];
        cats2[0]=cat2;
        Producto p3=new Producto("Coca Light 600ml",45,cats2);
        sistema.agregarProducto(p1);
        sistema.agregarProducto(p2);
        sistema.agregarProducto(p3);
    }
    
}
