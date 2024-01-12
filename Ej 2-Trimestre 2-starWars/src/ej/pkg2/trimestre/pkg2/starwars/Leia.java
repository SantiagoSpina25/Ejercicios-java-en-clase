
package ej.pkg2.trimestre.pkg2.starwars;


public class Leia extends DarthVader {
    
    int habilidad_diplomacia;
    
    public Leia(){
        super();
        lado_oscuro = false;
        habilidad_diplomacia = 5;
        habilidad_espadaLaser = 1;
        habilidad_pilotar = 3;
    }

    @Override
    public void hablar() {
        System.out.println("Hola soy tu hija");
    }
    
    public final void volar_espacio(){
        System.out.println("Terrible cagada. Mierdon");
    }
    
}
