
package ej.pkg1.trimestre.pkg2.copiaspersonas.idAutoincrementado;


public class Persona {
    
    private String nombre;
    private int edad;
    private static int id;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        id++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Persona.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", id=" + id + '}';
    }

  
    
    
    
    
}
