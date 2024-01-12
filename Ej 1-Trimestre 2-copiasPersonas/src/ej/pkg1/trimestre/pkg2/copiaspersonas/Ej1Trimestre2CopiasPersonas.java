
package ej.pkg1.trimestre.pkg2.copiaspersonas;


public class Ej1Trimestre2CopiasPersonas {

  
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Antonio", 18);
        Persona p2 = new Persona(p1);
        
        p1.setNombre("Pepe");
        
        System.out.println(p2.getNombre());
        
    }
    
}
