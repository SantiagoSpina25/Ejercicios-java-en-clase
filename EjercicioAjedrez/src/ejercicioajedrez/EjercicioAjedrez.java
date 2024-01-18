
package ejercicioajedrez;

import java.util.Scanner;


public class EjercicioAjedrez {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Creamos tablero 
        Figura tablero [][] = new Figura[8][8];
        
        rellenarTablero(tablero);
        mostrarTablero(tablero);
        
        System.out.println("-----------------------------------");
        //Comienzo del juego
        do {
            
            //Creacion de otro bucle para elegir una posicion correcta
            boolean posCorrecta = false;
            int posicionx, posiciony;
            do {                
                System.out.println("Que posicion queres elegir?");
                
                System.out.println("Posicion x:");
                posicionx = sc.nextInt();
                
                System.out.println("Posicion y:");
                posiciony = sc.nextInt();
                
                //Verificar que la posicion no sea mayor a 8 (no se pase del tablero) y que haya una figura en ese lugar
                if( posicionx < 8 && posiciony < 8 && tablero[posicionx][posiciony] != null ){
                    System.out.println("Has elegido " + tablero[posicionx][posiciony].getNombre()); 
                    posCorrecta = true;
                }else{
                    System.out.println("En la posicion elegida no hay una figura");
                }
                
                System.out.println("-----------------------------------");
            } while (!posCorrecta);
            
            Figura figuraSeleccionada = tablero[posicionx][posiciony];
            tablero[posicionx][posiciony] = null;
            figuraSeleccionada.mover();
            
            actualizarTablero(tablero, figuraSeleccionada);
            mostrarTablero(tablero);
            System.out.println("-----------------------------------");
        } while (true);
        
        
        
        
    }

    private static void rellenarTablero(Figura[][] tablero) {
        
        introducirFiguras(tablero, 0,"Negra");
        introducirFiguras(tablero, 7,"Blanca");
        
        for (int i = 0; i < 8; i++) {
            tablero[1][i] = new Peon("Negra", 1,i);
        }
        for (int i = 0; i < 8; i++) {
            tablero[6][i] = new Peon("Blanca", 6,i);
        }
        
    }
    
    public static void mostrarTablero(Figura tablero [] []){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if(tablero[i][j] != null){
                    System.out.print(tablero[i][j] + " ");    
                }
                else{
                    System.out.print("." + " ");
                }
                    
            }
            System.out.println("");
        }
        
    }

    private static void introducirFiguras(Figura[][] tablero, int num, String equipo) {
        tablero[num][0] = new Torre(equipo);
        tablero[num][1] = new Caballo(equipo);
        tablero[num][2] = new Alfil(equipo);
        tablero[num][3] = new Reina(equipo);
        tablero[num][4] = new Rey(equipo);
        tablero[num][5] = new Alfil(equipo);
        tablero[num][6] = new Caballo(equipo);
        tablero[num][7] = new Torre(equipo);
    }

    private static void actualizarTablero(Figura[][] tablero, Figura figuraSeleccionada) {
        
        tablero[figuraSeleccionada.getPosx()][figuraSeleccionada.getPosy()] = figuraSeleccionada;
    }
    
    
}
