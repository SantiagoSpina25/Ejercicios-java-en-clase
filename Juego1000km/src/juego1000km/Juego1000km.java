
package juego1000km;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;


public class Juego1000km {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Crear jugadores
        Jugador j1 = new Jugador(true, true,new LinkedList<>());
        Jugador j2 = new Jugador(true, true,new LinkedList<>());
        
        //Mazo cartas
        LinkedList<Carta> mazo = new LinkedList<>();
        
        //Crear cartas de distancia
        for (int i = 0; i < 2; i++) {
           mazo.add(new Carta("25 KM", 25)); 
           mazo.add(new Carta("50 KM", 50)); 
           mazo.add(new Carta("75 KM", 75)); 
           mazo.add(new Carta("150 KM", 150)); 
           mazo.add(new Carta("200 KM", 200)); 
        }
        
       
        for (int i = 0; i < 6; i++) {
           mazo.add(new Carta("100 KM", 100)); 
        }
        
        
        //Cartas de ataque y defensa
        for (int i = 0; i < 8; i++) {
            mazo.add(new Carta("SEMAFORO ROJO"));
            mazo.add(new Carta("SIN GASOLINA"));
            mazo.add(new Carta("SEMAFORO VERDE"));
            mazo.add(new Carta("GASOLINA"));
        }
        
        //Mezclar mazo
        Collections.shuffle(mazo);

        
//        //Crear mesa
//        Mesa mesa = new Mesa();
        
        
        
        //Repartir cartas
        for (int i = 0; i < 6; i++) {
            j1.getCartasJugador().add(mazo.pollFirst());
            j2.getCartasJugador().add(mazo.pollFirst());
        }

        
        int turnos = 0;
        do {            
            System.out.println("--------------------------------------- Turno: " + turnos + "---------------------------------------");
            
            // -----------------------------------------JUGADOR 1-----------------------------------------

            System.out.println("*****TURNO JUGADOR 1***** ESTADO: " + j1.isSemaforo_verde());

            System.out.println("Cartas de la mesa");
            System.out.println(j1.getCartasMesa());
            System.out.println(j2.getCartasMesa());


            System.out.println("Cartas del jugador 1:                                kilometros: " + j1.getKmTotales());
            System.out.println(j1.getCartasJugador());
            
            
            //Robar nueva carta
            j1.getCartasJugador().add(mazo.pollFirst());

            


            System.out.println("Posicion de la carta que quieres jugar");
            int posEleccion=0;

            try{
                posEleccion = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Valor incorrecto");
            }




            //Guardamos la carta que elige el jugador y la removemos de su lista
            Carta cartaElegida = j1.getCartasJugador().get(posEleccion);
            j1.getCartasJugador().remove(posEleccion);
            
            
            //Comprobar tipo de carta
            comprobarCarta(cartaElegida, j1, j2,1);


            // -----------------------------------------JUGADOR 2-----------------------------------------
            
            System.out.println("*****TURNO JUGADOR 2***** ESTADO: " + j2.isSemaforo_verde() );

            System.out.println("Cartas de la mesa");
            System.out.println(j1.getCartasMesa());
            System.out.println(j2.getCartasMesa());


            System.out.println("Cartas del jugador 2:                                kilometros: " + j2.getKmTotales());
            System.out.println(j2.getCartasJugador());
            
            
            //Robar nueva carta
            j2.getCartasJugador().add(mazo.pollFirst());

            


            System.out.println("Posicion de la carta que quieres jugar");
            int posEleccion2=0;

            try{
                posEleccion2 = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Valor incorrecto");
            }




            //Guardamos la carta que elige el jugador y la removemos de su lista
            Carta cartaElegida2 = j2.getCartasJugador().get(posEleccion2);
            j2.getCartasJugador().remove(posEleccion2);
            
            
            //Comprobar tipo de carta
            comprobarCarta(cartaElegida2, j1, j2,2);

            


            System.out.println("-----------");
            System.out.println("Cartas restantes en el mazo: " + mazo.size());
            

            turnos++;
            //Condiciones para que se acabe el juego:
        } while (j1.getKmTotales()<1000 && j2.getKmTotales()<1000 && !mazo.isEmpty());
        
        
        
    }
    
     private static boolean puedeMover(Jugador jugador) {
        
        boolean puedeMover = false;
         
        if(jugador.isSemaforo_verde()){
            puedeMover = true;
        }
        return puedeMover;
    }



    private static void comprobarCarta(Carta cartaElegida, Jugador j1, Jugador j2, int numJugador) {
        
        Jugador jugador, rival;
        
        
        if(numJugador==1){
            jugador=j1;
            rival = j2;
        }
        else{
            jugador=j2;
            rival = j1;
        }
        
        
        //Comprobamos si el jugador puede moverse o tiene que utilizar cartas de defensa
        boolean sePuedeMover = puedeMover(jugador);
        
        
        switch (cartaElegida.getTitulo()) {
            case "SEMAFORO ROJO":
                //Se pone el semaforo rojo al rival
                rival.setSemaforo_verde(false);
                rival.getCartasMesa().clear();
                rival.getCartasMesa().add(cartaElegida);                
                break;
            case "SEMAFORO VERDE":
                jugador.setSemaforo_verde(true);
                jugador.getCartasMesa().clear();
                jugador.getCartasMesa().add(cartaElegida);
                break;
            case "GASOLINA":
                jugador.setGasolina(true);
                jugador.getCartasMesa().clear();
                jugador.getCartasMesa().add(cartaElegida);
                break;
            case "SIN GASOLINA":
                rival.setGasolina(false);
                rival.getCartasMesa().clear();
                rival.getCartasMesa().add(cartaElegida);    
                break;
            default://Carta de avance
                if(sePuedeMover){
                    jugador.avanzar(cartaElegida);
                }
                else{
                    System.out.println("El jugador esta bloqueado, carta descartada " + '\n');
                }
        }
    }
    
}
