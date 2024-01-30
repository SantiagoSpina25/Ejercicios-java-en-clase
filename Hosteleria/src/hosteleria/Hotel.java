
package hosteleria;


public class Hotel {
    //Atributos
    private String nombre;
    private Persona [] habitaciones;

    public Hotel(String nombre, Persona[] habitaciones) {
        this.nombre = nombre;
        this.habitaciones = habitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Persona[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", habitaciones=" + habitaciones + '}';
    }
    
    
    
    
}
