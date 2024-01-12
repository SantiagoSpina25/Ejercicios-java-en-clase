
package ej.pkg4.trimestre.pkg2;


public class Jugador {
    
    //Atributos
    private String nombre;
    private int dinero;
    
    //Constructor
    public Jugador(String nombre){
        this.nombre = nombre;
        dinero = 25000000;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        
        if(this.dinero - dinero <= 0){
            this.dinero = 0;
        }
        else{
            this.dinero = dinero;    
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
