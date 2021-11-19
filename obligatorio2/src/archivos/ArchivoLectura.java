
package archivos;

import java.util.*;
import java.io.*;
import java.nio.file.*;

public class ArchivoLectura {
    private Scanner in;
    private String linea;
    
    public ArchivoLectura(String unNombre){
        try{
            in=new Scanner(Paths.get(unNombre));
        }
        catch(IOException e){
            System.out.println("error al abrir el archivo");
        }
    }
    public boolean hayMasLineas(){
        boolean hay=false;
        linea=null;
        if(in.hasNext()){
            linea=in.nextLine();
            hay=true;
        }
        return hay;
    }
    public String linea(){
        return linea;
    }
    public void cerrar(){
    in.close();
    }
    
}
