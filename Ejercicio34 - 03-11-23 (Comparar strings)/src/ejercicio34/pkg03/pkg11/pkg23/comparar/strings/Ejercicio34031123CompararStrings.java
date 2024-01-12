
package ejercicio34.pkg03.pkg11.pkg23.comparar.strings;
import java.util.Scanner;

public class Ejercicio34031123CompararStrings {

   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         //Cual es la palabra mas grande
         
         System.out.println("Introduzca la palabra 1");
         String palabra1 = sc.nextLine();
         
         System.out.println("Introduzca la palabra 2");
         String palabra2 = sc.nextLine();
         
         if(palabra1.length() > palabra2.length()){
             System.out.println("La palabra 1 es mas grande que la palabra 2");
         }
         else if(palabra1.length() == palabra2.length()){
             System.out.println("Las palabras son de igual tamaño");
        }
         else{
             System.out.println("La palabra 2 es mas grande que la palabra 1");
         }
         
         
         
    }
    
}
