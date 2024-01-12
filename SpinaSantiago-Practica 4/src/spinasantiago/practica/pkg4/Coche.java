
package spinasantiago.practica.pkg4;


public class Coche extends Vehiculo {

    //Constructor
    public Coche(){
        posX = 0;
        posY = 2;
        nombre = "Coche";
    }
    
    //Metodos
    @Override
    public void avanzar() {
        posX += 3;
    }

    @Override
    public void retroceder() {
        posX -= 3;
    }

    @Override
    public String toString() {
        return "Coche" ;
    }
    
    
    
    
}
