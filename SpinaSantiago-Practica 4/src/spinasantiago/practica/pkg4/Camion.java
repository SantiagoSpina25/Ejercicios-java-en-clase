
package spinasantiago.practica.pkg4;


public class Camion extends Vehiculo{
    //Constructor
    public Camion(){
        posX = 0;
        posY = 0;
        nombre = "Camion";
    }
    
    //Metodos
    @Override
    public void avanzar() {
        posX += 2;
    }

    @Override
    public void retroceder() {
        posX -= 2;
    }
    
    @Override
    public String toString() {
        return "Camion" ;
    }
}
