
package ejercicio42.pkg15.pkg11.pkg23.casino;
import java.util.Scanner;


public class Ejercicio42151123Casino {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos a los jugadores
        
        Jugador j1 = new Jugador("santiago", 19);
        Jugador j2 = new Jugador("noname", 23);
        boolean jugar = true;
        
        System.out.println("Bienvenido al casino!");
        
        if(j1.getEdad() > 18 && j2.getEdad() > 18){
            System.out.println("Pueden pasar");
            
            
            do {             
                System.out.println("1. Jugar a la ruleta, 2. Salir");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        boolean jugarRuleta = true;
                        do {                            
                            
                        
                        // Jugador 1
                        System.out.println("Ruleta");
                        System.out.println("Jugador 1, introduzca su apuesta");
                        int apuesta = sc.nextInt();
                        System.out.println("introduzca numero entre 1-9");
                        int numeroElegido1 = sc.nextInt();
                        System.out.println("Ahora si es blanco o negro");
                        String color1 = sc.next();
                        
                        
                        
                        
                        
                        
                        // Jugador 2
                        
                        System.out.println("Jugador 1, introduzca su apuesta");
                        apuesta += sc.nextInt();
                        System.out.println("introduzca numero entre 1-9");
                        int numeroElegido2 = sc.nextInt();
                        System.out.println("Ahora si es blanco o negro");
                        String color2 = sc.next();
                        
                        
                        
                        } while (jugarRuleta);
                        
                        
                        
                        
                        break;
                    case 2:
                        System.out.println("Ok, chau");
                         jugar = false;
                         break;
                    default:
                        System.out.println("El numero no esta entre 1 y 2");
                        jugar = false;
                }
                
            } while (jugar);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        else{
            System.out.println("Son menores de edad, no pueden pasar");
        }
        
    }
    
}
