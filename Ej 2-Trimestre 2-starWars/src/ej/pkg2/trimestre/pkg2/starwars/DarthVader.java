
package ej.pkg2.trimestre.pkg2.starwars;


public class DarthVader {
    //Atributos
    
    protected boolean lado_oscuro;
    protected int habilidad_pilotar;
    protected int habilidad_espadaLaser;
    protected int habilidad_poderDeLaFuerza;
    protected int habilidad_convencer;
    
    //Constructores
    
    public DarthVader(){
        lado_oscuro = true;
        habilidad_pilotar = 5;
        habilidad_espadaLaser = 4;
        habilidad_poderDeLaFuerza = 5;
        habilidad_convencer = 4;
    }
    
    //Metodos
    
    public void hablar(){
        System.out.println("Hola, yo soy tu padre");
    }
    
}
