
package ejercicio31.pkg25.pkg10.pkg23.hundir.la.flota;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio31251023HundirLaFlota {

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Hacemos el tablero
        char [] [] tablero = new char [10] [10];
        char [] [] tableroJuego = new char [10] [10];
        
        rellenarTablero(tablero);
        
        introducirBarco(tablero, 5, 'B');
        introducirBarco(tablero, 3, 'C');
        introducirBarco(tablero, 1, 'D');
        
        mostrarArrayChar(tablero);
        
        rellenarTablero(tableroJuego);
        System.out.println("Tablero de juego:");
        mostrarArrayChar(tableroJuego);
        //Jugar
        
        int coordX = 0, coordY = 0, contBarco1 = 5, contBarco2 = 3, contBarco3 = 1;
        
        do {            
            System.out.println("Introduce coordenada de X");
            coordX = sc.nextInt();
            
            System.out.println("Introduce coordenada de Y");
            coordY = sc.nextInt();
            
            System.out.println(coordX + " / " + coordY);
            
          
            
            char letra = tablero[coordX][coordY];
            System.out.println(letra);
            switch (letra) {
                case '.':
                        System.out.println("Agua");
                    break;
                case 'B':
                    tablero[coordX][coordY] = 'X';
                    contBarco1--;
                    tableroJuego[coordX][coordY] = 'X';
                    break;
                    
                case 'C':
                    tablero[coordX][coordY] = 'X';
                    contBarco2--;
                    tableroJuego[coordX][coordY] = 'X';
                    break;
                    
                case 'D':
                    tablero[coordX][coordY] = 'X';
                    contBarco3--;
                    tableroJuego[coordX][coordY] = 'X';
                    break;
                    case 'X':
                        System.out.println("Ya has elegido esta casilla anteriormente");
                    break;
                default:
                    throw new AssertionError();
            }
             mostrarArrayChar(tableroJuego);
            
        } while (!(contBarco1 == 0 && contBarco2 == 0 && contBarco3 == 0));
        
        System.out.println("Fin");
}
    
    
    
    public static void mostrarArrayChar(char [] [] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    
    public static void rellenarTablero(char [] [] tablero){
        for (int fila = 0; fila < tablero.length; fila++) {
            Arrays.fill(tablero[fila], '.');
        }
    }
    
    
    public static void introducirBarco(char [] []tablero, int lengthBarco, char rellenoBarco){
        boolean condicion = false;
        int posX, posY;
        
        do {            
            
            //Declaramos las coordenadas
           posX = (int) (Math.random()*10);
           
           posY = (int) (Math.random()*10);       

            //matriz[0].length == columnas de la matriz
            
            if(posY + lengthBarco < tablero[0].length){
                condicion = true;
                
                //Comprobar que no hay otro barco
                
                for (int i = 0; i < lengthBarco; i++) {
                    if(tablero[posX] [posY + i] != '.'){
                        //Hay otro barco                   
                        condicion = false;   
                    }

                }
                
                if (condicion) {
                    for (int i = 0; i < lengthBarco; i++) {
                        tablero[posX][posY + i]= rellenoBarco;
                    }
                }
            }
            
            
        } while (!condicion);
        
        
        
        
    }
    
    
    
    
    
}
