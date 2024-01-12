
package ejercicio13.pkg28.pkg09.pkg2023.bucles.pkgwhile;
import java.util.Scanner;


public class Ejercicio1328092023BuclesWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = 3;
//        
//        while (a < 5){
//            System.out.println("Hola");
//            a++;
        System.out.println("Introduce un numero");
        int num = sc.nextInt();

         while(num != 0){
             
            if(num % 2 == 0){
                System.out.println("Es par");
            }
            else{
                System.out.println("Es impar");
            }
            
            System.out.println("Introduce nuevamente un numero");
            num = sc.nextInt();
            
        }
        System.out.println("El numero es 0, hasta luego");
    }
    
}
