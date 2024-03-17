
package juego1000km;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;


public class Juego1000km {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Crear jugadores
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        
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
            mazo.add(new Carta("SEMAFORO ROJO", true));
            mazo.add(new Carta("SIN GASOLINA", true));
            mazo.add(new Carta("SEMAFORO VERDE", false));
            mazo.add(new Carta("GASOLINA", false));
        }
        
        //Mezclar mazo
        Collections.shuffle(mazo);

        
        //Crear mesa
        Mesa mesa = new Mesa();
        
        
        
        //Repartir cartas
        for (int i = 0; i < 6; i++) {
            j1.getCartasJugador().add(mazo.pollFirst());
            j2.getCartasJugador().add(mazo.pollFirst());
        }
        System.out.println(j1.getCartasJugador());
        System.out.println(j2.getCartasJugador());
        
        int turnos = 0;
        do {            
            System.out.println("--------------------------------------- Turno: " + turnos + "---------------------------------------");

            System.out.println("Turno jugador 1" );

            System.out.println("Cartas de la mesa");
            System.out.println(mesa);

            System.out.println("Cartas del jugador 1:                                kilometros: " + j1.getKmTotales());

            //Robar nueva carta
            j1.getCartasJugador().add(mazo.pollFirst());

            System.out.println(j1.getCartasJugador());

//            comprobarSemaforo(mesa.getCartasJugadas1());




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
            comprobarCarta(cartaElegida, j1, j2, mesa);
            
            //Poner la carta en la mesa
            mesa.getCartasJugadas1().add(cartaElegida);
            


            System.out.println("-----------");
            
            

            turnos++;
            //Condiciones para que se acabe el juego:
        } while (j1.getKmTotales()<1000 && j2.getKmTotales()<1000 && !mazo.isEmpty());
        
        
        
    }

//    private static boolean comprobarSemaforo(LinkedList<Carta> cartasJugador) {
//        boolean verde = false;
//        if(cartasJugador.getLast().getTitulo().equalsIgnoreCase("SEMAFORO VERDE")){
//            verde = true;
//        }else if(cartasJugador.isEmpty()){
//            verde = true;
//        }
//        return verde;
//    }

    private static void comprobarCarta(Carta cartaElegida, Jugador usuario, Jugador rival, Mesa mesa) {
        
        //Comprobamos si el jugador puede moverse o tiene que utilizar cartas de defensa
        boolean sePuedeMover = comprobarMovimiento(usuario);
        
        
        switch (cartaElegida.getTitulo()) {
            case "SEMAFORO ROJO":
                //Se pone el semaforo rojo al rival
                rival.setBloqueado(true);
                mesa.getCartasJugadas2().clear();
                mesa.getCartasJugadas2().add(cartaElegida);
                
                break;
            case "SEMAFORO VERDE":
                
                break;
            case "GASOLINA":
                
                break;
            case "SIN GASOLINA":
                
                break;
            default://Carta de avance
                if(sePuedeMover){
                    usuario.avanzar(cartaElegida);
                }
           
                
        }
        
        
        

    }

    private static boolean comprobarMovimiento(Jugador j1) {
        if(j1.isBloqueado()){
            System.out.println("Estas bloqueado, utiliza una carta de defensa o descarta una");
            return false;
        }else{
            return true;
        }
    }

    
}
