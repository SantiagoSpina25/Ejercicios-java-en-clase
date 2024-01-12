
package ejercicio3.pkg22.pkg09.pkg2023.redondear.un.numero;
import java.util.Scanner;

public class Ejercicio322092023RedondearUnNumero {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double numberToRound;
        
        System.out.println("Inserte el numero a redondear");
        numberToRound = sc.nextDouble();
        numberToRound = numberToRound + 0.5;
        
        int numberRounded = (int) numberToRound;
        
        System.out.println("El numero redondeado es: " + numberRounded);
        
    }
    
    
}
