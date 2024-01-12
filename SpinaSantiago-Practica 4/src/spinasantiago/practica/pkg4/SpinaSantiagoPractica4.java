
package spinasantiago.practica.pkg4;
import java.util.Scanner;

public class SpinaSantiagoPractica4 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Tablero
        Vehiculo [][] tablero = new Vehiculo [3][10];
        
        //Introducimos los vehiculos
        Camion camion = new Camion();
        tablero[0][0] = camion;
        Moto moto = new Moto();
        tablero[1][0] = moto;
        Coche coche = new Coche();
        tablero[2][0] = coche;

        
        
        //Cartas objetivo
        String [] cartasObjetivo = {"Camión primero y Moto segundo", "Camión segundo y coche primero", "Camión tercero y moto primero"};
       
        
        //Mazo de cartas (de avanzar y retroceder)
        Carta [] mazo = new Carta [10];
        
        //Bucle para crear 5 cartas de avanzar y 5 de retroceder
        for (int i = 0; i < mazo.length; i++) {
            if(i < 5){
                mazo[i] = new Carta("Avanzar", 0);
            }
            else{
                mazo[i] = new Carta("Retroceder", 1);
            }
        }        
        
        
        //Mostramos el objetivo
        System.out.println("Carta objetivo: ");
       
        //Damos una carta objetivo a cada jugador de forma random
        for (int i = 0; i < 3; i++) {
            int randomObjetivo = (int) (Math.random()*3);
            System.out.println("El objetivo del "+ tablero[i][0].getNombre() + " es " + cartasObjetivo[randomObjetivo]);
        }
        
        
        System.out.println("");
        
        //Mostramos el tablero
        mostrarTablero(tablero);
        
        //Cada vehiculo agarra una carta
        
        do {            
            
            
            for (int i = 0; i < tablero.length; i++) {
                
                //Esto es simplemente que muestre un sout distinto segun el turno en el que va
                switch (i) {
                    case 0:
                        System.out.println("Camion coge carta");
                        break;
                    case 1:
                        System.out.println("Moto coge carta");
                        break;
                    default:
                        System.out.println("Coche coge carta");
                        break;
                }
                
                int cartaRandom = (int) (Math.random()*10);

                System.out.println("Salió una carta de: " + mazo[cartaRandom].getNombre());

                System.out.println("Con quien usas la carta?");
                System.out.println("1.Camion, 2.Moto, 3. Coche");
                int eleccion = sc.nextInt();

                switch (eleccion) {
                    case 1:
                        if(mazo[cartaRandom].getEstado() %2==0){
                            tablero[0][camion.getPosX()] = null;
                                camion.avanzar();
                        }
                        else{
                                tablero[0][camion.getPosX()] = null;
                                camion.retroceder();
                        }
                        actualizarTablero(tablero, camion);
                        break;
                    case 2:
                        if(mazo[cartaRandom].getEstado() %2==0){
                            tablero[1][moto.getPosX()] = null;
                                moto.avanzar();
                        }
                        else{
                                tablero[1][moto.getPosX()] = null;
                                moto.retroceder();
                        }
                        actualizarTablero(tablero, moto);
                        break;
                    case 3:
                        if(mazo[cartaRandom].getEstado() %2==0){
                            tablero[2][coche.getPosX()] = null;
                                coche.avanzar();
                        }
                        else{
                                tablero[2][coche.getPosX()] = null;
                                coche.retroceder();
                        }
                        actualizarTablero(tablero, coche);
                        
                        break;
                    default:
                        System.out.println("El numero no esta entre el 1 y el 3");
                }
            }            
            //Mostramos el tablero
            mostrarTablero(tablero);
            
            
            
            
        } while (!algunoGano(tablero));
        
        
        
        
        
        
    }

    public static void mostrarTablero(Vehiculo[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < 10; j++) {
                if(tablero[i][j] != null){
                    System.out.print(tablero[i][j].getNombre());
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.println("");
        }
    }

    public static void actualizarTablero(Vehiculo[][] tablero, Vehiculo vehiculo) {
        tablero[vehiculo.getPosY()][vehiculo.getPosX()] = vehiculo;
    }

    public static boolean algunoGano(Vehiculo[][] tablero) {
        if((tablero[0][9] == null) && (tablero[1][9] == null) && (tablero[2][9] == null)){
            return false;
        }
        else{
            System.out.println("Alguien llego a la meta");
            
            return true;
            
        }
    }

    
}
