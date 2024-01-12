
package ejercicio41.pkg10.pkg11.pkg23.frontera;


public class Persona {
    
    // Atributos
    private String dni;
    private String nombreCompleto;
    
    
    // Constructores
    
    public Persona(String dni, String nombreCompleto){
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
    }
    
    
    // Metodos

    public String getDni() {
        return dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombreCompleto=" + nombreCompleto + '}';
    }
    
    
    
}
