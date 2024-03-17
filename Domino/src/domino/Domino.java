package domino;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class Domino {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LinkedList<Ficha> mazo = new LinkedList<>();
        
        LinkedList<Ficha> jug1 = new LinkedList<>();
        LinkedList<Ficha> jug2 = new LinkedList<>();
        
        LinkedList<Ficha> mesa = new LinkedList<>();
        
        //Creamos todas las fichas
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= i; j++) {
                mazo.add(new Ficha(i,j));
            }
        }
        
        //Mezclamos las fichas
        Collections.shuffle(mazo);
        
        //Vamos añadiendo las fichas del mazo a cada jugador
        for (int i = 0; i < 7; i++) {
            jug1.add(mazo.pollFirst());
            jug2.add(mazo.pollFirst());
        }
        
        //Para ordenar por el peso
        Collections.sort(jug1);
        Collections.sort(jug2);
        
        
        
        
        
        //Jugabilidad
        int turnos = 0;
        

        do {
            System.out.println("--------------------------- TURNO: "+ turnos+"---------------------------");
            System.out.println("");
            System.out.println(mesa);
            
            
            System.out.println(""  + '\n');
            System.out.println("Jugador 1: " + jug1);
            
            jugar(jug1, mesa, mazo);
            
            System.out.println("");
            System.out.println(mesa);
            
            
            System.out.println(""  + '\n');
            System.out.println("Jugador 2: " + jug2);
            
            
            jugar(jug2, mesa, mazo);
            
            
            
            
            
            
            turnos++;
        } while (!jug1.isEmpty() && !jug2.isEmpty());
        
        
        
        
    }
    
    

    private static void jugar(LinkedList<Ficha> jugador, LinkedList<Ficha> mesa, LinkedList<Ficha> mazo) {
        Scanner sc = new Scanner(System.in);
        
        int accionJugador = 0;
        
        
        System.out.println("Seleccione la accion que desea realizar  1.Jugar ficha  2.Robar ficha del mazo  3.Pasar turno");
        accionJugador=sc.nextInt();

        switch (accionJugador) {
            case 1:
                jugarFicha(mesa, jugador);
                break;
            case 2:
                //Robar ficha del mazo (si el mazo no esta vacio)
                if(!mazo.isEmpty()){
                    jugador.add(mazo.pollFirst());
                }else{
                    System.out.println("TURNO PASADO, MAZO VACIO");
                }
                break;
            case 3:
                System.out.println("TURNO PASADO");
                break;
            default:
                System.out.println("Numero equivocado, perdes el turno");
        }
    }

    public static void jugarFicha(LinkedList<Ficha> mesa, LinkedList<Ficha> jug1){
        int posFicha = 0, direccionFicha = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indique la posicion de la ficha que quiere jugar");
        posFicha = sc.nextInt();

        Ficha fichaElegida = jug1.get(posFicha);

        System.out.println("Donde quiere poner la ficha? 1.Izquierda  2. Derecha ");
        direccionFicha = sc.nextInt();

        switch (direccionFicha) {
            case 1:
                if(puedeColocarFicha(mesa, fichaElegida, "Izquierda")){
                    mesa.addFirst(fichaElegida);
                    jug1.remove(posFicha);
                }
                break;
            case 2:
                if(puedeColocarFicha(mesa, fichaElegida, "Derecha")){
                    mesa.addLast(fichaElegida);
                    jug1.remove(posFicha);
                }
                break;
            default:
                System.out.println("Numero equivocado, perdes el turno");
        }
            
    }

    private static boolean puedeColocarFicha(LinkedList<Ficha> mesa, Ficha fichaElegida, String direccion) {
        
        Ficha fichaAdyacente;
        boolean puedeColocar = false;
        
        
        if(!mesa.isEmpty()){
            if(direccion.equalsIgnoreCase("Izquierda")){
                fichaAdyacente = mesa.getFirst();
                
                 //Si coinciden los numeros de las fichas
                if(fichaElegida.getDerecha() == fichaAdyacente.getIzquierda()){
                    puedeColocar =  true;
                }else if(fichaAdyacente.getIzquierda() == 0 || fichaElegida.getDerecha() == 0){
                    puedeColocar =  true;
                }
                else{
                    System.out.println("Los numeros de la ficha que quiere seleccionar no coincide con la de la mesa");
                    puedeColocar = false;
                }
                
            }
            else if(direccion.equalsIgnoreCase("Derecha")){
                fichaAdyacente = mesa.getLast();

                //Si coinciden los numeros de las fichas
                if(fichaElegida.getIzquierda() == fichaAdyacente.getDerecha()){
                    puedeColocar =  true;
                }else if(fichaAdyacente.getDerecha() == 0 || fichaElegida.getIzquierda() == 0){
                    puedeColocar =  true;
                }
                else{
                    System.out.println("Los numeros de la ficha que quiere seleccionar no coincide con la de la mesa");
                    puedeColocar =  false;
                }
                
                
                
            }
        }else{
            puedeColocar = true;
        }
        
       return puedeColocar;
        
    }
    
}
