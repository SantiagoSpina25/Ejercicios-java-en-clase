
package ejercicio38.pkg09.pkg11.pkg23.cuenta.corriente;




public class Persona {
     //atributos o campos
    
    String nombre;
    int edad = 18;
    String dni;
    
    
    
    //Constructores
    
    Persona(String nombre, int edad, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    
    boolean mayorEdad(){
        boolean rta;
        if(edad<18){
            rta = false;
        }
        else{
            rta= true;
        }
        
        
        return rta;
    }
    
    void mostrarDatos(){
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("dni: " + dni);
    }
    
    //Metodos
//    int incrementa(int num){
//        int suma=this.edad + num;
//        return suma;
//    }
}
