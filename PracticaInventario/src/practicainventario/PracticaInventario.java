
package practicainventario;
import java.io.*;
import java.util.Arrays;

public class PracticaInventario {

    
    public static void main(String[] args) {
        FileReader fR;
        BufferedReader bR;
        Item [] articulos = new Item[100];
        int contArticulos = 0;
        try{
            fR = new FileReader("inventario.txt");
            bR = new BufferedReader(fR);
            
            String linea = bR.readLine();
            String [] lineaPartida;
            
            while(linea != null){
                
                if(linea.contains("/")){
                    throw new SeparadorException();
                }else{
                    lineaPartida = linea.split(":");
                    String nombreItem = lineaPartida[0];
                    int precioItem = Integer.parseInt(lineaPartida[1]);
                    int cantidadItem = Integer.parseInt(lineaPartida[2]);

                    Item item = new Item(nombreItem, precioItem, cantidadItem);
//                    System.out.println(item);
                    articulos[contArticulos] = item;
                    contArticulos++;
                }

                linea = bR.readLine();
                
                
            }
            bR.close();
            
            for (int i = 0; i < articulos.length; i++) {
                if(articulos[i] != null){
                    System.out.println(articulos[i]);
                }
                
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
