
package juego1000km;

import java.util.LinkedList;


public class Jugador {
    
    //Atributos
    private LinkedList<Carta> cartasJugador = new LinkedList<>();
    private int kmTotales;
    private boolean bloqueado = false;
    
    //Constructor

    public Jugador() {
    }

    //Metodos
    
    public LinkedList<Carta> getCartasJugador() {
        return cartasJugador;
    }

    public void setCartasJugador(LinkedList<Carta> cartasJugador) {
        this.cartasJugador = cartasJugador;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    public void avanzar(Carta carta){
        kmTotales += carta.getKilometros();
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
    
    @Override
    public String toString() {
        return "Jugador{" + "cartasJugador=" + cartasJugador + ", kmTotales=" + kmTotales + '}';
    }
    
    
    
    
}
