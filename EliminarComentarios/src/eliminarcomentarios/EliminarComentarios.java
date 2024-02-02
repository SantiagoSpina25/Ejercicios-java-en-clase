
package eliminarcomentarios;
import java.io.*;
import java.util.Arrays;

public class EliminarComentarios {

    
    public static void main(String[] args) {
        
        File fichero = new File("comentarios.txt");
        
        try{
        FileReader fileReader = new FileReader(fichero);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linea = bufferedReader.readLine();
        boolean comentadoTodo = false;
            while (linea != null) {                
                

                if(!(linea.contains("//")) && !(linea.contains("/*")) && !(linea.contains("*/")) && !comentadoTodo){
                    if(!linea.endsWith(";") && !linea.endsWith("{") && !linea.endsWith("}")){
                        throw new ExcepctionSinPuntoComa("Se ha producido un error porque falta añadir el punto y coma al final de la frase");
                    }
                    else{
                        System.out.println(linea);
                    }
                }
                else if(linea.contains("/*")){
                    comentadoTodo = true;
                }
                else if(linea.contains("*/")){
                    comentadoTodo = false;
                }
//                else if(linea.contains("//")){
//                    System.out.println("Comentario");
//                }

                linea = bufferedReader.readLine();
            }
            
            
            bufferedReader.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }catch(ExcepctionSinPuntoComa e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }        
        
    }
    
}
