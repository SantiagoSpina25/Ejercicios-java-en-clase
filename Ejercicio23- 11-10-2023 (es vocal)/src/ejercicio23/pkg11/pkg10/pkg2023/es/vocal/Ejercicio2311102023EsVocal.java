
package ejercicio23.pkg11.pkg10.pkg2023.es.vocal;
import java.util.Scanner;

public class Ejercicio2311102023EsVocal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una letra");
        
        char letra = sc.next().charAt(0);
        while(letra != 'f'){
            if(esVocal(letra)){
                System.out.println("La letra es una vocal");
            }
            else{
                System.out.println("La letra no es una vocal");
            }
            System.out.println("Introduzca otra letra (o f para salir)");
            letra = sc.next().charAt(0);
        }
        System.out.println("chau");
    }
    
    public static boolean esVocal(char letra){
        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u':
                return true;
            default:
                return false;
                
        }
    }
    
}
