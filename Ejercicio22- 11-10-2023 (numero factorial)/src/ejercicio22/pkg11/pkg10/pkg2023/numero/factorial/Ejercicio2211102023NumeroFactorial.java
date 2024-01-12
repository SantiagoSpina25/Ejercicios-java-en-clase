
package ejercicio22.pkg11.pkg10.pkg2023.numero.factorial;
import java.util.Scanner;

public class Ejercicio2211102023NumeroFactorial {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero factorial");
        int num = sc.nextInt();
        
        System.out.println("El resultado es: " + factorial(num));
    }
    
    public static int factorial(int num) {
        int resultado = 1;
        for (int i = num; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }
    
    
}
