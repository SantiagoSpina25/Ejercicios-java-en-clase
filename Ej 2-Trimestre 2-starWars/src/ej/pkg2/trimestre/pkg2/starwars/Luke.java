
package ej.pkg2.trimestre.pkg2.starwars;


public class Luke extends DarthVader {
    
    // Constructor
    
    public Luke(){
        super();
        lado_oscuro = false;
        habilidad_espadaLaser = 5;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, soy tu hijo que viene a matarte");
    }
    
    
    
}
