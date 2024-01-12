
package ejercicio5.pkg22.pkg09.pkg2023.calcular.horas.en.segundos;
import java.util.Scanner;


public class Ejercicio522092023CalcularHorasEnSegundos {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Introduzca los segundos");
        int secsUser = sc.nextInt();
        
        
        int mins = secsUser / 60;
        int secs = secsUser % 60;
        
        int hs = mins / 60;
        mins = mins % 60;
        System.out.println("La hora completa es: " + hs + " horas, " + mins + " minutos, " + secs + " segundos");
    }
    
}
