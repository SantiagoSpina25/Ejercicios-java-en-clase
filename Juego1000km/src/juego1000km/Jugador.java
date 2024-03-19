
package juego1000km;

import java.util.LinkedList;


public class Jugador {
    
    //Atributos
    private LinkedList<Carta> cartasJugador = new LinkedList<>();
    private int kmTotales;
    private boolean semaforo_verde;
    private boolean gasolina;
    //Cartas de la mesa
    private LinkedList<Carta> cartasMesa = new LinkedList<>();
    
    //Constructor

    public Jugador(boolean semaforo_verde, boolean gasolina, LinkedList<Carta> cartasMesa) {
        this.semaforo_verde = semaforo_verde;
        this.gasolina = gasolina;
        this.cartasMesa = cartasMesa;
        cartasMesa.addFirst(new Carta("SEMAFORO VERDE"));
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

    public boolean isSemaforo_verde() {
        return semaforo_verde;
    }

    public void setSemaforo_verde(boolean semaforo_verde) {
        this.semaforo_verde = semaforo_verde;
    }

    public boolean isGasolina() {
        return gasolina;
    }

    public void setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
    }

    public LinkedList<Carta> getCartasMesa() {
        return cartasMesa;
    }

    public void setCartasMesa(LinkedList<Carta> cartasMesa) {
        this.cartasMesa = cartasMesa;
    }
    
    
    
    @Override
    public String toString() {
        return "Jugador{" + "cartasJugador=" + cartasJugador + ", kmTotales=" + kmTotales + '}';
    }
    
    
    
    
}
