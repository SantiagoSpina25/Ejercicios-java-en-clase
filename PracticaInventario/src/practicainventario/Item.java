
package practicainventario;


public class Item {
    
    //Atributos
    private String nombre;
    private String precio;
    private String cantidad;
    
    //Constructor

    public Item(String nombre, String precio, String cantidad) {
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Item: " + " " + nombre + '\n' +
                  "Precio: " + " " + precio + '\n' +
                  "Cantidad: " + " " + cantidad + '\n';
    }
    
}
