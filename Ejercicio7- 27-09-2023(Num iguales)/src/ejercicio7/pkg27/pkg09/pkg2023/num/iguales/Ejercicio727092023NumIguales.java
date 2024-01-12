
package ejercicio7.pkg27.pkg09.pkg2023.num.iguales;
import java.util.Scanner;


public class Ejercicio727092023NumIguales {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        
        int num1 = sc.nextInt();
        
        System.out.println("Introduce otro numero");
        
        int num2 = sc.nextInt();
        
        if(num1 == num2){
            System.out.println("Los numeros son iguales");
        }
        else{
            System.out.println("Los numeros no son iguales");
            
            if(num1 > num2){
                System.out.println(num1 + " es mayor que " + num2);
            }
            else{
                System.out.println(num2 + " es mayor que" + num1);
            }
            
            
            
        }
        
        
    }
    
}
