
package ej.pkg10.trimestre.pkg2.supermercadosconficheros;

import java.util.Objects;


public class Producto {
    
    //Atributos
    private String nombre;
    private int precio;
    
    //Constructor
    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{" + nombre + " = " + "$"+ precio + "}";
    }


    public boolean equals(Producto producto){
        return (nombre.equals(producto.getNombre()) && (precio == producto.getPrecio()));
    }
    
    
    
}
