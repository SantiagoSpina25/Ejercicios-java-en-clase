
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
        if(posX>9){
            posX = 9;
        }
    }

    @Override
    public void retroceder() {
        if(posX - 2 < 0){
            posX =0;
        }
        else{
            posX -= 2;
        }
    }
    
    @Override
    public String toString() {
        return "Camion" ;
    }
}
