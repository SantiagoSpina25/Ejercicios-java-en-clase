
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
        if(posX>9){
            posX = 9;
        }
    }

    @Override
    public void retroceder() {
        if(posX - 4 < 0){
            posX =0;
        }
        else{
            posX -= 4;
        }
    }
    
    @Override
    public String toString() {
        return "Moto" ;
    }
}
