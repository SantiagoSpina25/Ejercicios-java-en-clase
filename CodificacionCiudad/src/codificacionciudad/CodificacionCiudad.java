
package codificacionciudad;
import java.io.*;
import java.util.Arrays;

public class CodificacionCiudad {

   
    public static void main(String[] args) {
        
        File fichero = new File("ciudad.txt");
        File ficheroCodificado = new File("ciudadCodificada.txt");
        
        char [] ultimo_codigo = new char [10];
        try{
            FileReader fileReader = new FileReader(fichero);
            char [] palabra = new char [10];
            int num = fileReader.read();
            char letra;
            int contador = 0;
            
            while(num != -1){
                letra = (char) num; 
                palabra[contador] = letra;
                num = fileReader.read();
                contador++;
            }
  
//            System.out.println(Arrays.toString(palabra));
            
            int [] codigo = new int [10];
           
            
            for (int i = 0; i < palabra.length; i++) {
                switch (palabra[i]) {
                    case 'A':
                        codigo[i] = 1;
                        break;
                    case 'B':
                        codigo[i] = 2;
                        break;
                    case 'C':
                        codigo[i] = 3;
                        break;
                    case 'D':
                        codigo[i] = 4;
                        break;
                    case 'E':
                        codigo[i] = 5;
                        break;
                    case 'F':
                        codigo[i] = 6;
                        break;
                    case 'G':
                        codigo[i] = 7;
                        break;
                    case 'H':
                        codigo[i] = 8;
                        break;
                    case 'I':
                        codigo[i] = 9;
                        break;
                    case 'J':
                        codigo[i] = 10;
                        break;
                    case 'K':
                        codigo[i] = 11;
                        break;
                    case 'L':
                        codigo[i] = 12;
                        break;
                    case 'M':
                       codigo[i] = 13;
                        break;
                    case 'N':
                        codigo[i] = 14;
                        break;
                    case 'Ñ':
                        codigo[i] = 15;
                        break;
                    case 'O':
                        codigo[i] = 16;
                        break;
                    case 'P':
                        codigo[i] = 17;
                        break;
                     case 'Q':
                        codigo[i] = 18;
                        break;
                    case 'R':
                        codigo[i] = 19;
                        break;
                    case 'S':
                        codigo[i] = 20;
                        break;
                    case 'T':
                        codigo[i] = 21;
                        break;
                    case 'U':
                        codigo[i] = 22;
                        break;
                    case 'V':
                        codigo[i] = 23;
                        break;
                    case 'W':
                        codigo[i] = 24;
                        break;
                    case 'X':
                        codigo[i] = 25;
                        break;
                    case 'Y':
                        codigo[i] = 26;
                        break;
                    case 'Z':
                        codigo[i] = 27;
                        break;
                    
                }
                System.out.println(codigo[i]);
              
                ultimo_codigo[i] = (char) codigo[i];
            }
            
            System.out.println(Arrays.toString(ultimo_codigo));
            
            
            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
        try {
            //Si existe escribe, sino lo crea en la carpeta del proyecto
            
            //Si es true mantiene lo anterior, si es true machaca
            FileWriter fileWriter = new FileWriter(ficheroCodificado,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            for (int i = 0; i < ultimo_codigo.length; i++) {
                bufferedWriter.write(ultimo_codigo[i]);
            }
            
            
            bufferedWriter.close();
            
        } catch (IOException e) {
            e.toString();
        }
        
    }
    
}
