
package ej.pkg3.trimestre.pkg2.granja;


public abstract class Animal {
    protected int patas;
    protected String nombre;
    
    
    public Animal(){
        patas = 4;
        nombre = "noname";
    }
    
    public abstract void comer();
    
    public abstract void dormir();
    
    public void prueba(){
        System.out.println("Hola");
    }
    
}
