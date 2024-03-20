
package listasset;

import java.util.Objects;


public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + '}';
    }

    @Override
    public int hashCode() {
//        int hash = 5;
//        hash = 97 * hash + Objects.hashCode(this.nombre);
//        hash = 97 * hash + this.edad;
//        hash = 97 * hash + Objects.hashCode(this.dni);
//        return hash;
        int a = (int) (Math.random()*10);
        return a;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public int compareTo(Persona o) {
        return (nombre.compareTo(o.nombre));
    }


    
}
