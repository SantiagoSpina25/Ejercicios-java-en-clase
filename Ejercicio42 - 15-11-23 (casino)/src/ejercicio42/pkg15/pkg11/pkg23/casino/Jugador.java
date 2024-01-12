
package ejercicio42.pkg15.pkg11.pkg23.casino;


public class Jugador {
    
    //atributos
    private String nombre;
    private String dni;
    private int fichas;
    private int edad;
    
    
    //Constructores
    Jugador(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.fichas = 100;
        this.dni = "nointroducido";
    }
    
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getFichas() {
        return fichas;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", dni=" + dni + ", fichas=" + fichas + ", edad=" + edad + '}';
    }
    
    
    
}
