
package ej.pkg3.trimestre.pkg2.granja;


public class Perro extends Animal{
    
    
    
    public Perro(){
        super();
        nombre = "Perro";
    }
    
    
    
    
    @Override
    public void comer(){
        System.out.println("Pienso");
    }
    
    @Override
    public void dormir(){
        System.out.println("siu");
    }
}
