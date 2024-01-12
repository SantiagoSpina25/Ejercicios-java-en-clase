
package ejercicio16.pkg04.pkg10.pkg2023;
import java.util.Scanner;

public class Ejercicio1604102023 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Introduce el valor minimo del rango");
        int min = sc.nextInt();
        
        System.out.println("Introduce el valor maximo del rango");
        int max = sc.nextInt();
        
        System.out.println("Los valores del rango son: " + min +  " y " + max );
        
        do {            
            
        System.out.println("Introduce un numero dentro del rango");
        num = sc.nextInt();
            
        } while ((num < min) || (num > max));
        
        System.out.println("El numero esta dentro del rango, chau");
        
    }
    
}
