
package spinasantiago.practica.pkg4;


public class Carta {
    //Atributos
    private String nombre;
    private int estado;
    
    //Constructor

    public Carta(String nombre, int estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Carta{" + "nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
}
