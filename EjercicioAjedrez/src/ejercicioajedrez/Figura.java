
package ejercicioajedrez;


public abstract class Figura {
    
    //Atributos
    protected String nombre;
    protected int posx;
    protected int posy;
    protected String equipo;

    
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
    
    public abstract void mover();

    @Override
    public String toString() {
        return nombre.charAt(0) + "";
    }
    
    
}
