
package ejercicio26.pkg19.pkg10.pkg23;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio26191023 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        

        double [] arrayNumeros = new double [3], arrayUsuario = new double [3];
        char seguir;
        boolean rta = false;

        arrayNumeros[0] = Math.round(Math.random() * 9 );
        arrayNumeros[1] = Math.round(Math.random() * 9 );
        arrayNumeros[2] = Math.round(Math.random() * 9 );
        
        
//        System.out.println(arrayNumeros[0] + ", "+arrayNumeros[1] + ", " +arrayNumeros[2]);
        System.out.println(Arrays.toString(arrayNumeros));
        
        
        
        System.out.println("Quiere adivinar la contraseña? ");
        seguir = (char) sc.next().charAt(0);

            


        // Opcion moderna
        
         while(!rta && seguir != 'n'){
            System.out.println("Inserte la contraseña");
            System.out.println("Primer valor?");
        
            arrayUsuario[0] = sc.nextInt();

            System.out.println("Segundo valor?");

            arrayUsuario[1] = sc.nextInt();

            System.out.println("Tercer valor?");

            arrayUsuario[2] = sc.nextInt();
         
            rta = Arrays.equals(arrayNumeros, arrayUsuario);
            
            if(!rta){
                System.out.println("Quiere intentar otra vez?");
                seguir = (char) sc.next().charAt(0);
            }
            
         }
         
         if(seguir == 'n'){
             System.out.println("Ok");
         }
         else{
             System.out.println("Correcto, adivinaste la contraseña!");
         }

        




        
        
    }
    
}
