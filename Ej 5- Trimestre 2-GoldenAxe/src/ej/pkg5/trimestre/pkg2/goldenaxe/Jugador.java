
package ej.pkg5.trimestre.pkg2.goldenaxe;


public class Jugador {
    
    //Atributos
    protected int vida;
    protected int fuerza;
    protected boolean vivo;
    protected String nombre;
    protected Carta [] cartas;
    
    //Constructor
    public Jugador(){
        cartas = new Carta[5];
        
        cartas[0] = new Carta("Obtienes un punto de vida", 1, 0);
        cartas[1]= new Carta("Te quitan un punto de vida", -1, 0);
        cartas[2] = new Carta("Obtienes un punto de fuerza", 0, 1);
        cartas[3] = new Carta("Te quitan un punto de fuerza", 0, -1);
        cartas[4] = new Carta("Obtienes dos puntos de vida", 2, 0);
        
        
    }
    
    //Metodos

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }
    
    
    
}
