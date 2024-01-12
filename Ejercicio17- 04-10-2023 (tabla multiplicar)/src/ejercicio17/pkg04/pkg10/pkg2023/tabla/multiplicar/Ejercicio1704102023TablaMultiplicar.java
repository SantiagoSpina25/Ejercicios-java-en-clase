
package ejercicio17.pkg04.pkg10.pkg2023.tabla.multiplicar;
import java.util.Scanner;

public class Ejercicio1704102023TablaMultiplicar {


    public static void main(String[] args) {
        int num, multiplicador;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tabla de multiplicar...");
        
        multiplicador = 1;
        do {            
            System.out.println("Introduce un numero del 1 al 10");
            num = sc.nextInt();
            
        } while (num < 1 || num > 10);
      
        while(multiplicador != 11){
        System.out.println(num + " X " + multiplicador + " = " +  num * multiplicador);
        multiplicador++;
                
        }
    }
    
}
