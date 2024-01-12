
package ejercicio8.pkg27.pkg09.pkg2023.ordernar.pkg3.numeros;
import java.util.Scanner;


public class Ejercicio827092023Ordernar3Numeros {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un primer numero");
        
        int num1 = sc.nextInt();
        
        System.out.println("Introduce el segundo numero");
        
        int num2 = sc.nextInt();
        
        System.out.println("Introduce el tercer numero");
        
        int num3 = sc.nextInt();
        
        
        if(num1 > num2 && num1 > num3){
            if(num2 > num3){
                System.out.println("El orden es: " + num1 + "," + num2 +  ","+ num3);
            }
            else{
                System.out.println("El orden es: " + num1 + "," + num3 +  ","+ num2);
            }
        }
        
        else if(num2 > num1 && num2 > num3){
            if(num1 > num3){
                System.out.println("El orden es: " + num2 + "," + num1 +  "," +num3);
            }
            else{
                System.out.println("El orden es: " + num2 + "," + num3 +  "," +num1);
            }
        }
            
        else{
             if(num1 > num2){
                System.out.println("El orden es: " + num3 +  "," +num1 +  "," +num2);
            }
            else{
                System.out.println("El orden es: " + num3 +  "," + num2 +  "," +num1);
            }
        }
        
        
    }
    
}
