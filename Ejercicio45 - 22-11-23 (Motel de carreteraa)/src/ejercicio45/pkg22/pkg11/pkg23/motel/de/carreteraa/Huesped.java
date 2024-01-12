
package ejercicio45.pkg22.pkg11.pkg23.motel.de.carreteraa;


public class Huesped {
    // Atributos
    private String nombre;
    private int numeroDeNoches;
    private int precioXNoche;
    
    // Constructores
    public Huesped(String nombre, int numeroDeNoches){
        this.nombre = nombre;
        this.numeroDeNoches = numeroDeNoches;
        this.precioXNoche = numeroDeNoches * 50;
    }
    
    
    // Metodos
    
    //GET
    public String getNombre() {
        return nombre;
    }

    public int getNumeroDeNoches() {
        return numeroDeNoches;
    }
    
    public int getPrecioXNoche() {
        return precioXNoche;
    }
    
    
    
    
    //SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroDeNoches(int numeroDeNoches) {
        this.numeroDeNoches = numeroDeNoches;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Huesped{" + "nombre=" + nombre + ", numeroDeNoches=" + numeroDeNoches + '}';
    }
    
    
    
    
    
}
