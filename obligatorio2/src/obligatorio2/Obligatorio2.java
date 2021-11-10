


package obligatorio2;
import interfaz.*;
import dominio.*;

public class Obligatorio2 {

    public static void main(String[] args) {
        Sistema sistema=new Sistema();
        
        Categoria cat1=new Categoria("carnes",4,"carnes blancas");
        Categoria cat2=new Categoria("bebidas",7,"bebidas de todo tipo");
        sistema.agregarCategoria(cat1);
        sistema.agregarCategoria(cat2);
        VentanaPrincipal vent= new VentanaPrincipal(sistema);
        vent.setVisible(true);
    }
    
}
