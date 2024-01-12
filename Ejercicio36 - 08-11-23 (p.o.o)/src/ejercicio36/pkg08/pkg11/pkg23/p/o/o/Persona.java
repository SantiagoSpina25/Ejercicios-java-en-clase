
package ejercicio36.pkg08.pkg11.pkg23.p.o.o;


public class Persona {
    //atributos o campos
    
    String nombre;
    int edad;
    String dni;
    String email;
    
    
    
    //Constructores
    Persona(){
        System.out.println("Creaste una persona");
    }
    
    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodos
    void saludar(){
        System.out.println("Hola, buenas, soy  " + nombre);
    }
    void comer(){
        System.out.println("Miam miam ricas mierdas");
    }
    
    
    
    
    
    
}
