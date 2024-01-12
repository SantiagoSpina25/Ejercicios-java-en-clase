
package ejercicio36.pkg08.pkg11.pkg23.p.o.o;


public class Ejercicio36081123POO {

    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona("Jorge", 10);
        
        persona1.nombre = "Santiago";
        persona1.edad = 19;
        persona1.dni = "Y976315D";
        persona1.email = "santiagospina025@gmail.com";
        
        persona2.nombre = "Roberto";
        persona2.edad = 41;
        persona2.dni = "Y946211E";
        persona2.email = "robertojajxd@gmail.com";
        
        persona1.saludar();
        persona2.comer();
        
        System.out.println(persona3.nombre);
    }
    
}
