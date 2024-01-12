
package practica2.santiagospina;

import java.util.Arrays;
import java.util.Scanner;

public class Practica2SantiagoSpina {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
         boolean jugar;
        do {  
            
            
            // Declaramos la matriz tablero de dimensiones 10x10
            char tablero [] [] = new char [10] [10];
        
            boolean ganador = false;
            
            
            //Rellenamos el tablero con la letra 'x'
            rellenarTablero(tablero, 'x');

            //Ahora realizamos el pasillo con casillas en blanco
            rellenarPasillo(tablero);

            //Posicionamos al jugador en la casilla 0,0
            tablero[0][0] = 'O';

            //Mostramos el tablero
            mostrarTablero(tablero);

            System.out.println("------------------------------");
            //Declaramos movimiento del usuario y numero de errores

            int movimiento, intentos = 3;
        
            do {                
                System.out.println("Indica la posicion donde moverte: 1.derecha, 2.izquierda, 3.arriba, 4.abajo");
            
                movimiento = sc.nextInt();
                
                if(movimiento <= 0 || movimiento >= 5){
                    System.out.println("El numero introducido no esta entre el 1 y el 4");
                }
                else{
//                moverJugador(tablero, movimiento, intentos);



            int posX = 0, posY = 0;
            
            //Buscamos donde esta el jugador
            for (int fila = 0; fila < tablero.length; fila++) {
                for (int col = 0; col < 10; col++) {
                    if(tablero[fila][col] == 'O'){

                        posY = fila;
                        posX = col;
                        tablero[fila][col] = ' ';
                    }
                }
            }
            
            // Realizamos un switch que, segun el numero que ponga el jugador, realiza un movimiento en su respectivo lado
            
            //Ademas, si intenta moverse donde haya una pared (una 'x'), perdera un intento
            
            


                switch (movimiento) {
                
                 case 1:
                     //Mover derecha
                     
                     //Si se sale del tablero, restara un intento
                     if((posX + 1) == 10){
                         System.out.println("Te saliste del tablero. -1 intento");
                         intentos--;
                         tablero[posY][posX] = 'O';
                     }
                     
                     else{
                         //Si se choca con una pared
                          if(tablero[posY][posX + 1] == 'x'){
                            System.out.println("Chocaste con una pared, -1 intento");
                            intentos--;
                            tablero[posY][posX] = 'O';
                          }
                          //Si encuentra el camino secreto
                          else if(tablero[posY][posX + 1] == 'X'){
                              System.out.println("Encontraste el camino secreto");
                              activarTrampa(tablero);
                              tablero[posY][posX] = 'O';
                          }
                          else{
                            tablero[posY][posX + 1] = 'O';
                        }
                     }
                    
                     
                    break;
                 case 2:
                     // Mover izquierda
                     
                     
                     //Si se sale del tablero, restara un intento
                     if((posX - 1) == -1){
                         System.out.println("Te saliste del tablero. -1 intento");
                         intentos--;
                         tablero[posY][posX] = 'O';
                     }
                     else{
                         //Si se choca con una pared
                         if(tablero[posY][posX - 1] == 'x'){
                            System.out.println("Chocaste con una pared, -1 intento");
                            intentos--;
                            tablero[posY][posX] = 'O';
                         }
                        else{
                            System.out.println("Hola");
                            tablero[posY][posX - 1] = 'O';
                        }
                     }
                     
                    break;
                 case 3:
                     // Mover arriba
                     
                     //Si se sale del tablero
                     if((posY - 1) == -1){
                         System.out.println("Te saliste del tablero. -1 intento");
                         intentos--;
                         tablero[posY][posX] = 'O';
                     }
                     else{
                        //Si se choca con una pared
                        if(tablero[posY - 1][posX] == 'x'){
                            System.out.println("Chocaste con una pared, -1 intento");
                            intentos--;
                            tablero[posY][posX] = 'O';
                        }
                        else{
                         tablero[posY - 1][posX] = 'O';
                         }
                     }
                    
                    
                    break;
                 case 4:
                     // Mover abajo
                     
                      //Si se sale del tablero
                     if((posY + 1) == 10){
                         System.out.println("Te saliste del tablero. -1 intento");
                         intentos--;
                         tablero[posY][posX] = 'O';
                     }
                     else{
                         //Si se choca con una pared
                          if(tablero[posY + 1][posX] == 'x'){
                            System.out.println("Chocaste con una pared, -1 intento");
                            intentos--;
                            tablero[posY][posX] = 'O';
                     }
                     else{
                         tablero[posY + 1][posX] = 'O';
                     }
                     }
                    
                    
                    break;  
                default:
                    throw new AssertionError();
                }
                
                if(tablero[9][9] == 'O'){
                    ganador = true;
                }
                else{
                    System.out.println("Intentos restantes: " + intentos);
                }
          
            
                
                    
                //Mostramos el tablero actualizado
                System.out.println("------------------------------");
                mostrarTablero(tablero);
            }
            
               
                
            } while (intentos != 0 && !ganador);
            
            if(intentos == 0){
                System.out.println("Perdiste, te quedaste sin intentos");
            }
            else if(ganador){
                System.out.println("Ganaste!");
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
        
        public static void mostrarTablero(char [] [] tablero){
            for (int i = 0; i < tablero.length; i++) {
                System.out.println(Arrays.toString(tablero[i]));
            }
    
        }

        public static void rellenarPasillo(char[][] tablero) {
            
             for (int col = 0; col < 3; col++) {
                 tablero[0][col] = ' ';
             }
             
             for (int fila = 0; fila < 9; fila++) {
                 tablero[fila][2] = ' ';
             }
            
             for (int col = 3; col < 7; col++) {
                 tablero[8][col] = ' ';
             }
            
             for (int col = 6; col < 10; col++) {
                 tablero[9][col] = ' ';
             }
             
             //Generamos la X trampa
             tablero[3][3] = 'X';
        }

        public static void activarTrampa(char[][] tablero) {
            for (int col = 3; col < 9; col++) {
                 tablero[3][col] = ' ';
             }
            
            for (int fila = 3; fila < 9; fila++) {
                 tablero[fila][8] = ' ';
             }
        }
        
        
        

}