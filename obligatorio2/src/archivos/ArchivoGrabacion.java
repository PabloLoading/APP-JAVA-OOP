
package archivos;
import java.util.*;
import java.io.*;

public class ArchivoGrabacion {
    private Formatter out;
    
    public ArchivoGrabacion(String unNombre){
        try{
            out=new Formatter(unNombre);
        }
        catch(FileNotFoundException e){
            System.out.println("Error al crear el archivo");
            System.exit(1);
        }
    }
    public ArchivoGrabacion(String unNombre,boolean extender){
        try{
            FileWriter arch = new FileWriter(unNombre,extender);
            out=new Formatter(unNombre);
        }
        catch(IOException e){
            System.out.println("Error al crear el archivo");
            System.exit(1);
        }
    }
    public void grabarLinea(String texto){
        out.format("%s%n",texto);
    }
    public void cerrar(){
    out.close();
    }
    
    
}
