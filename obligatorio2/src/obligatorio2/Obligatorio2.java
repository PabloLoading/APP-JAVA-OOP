


package obligatorio2;
import interfaz.*;
import dominio.*;
import java.io.*;

public class Obligatorio2 {

    public static void main(String[] args) throws IOException {
        Sistema sistema=new Sistema();
        

        VentanaInicio vent=new VentanaInicio(sistema);
        vent.setVisible(true);
        
    }
    
}
