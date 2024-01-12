
package ej.pkg3.trimestre.pkg2.granja;


public class Gato extends Animal {
    
    
    public Gato(){
        super();
        nombre = "Gato";
    }
    
    
    
    
    
    @Override
    public void comer(){
        System.out.println("Pescado");
    }
    
    @Override
    public void dormir(){
        System.out.println("zzz");
    }
    
}
