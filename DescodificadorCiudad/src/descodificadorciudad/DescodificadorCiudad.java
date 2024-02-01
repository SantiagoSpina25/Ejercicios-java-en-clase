
package descodificadorciudad;
import java.io.*;
import java.util.Arrays;

public class DescodificadorCiudad {

    
    public static void main(String[] args) {
        File fichero = new File("ciudadCodificada.txt");
    
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
  
            System.out.println(Arrays.toString(palabra));
            
            int [] descodificacion = new int [10];
            
             for (int i = 0; i < descodificacion.length; i++) {
                 descodificacion[i] = (int) palabra[i];
             }
           
             char [] palabraDescubierta = new char [10]; 
            System.out.println(Arrays.toString(descodificacion));
             for (int i = 0; i < descodificacion.length; i++) {
                 
                 switch (descodificacion[i]) {
                 case 1:
                     palabraDescubierta[i] = 'A';
                     break;
                case 2:
                     palabraDescubierta[i] = 'B';
                break;
                    case 3:
                     palabraDescubierta[i] = 'C';
                break;
                     case 4:
                     palabraDescubierta[i] = 'D';
                     break;
                     case 5:
                     palabraDescubierta[i] = 'E';
                     break;
                     case 6:
                     palabraDescubierta[i] = 'F';
                     break;
                     case 7:
                     palabraDescubierta[i] = 'G';
                     break;
                     case 8:
                     palabraDescubierta[i] = 'H';
                     break;
                     case 9:
                     palabraDescubierta[i] = 'I';
                     break;
                     case 10:
                     palabraDescubierta[i] = 'J';
                     break;
                     case 11:
                     palabraDescubierta[i] = 'K';
                     break;
                     case 12:
                     palabraDescubierta[i] = 'L';
                     break;
                     case 13:
                     palabraDescubierta[i] = 'M';
                     break;
                     case 14:
                     palabraDescubierta[i] = 'N';
                     break;
                     case 15:
                     palabraDescubierta[i] = 'Ñ';
                     break;
                     case 16:
                     palabraDescubierta[i] = 'O';
                     break;
                     case 17:
                     palabraDescubierta[i] = 'P';
                     break;
                     case 18:
                     palabraDescubierta[i] = 'Q';
                     break;
                     case 19:
                     palabraDescubierta[i] = 'R';
                     break;
                     case 20:
                     palabraDescubierta[i] = 'S';
                     break;
                     case 21:
                     palabraDescubierta[i] = 'T';
                     break;
                     case 22:
                     palabraDescubierta[i] = 'U';
                     break;
                     case 23:
                     palabraDescubierta[i] = 'V';
                     break;
                     case 24:
                     palabraDescubierta[i] = 'W';
                     break;
                     case 25:
                     palabraDescubierta[i] = 'X';
                     break;
                     case 26:
                     palabraDescubierta[i] = 'Y';
                     break;
                     case 27:
                     palabraDescubierta[i] = 'Z';
                     break;

             }
                 
             }
             System.out.println(Arrays.toString(palabraDescubierta));
            
            
    }
         catch(IOException e){
             System.out.println(e.getMessage());
         }
    
    }
}
