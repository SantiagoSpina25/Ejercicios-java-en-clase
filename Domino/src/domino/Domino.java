
package domino;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class Domino {

    
    public static void main(String[] args) {
        
        LinkedList<Ficha> mazo = new LinkedList<>();
        
        LinkedList<Ficha> jug1 = new LinkedList<>();
        LinkedList<Ficha> jug2 = new LinkedList<>();
        
        
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
    }
    
}
