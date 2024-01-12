
package ejercicio6.pkg27.pkg09.pkg2023.par.o.impar;
import java.util.Scanner;

public class Ejercicio627092023ParOImpar {


    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduce el numero");
        int num = sc.nextInt();
        
        
        if(num % 2 == 0){
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar");
        }
        
    }
    
}
