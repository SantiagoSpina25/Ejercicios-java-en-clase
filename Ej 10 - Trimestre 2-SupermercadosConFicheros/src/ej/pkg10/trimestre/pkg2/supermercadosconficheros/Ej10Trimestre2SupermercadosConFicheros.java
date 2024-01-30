
package ej.pkg10.trimestre.pkg2.supermercadosconficheros;
import java.io.*;
import java.util.Arrays;


public class Ej10Trimestre2SupermercadosConFicheros {

    
    public static void main(String[] args) {
        //Buscamos los archivos
        File archivoMercadona = new File("Mercadona.txt");
        File archivoLidl = new File("Lidl.txt");
        
        //Array de productos de Mercadona
        Producto [] productosMercadona = new Producto[5];
        
        //Array de productos de Lidl
        Producto [] productosLidl = new Producto[5];
        
        //Leemos los archivos
        try {
             FileReader fileReader = new FileReader(archivoMercadona);
             
             
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             
             
             String nombreProd="";
             String precioString = "";
             int precioProd;
             
             int contadorProductos = 0;
             nombreProd = bufferedReader.readLine();
             precioString = bufferedReader.readLine();
             
             precioProd = Integer.parseInt(precioString);
             while (nombreProd != null && precioString != null) {
                precioProd = Integer.parseInt(precioString);
                Producto producto = new Producto(nombreProd,precioProd);
                productosMercadona[contadorProductos] = producto;
                contadorProductos++;
                
                nombreProd = bufferedReader.readLine();
                precioString = bufferedReader.readLine();
                
            }
            System.out.println(Arrays.toString(productosMercadona));

             
             
             
             //Cerrar comunicacion
             bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.toString());
            System.out.println("a");
        }
        catch (NumberFormatException e) {
            System.out.println(e.toString());
            System.out.println("b");
        }

        
    }
    
}
