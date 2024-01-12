
package ej.pkg2.trimestre.pkg2.starwars;


public class Kyloren extends Leia{
    
    public Kyloren(){
        super();
        lado_oscuro = true;
        habilidad_diplomacia = 1;
        habilidad_espadaLaser = 4;
    }

    @Override
    public void hablar() {
        System.out.println("Hola soy tu nieto");
    }
    
    
    
    
    
    
}
