
package practicainventario;
import java.io.*;
import java.util.Arrays;

public class PracticaInventario {

    
    public static void main(String[] args) {
        
        try{
            FileReader fR = new FileReader("inventario2.txt");
            BufferedReader bR = new BufferedReader(fR);
            
            String linea = bR.readLine();
            String [] lineaPartida;
            
            while(linea != null){
                
                if(linea.contains("/")){
                    throw new SeparadorException();
                }else{
                    lineaPartida = linea.split(":");
                    String nombreItem = lineaPartida[0];
                    String precioItem = lineaPartida[1];
                    String cantidadItem = lineaPartida[2];

                    Item item = new Item(nombreItem, precioItem, cantidadItem);
                    System.out.println(item);
                }
                linea = bR.readLine();
                
                bR.close();
            }
            
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(SeparadorException e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
