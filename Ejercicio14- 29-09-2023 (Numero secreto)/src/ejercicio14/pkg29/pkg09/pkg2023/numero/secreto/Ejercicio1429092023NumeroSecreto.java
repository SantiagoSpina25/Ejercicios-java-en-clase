
package ejercicio14.pkg29.pkg09.pkg2023.numero.secreto;
import java.util.Scanner;

public class Ejercicio1429092023NumeroSecreto {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numRandom = (int) (Math.random() * 100 +1);
        
        
        System.out.println("Adivina el numero");
        int numUsuario = sc.nextInt();
        
        while((numUsuario != -1) && (numUsuario != numRandom)){
            if(numUsuario > numRandom){
                System.out.println("El numero es menor");
            }
            else if(numUsuario < numRandom){
                System.out.println("El numero es mayor");
            }
            else if(numUsuario == numRandom){
                System.out.println("Ganaste!");
            }
            System.out.println("Proba denuevo");
            numUsuario = sc.nextInt();
            
        }
    }
}