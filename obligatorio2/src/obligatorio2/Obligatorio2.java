//Pablo Duran (270956) , Santiago Villar (256345)


package obligatorio2;
import interfaz.*;
import dominio.*;
import java.io.*;

public class Obligatorio2 {

    public static void main(String[] args) throws IOException {
        Sistema sistema=new Sistema();

        VentanaInicio vent=new VentanaInicio(sistema,false);
        vent.setVisible(true);
        
    }
    
}
