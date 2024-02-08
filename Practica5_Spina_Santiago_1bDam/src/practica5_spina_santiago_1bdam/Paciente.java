
package practica5_spina_santiago_1bdam;


public class Paciente {
    
    // Atributos
    private int id;
    private String nombre;
    private String primerApellido;
    private int edad;
    
    // Constructor

    public Paciente(int id, String nombre, String primerApellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " " + primerApellido + " " + edad;
    }
    
    
}
