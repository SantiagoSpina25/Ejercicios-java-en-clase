
package ejercicio.practica.del.pkg17.pkg01.pkg24;

import java.util.Scanner;



public class EjercicioPracticaDel170124 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //10 turnos
        int turnos = 0;
        //Creacion de tablero
        char tablero [] [] = new char [5][5];
        
        rellenarTablero(tablero);
        
        mostrarTablero(tablero);
        
        
        do {            
            System.out.println("Turno n" + (turnos+1) );
            
            
            movimientoJugador(tablero, 'N');
            
            movimientoJugador(tablero, 'B');
            
            
            
            turnos++;
            
        } while (turnos < 10);
        
    }

    private static void rellenarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '*';
            }
        }
        for (int i = 0; i < 5; i++) {
            tablero[0][i] = 'N';
        }
        for (int i = 0; i < 5; i++) {
            tablero[4][i] = 'B';
        }
    }

    private static void mostrarTablero(char[][] tablero) {
//        for (int i = 0; i < tablero.length; i++) {
//            System.out.println(Arrays.toString(tablero[i]));
//        }
        //Otra forma
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
        
        
    }

    private static void movimientoJugador(char[][] tablero, char letra) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jugador " + letra +", que ficha desea seleccionar? (Indique posicion)");
            System.out.println("posx");
            int posX = sc.nextInt();
            System.out.println("posy");
            int posY = sc.nextInt();
            
            if(posX < 5 && posY < 5 && posX >= 0 && posY >=0){
                
            
                switch (tablero[posX][posY]) {
                    case '*':
                        System.out.println("Ahi no hay una ficha, intente de nuevo");
                        break;
                    case 'N':
                        if((posY+1<4 && posX+1 >0 && posX+1 < 4 && posY+1>0) && tablero[posX + 1][posY + 1] == 'B'){
                            System.out.println("Hay una blanca en diagonal, la comes");
                            tablero[posX][posY] = '*';
                        
                            tablero[posX + 1][posY + 1] = 'N';
                        }
                        else if((posY+1<4 && posX-1 >0 && posX-1 < 4 && posY-1>0) && tablero[posX - 1][posY + 1] == 'B'){
                            System.out.println("Hay una blanca en diagonal, la comes");
                            tablero[posX][posY] = '*';
                        
                            tablero[posX - 1][posY + 1] = 'N';
                        }
                        else if(tablero[posX + 1][posY] == 'B'){
                            System.out.println("Delante hay una ficha blanca, no se puede mover");
                        }
                        else{
                            System.out.println("Mueves para adelante una posicion");
                            
                            tablero[posX][posY] = '*';
                            tablero[posX + 1][posY] = 'N';
                        }
                        
                        break;
                    case 'B':
                        if((posY-1<4 && posX-1 >0 && posX-1 < 4 && posY-1>0)  && tablero[posX - 1][posY - 1] == 'N'){
                            System.out.println("Hay una " + letra + " en diagonal, la comes");
                            tablero[posX][posY] = '*';
                        
                            tablero[posX - 1][posY - 1] = 'B';
                        }
                        else if((posY-1<4 && posX+1 >0 && posX+1 < 4 && posY-1>0) && tablero[posX + 1][posY - 1] == 'N'){
                            System.out.println("Hay una blanca en diagonal, la comes");
                            tablero[posX][posY] = '*';
                        
                            tablero[posX - 1][posY + 1] = 'N';
                        }
                        else if((posX-1 < 4) && tablero[posX - 1][posY] == 'N'){
                            System.out.println("Delante hay una ficha blanca, no se puede mover");
                        }
                        else{
                            System.out.println("Mueves para adelante una posicion");
                            
                            tablero[posX][posY] = '*';
                            tablero[posX - 1][posY] = 'B';
                        }
                        break;
                }
                
                    mostrarTablero(tablero);
            }
            else{
                System.out.println("La posicion seleccionada no existe, perdiste un turno");
            }
            
    }

    
    private static boolean comprobarGanador(char tablero [] []){
        boolean negrasVivos = false, blancasVivos= false;
        boolean algunoVivo = false;
        //Comprobar negras
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if(tablero[i][j] == 'N'){
                    negrasVivos = true;
                }
                else if(tablero[i][j] == 'B'){
                    blancasVivos = true;
                }
            }
        }
        
        if(negrasVivos || blancasVivos){
            algunoVivo = true;
        }
        return algunoVivo;
    }
    
    
}
