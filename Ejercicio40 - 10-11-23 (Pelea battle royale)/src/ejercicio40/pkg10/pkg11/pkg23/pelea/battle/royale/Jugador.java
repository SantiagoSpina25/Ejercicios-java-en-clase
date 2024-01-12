
package ejercicio40.pkg10.pkg11.pkg23.pelea.battle.royale;


public class Jugador {
    
    // Atributos
    private String nombre;
    private int vida;
    
    
    // Constructores
    public Jugador(){
    }
    
    public Jugador(String nombre){
        this.nombre = nombre;
        vida = 5;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public int getVida(){
        return vida;
    }
    
    public void setVida(int num){
        this.vida = num;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void cagarseAPalos(Jugador jugador){
        int v = jugador.getVida();
        jugador.setVida(v-1);
    }
    
//    @Override public String toString(){
//        return "nombre: " + nombre + " vida " + vida;
//    }

    @Override
    public String toString() {
        return "nombre: " + nombre + " vida " + vida;
    }
    
    
    
}
