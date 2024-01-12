
package spinasantiago.practica.pkg4;


public abstract class Vehiculo {
    //Atributos
    protected String nombre;
    protected int posX;
    protected int posY;
    
    //Metodos
    public abstract void avanzar();
    public abstract void retroceder();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }    
    
    
    
}
