
package juego1000km;

import java.util.Collections;
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
            
            
            
            jugarJugadores(1,j1, mesa, mazo);
            jugarJugadores(2,j2, mesa, mazo);
            
            

            turnos++;
        } while (j1.getKmTotales()<1000 && j2.getKmTotales()<1000);
        
        
        
    }

    private static void jugarJugadores(int num, Jugador j, Mesa mesa, LinkedList<Carta> mazo) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Turno jugador "+ num);
        
        System.out.println("Cartas de la mesa");
        System.out.println(mesa);
        
        System.out.println("Cartas del jugador "+num+":                                kilometros: " + j.getKmTotales());
         
        System.out.println("Carta robada");
        j.getCartasJugador().add(mazo.pollFirst());
        
        System.out.println(j.getCartasJugador());
        
        System.out.println("Posicion de la carta que quieres jugar");
        int posEleccion = sc.nextInt();
        
         //Guardamos la carta que elige el jugador y la removemos de su lista
        Carta cartaElegida = j.getCartasJugador().get(posEleccion);
        j.getCartasJugador().remove(posEleccion);
        
        if(num==1){
            mesa.getCartasJugadas1().add(cartaElegida);
        }else{
            mesa.getCartasJugadas2().add(cartaElegida);
        }
        
        
        System.out.println("-----------");
            
    }
    
}
