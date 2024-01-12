

package ejercicio2.pkg22.pkg09.pkg23;

import java.util.Scanner;


public class Ejercicio2220923 {


    
    public static void main(String[] args) {
        
        int actualYear, dateYear, age;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserte el año actual");
        actualYear = sc.nextInt();
        
        System.out.println("Inserte el año de nacimiento");
        dateYear = sc.nextInt();

        age = actualYear - dateYear;
        
        System.out.println("La edad del usuario es: " + age);
    }
   
}
