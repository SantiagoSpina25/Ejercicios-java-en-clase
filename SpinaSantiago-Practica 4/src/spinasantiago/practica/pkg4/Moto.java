
package spinasantiago.practica.pkg4;


public class Moto extends Vehiculo{
    //Constructor
    public Moto(){
        posX = 0;
        posY = 1;
        nombre = "Moto";
    }
    
    //Metodos
    @Override
    public void avanzar() {
        posX += 4;
    }

    @Override
    public void retroceder() {
        posX -= 4;
    }
    
    @Override
    public String toString() {
        return "Moto" ;
    }
}
