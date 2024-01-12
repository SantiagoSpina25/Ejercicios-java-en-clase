
package ejercicio32.pkg26.pkg10.pkg23.buscaminas.mini;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio32261023BuscaminasMini {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char tablero [] [] = new char [3] [3];
        char tableroJugador [] [] = new char [3] [3];
        boolean jugar;
        
        do {            
            rellenarTablero(tablero, '*');
            rellenarTablero(tableroJugador, '*');
            introducirBomba(tablero);

             //        mostrarArrayChar(tablero);
             //            System.out.println(" ");
            mostrarArrayChar(tableroJugador);
        
            //Juego
        
            int coordX = 0, coordY = 0, turnos = 3;
            boolean explosion = false;
            do {            
                do {                    
                    System.out.println("Introduce coordenada de X (min 0 - max 3)");
                    coordX = sc.nextInt();

                    System.out.println("Introduce coordenada de Y (min 0 - max 3)");
                    coordY = sc.nextInt();
                } while ( !(coordX >= 0 && coordX <3) || !(coordY >= 0 && coordY <3));
                

                char letra = tablero[coordX][coordY];

                switch (letra) {
                    case '*':
                            System.out.println("Nada");
                            tableroJugador[coordX][coordY] = ' ';
                            tablero[coordX][coordY] = ' ';
                            mostrarArrayChar(tableroJugador);
                            turnos--;
                        break;
                    case 'O':
                        System.out.println("explosion insana");
                        explosion = true;
                        tableroJugador[coordX][coordY] = 'O';
                        mostrarArrayChar(tableroJugador);
                        break;
                    case ' ':
                        System.out.println("Ya elegiste esta coordenada");
                        mostrarArrayChar(tableroJugador);
                        break;
                    default:
                        throw new AssertionError();
                }
            
            } while (turnos != 0 && !explosion);

            if(explosion){
                System.out.println("Te fuiste bombardeado pa");
            }
            else{
                System.out.println("Has ganado!");
            }
            
            System.out.println("Quiere jugar de nuevo? true / false");
            jugar = sc.nextBoolean();
            
        } while (jugar);
        
    }
    
    
    
    public static void rellenarTablero(char [] [] tablero, char relleno){
        for (int fila = 0; fila < tablero.length; fila++) {
            Arrays.fill(tablero[fila], relleno);
        }
    }
    
    public static void mostrarArrayChar(char [] [] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }

    public static void introducirBomba(char[][] tablero) {
            int posMinaX = (int) (Math.random() *3);
            int posMinaY = (int) (Math.random() *3);
        
            tablero[posMinaX][posMinaY] = 'O';
    }
    
}
