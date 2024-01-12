
package ejercicio40.pkg10.pkg11.pkg23.pelea.battle.royale;


public class Ejercicio40101123PeleaBattleRoyale {


    public static void main(String[] args) {
        
        
        
        Jugador santiago = new Jugador("Santiago");
        Jugador noname = new Jugador("noname");
        
        do {            
            int dado = (int) (Math.random() * 2) ;
//            System.out.println(dado);
            if(dado == 0){
            santiago.cagarseAPalos(noname);
                System.out.println("Santiago le rompio la cabeza a noname, vida restante: " + noname.getVida());
            }
            else{
                noname.cagarseAPalos(santiago);
                System.out.println("noname le rompio la cabeza a santiago, vida restante: " + santiago.getVida());
            }
        } while (noname.getVida() != 0 && santiago.getVida() != 0);
        
        if(noname.getVida() == 0){
            System.out.println("Gano "+ santiago.getNombre());
        }
        else{
            System.out.println("Gano " + noname.getNombre());
        }
        
        
    }
    
}
