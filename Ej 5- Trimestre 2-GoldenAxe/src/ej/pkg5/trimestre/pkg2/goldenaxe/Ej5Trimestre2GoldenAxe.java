
package ej.pkg5.trimestre.pkg2.goldenaxe;
import java.util.Scanner;

public class Ej5Trimestre2GoldenAxe {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("******************GOLDEN AXE******************");
        
        System.out.println("Elije el numero de jugadores del 1 al 5");
        int numJugadores = sc.nextInt();
        Jugador [] jugadores = new Jugador [numJugadores];
        int vidaCthulhu = 20 + numJugadores * 2;
        Cthulhu cthulhu = new Cthulhu(vidaCthulhu);
        
        
        for (int i = 0; i < numJugadores; i++) {
            System.out.println("Selecciona el jugador n" + i + ": 1.ENANO, 2.GUERRERO, 3.AMAZONA");
            int rta = sc.nextInt();
            
            switch (rta) {
                case 1:
                    jugadores[i] = new Enano();
                    break;
                case 2:
                    jugadores[i] = new Guerrero();
                    break;
                 case 3:
                    jugadores[i] = new Amazona();
                    break;   
                 default:
                     System.out.println("El numero no esta entre el 1 y el 3");
                     break;
            }   
        }
        
        do {            
            
        } while (true);
        
        
    }
    
}
