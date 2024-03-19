//
//package juego1000km;
//
//import java.util.LinkedList;
//
//
//public class Mesa extends Jugador{
//    
//    //Atributos
//    private LinkedList<Carta> cartasJugadas1= new LinkedList<>();
//    private LinkedList<Carta> cartasJugadas2= new LinkedList<>();
//    
//    //Constructor
//
//    public Mesa() {
//    }
//
//    public LinkedList<Carta> getCartasJugadas1() {
//        return cartasJugadas1;
//    }
//
//    public void setCartasJugadas1(LinkedList<Carta> cartasJugadas1) {
//        this.cartasJugadas1 = cartasJugadas1;
//    }
//
//    public LinkedList<Carta> getCartasJugadas2() {
//        return cartasJugadas2;
//    }
//
//    public void setCartasJugadas2(LinkedList<Carta> cartasJugadas2) {
//        this.cartasJugadas2 = cartasJugadas2;
//    }
//    
//    public void jugarCarta1(Carta carta){
//        cartasJugadas1.add(carta);
//    }
//    
//    public void jugarCarta2(Carta carta){
//        cartasJugadas2.add(carta);
//    }
//    
//    
//    @Override
//    public String toString() {
//        return "" + cartasJugadas1 + '\n' +cartasJugadas2 + "";
//    }
//    
//    
//}
