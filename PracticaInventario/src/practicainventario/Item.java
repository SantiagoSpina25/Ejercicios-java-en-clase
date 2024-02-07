
package practicainventario;


public class Item {
    
    //Atributos
    private String nombre;
    private int precio;
    private int cantidad;
    
    //Constructor

    public Item(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Item: " + " " + nombre + '\n' +
                  "Precio: " + " " + precio + '\n' +
                  "Cantidad: " + " " + cantidad + '\n';
    }
    
}
