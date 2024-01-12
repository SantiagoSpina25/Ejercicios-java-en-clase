
package ejercicio10.pkg28.pkg09.pkg2023.quien.es.quien;
import java.util.Scanner;

public class Ejercicio1028092023QuienEsQuien {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quieres jugar al quien es quien? 1.Yes 2.No");
        
        int play = sc.nextInt();
        boolean bigote,gafas,barba,sombrero,perilla, pelo;
        
        if(play == 1){
            System.out.println("Ok, vamo a juga");
            
            System.out.println("¿Tiene pelo?");
            
            pelo = sc.nextBoolean();
            
            System.out.println("¿Tiene bigote?");
            
            bigote = sc.nextBoolean();
            
            System.out.println("¿Tiene gafas?");
            
            gafas = sc.nextBoolean();
            
            System.out.println("¿Tiene barba?");
            
            barba = sc.nextBoolean();
            
            System.out.println("¿Tiene sombrero?");
            
            sombrero = sc.nextBoolean();
            
            System.out.println("¿Tiene perilla?");
            
            perilla = sc.nextBoolean();
            
            
            if(sombrero && !perilla){
                System.out.println("Es kiko!");
            }
            else if(sombrero && perilla){
                System.out.println("Es Alejandro!");
            }
            else if(gafas){
                System.out.println("Es Lupas!");
            }
            else if(bigote){
                System.out.println(" Es Nike!");
            }
            else if(barba){
                System.out.println("Es Medinilla");
            }
            else if(pelo && !sombrero){
                System.out.println("Es Monica");
            }
            else{
                System.out.println("Entonces no existe");
            }

        }
        else{
            System.out.println("Ok, nos vemos pa");
        }
        
    }
    
}
