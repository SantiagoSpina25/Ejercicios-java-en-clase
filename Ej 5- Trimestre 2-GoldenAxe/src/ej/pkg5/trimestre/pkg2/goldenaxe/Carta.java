
package ej.pkg5.trimestre.pkg2.goldenaxe;


public class Carta {
    
    //Atributos
    protected String fraseCarta;
    protected int vida;
    protected int fuerza;
    
    //Constructor
    public Carta(String fraseCarta, int vida, int fuerza){
        this.fraseCarta = fraseCarta;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    
    // Metodos
    
    public String getFraseCarta() {
        return fraseCarta;
    }

    public void setFraseCarta(String fraseCarta) {
        this.fraseCarta = fraseCarta;
    }

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
    
    
    
    
    
}
