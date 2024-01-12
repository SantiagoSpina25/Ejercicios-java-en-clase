
package ej.pkg4.trimestre.pkg2;


public abstract class Hotel {
    
    // Atributos
    protected String nombre;
    protected int precio;
    protected boolean comprado;
    
    // Constructores
    public Hotel(){
    }
    
    // Metodos 
    
    
    public boolean isComprado() {
        return comprado;
    }

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
    
    public void setComprado(boolean comprado){
        this.comprado = comprado;
    }
    
    
    
    

    @Override
    public String toString() {
        char compra;
        if(comprado){
            compra = 'X';
        }
        else{
            compra = ' ';
        }

        return  nombre + "[" + compra + ']';
    }
    
    
    
}
