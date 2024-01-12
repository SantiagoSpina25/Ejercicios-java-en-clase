
package ejercicio44.pkg17.pkg11.pkg23.quienmato;
import java.util.Scanner;

public class Ejercicio44171123QuienMato {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        Persona mayordomo = new Persona("Mayordomo", "hall de entrada");
        Persona amaDeLlaves = new Persona("Ama_de_llaves", "dormitorio");
        Persona jardinero = new Persona("Jardinero", "jardin");
        Persona cocinero = new Persona("Cocinero", "cocina");
        Persona propietario = new Persona("Propietario", "salon");
        Persona esposa_propietario = new Persona("Esposa_propietario", "baño");
        
        
        Persona [] personajes = {mayordomo, amaDeLlaves, jardinero, cocinero, propietario, esposa_propietario};
        
        boolean jugar = true;
        int turnos = 3;
        int asesinoRandom = (int) (Math.random() * 6 );
        personajes[asesinoRandom].setAsesino(true);
        
        do {
//            System.out.println(asesinoRandom);


//            System.out.println(personajes[asesinoRandom]);
        
            System.out.println("1. dime el asesino, 2.hablar con un personaje, 3.salir");
            
            int opcionUsuario = sc.nextInt();
            
            switch (opcionUsuario) {
                case 1:
                    //Adivinar el asesino
                    System.out.println("Quien crees que es el asesino?");
                    
                    String respuestaUsuario = sc.next(); 
                    
                    if(respuestaUsuario.equalsIgnoreCase(personajes[asesinoRandom].getNombre())){
                        System.out.println("Correcto, el asesino era: " + personajes[asesinoRandom]);
                        turnos = 0;
                    }
                    else{
                        System.out.println("Incorrecto, el asesino era " + personajes[asesinoRandom]);
                        turnos = 0;
                    }
                    
                    break;
                case 2:
                    //Hablar con un personaje
                    System.out.println("Con que personaje quieres hablar?");
                    System.out.println("1. Mayordomo, 2. Ama de llaves, 3. Jardinero, 4. Cocinero, 5. Propietario, 6. Esposa de propietario");
                    int opcionHablar = sc.nextInt();
                    
                    switch (opcionHablar) {
                        case 1:
                            System.out.println("Hablando con mayordomo...");
                            personajes[0].dondeEstabas();
                            turnos --;
                            break;
                        case 2:
                            System.out.println("Hablando con Ama de llaves...");
                            personajes[1].dondeEstabas();
                            turnos --;
                            break;
                        case 3:
                            System.out.println("Hablando con Jardinero...");
                            personajes[2].dondeEstabas();
                            turnos --;
                            break;
                        case 4:
                            System.out.println("Hablando con Cocinero...");
                            personajes[3].dondeEstabas();
                            turnos --;
                            break;
                        case 5:
                            System.out.println("Hablando con Propietario...");
                            personajes[4].dondeEstabas();
                            turnos --;
                            break;
                        case 6:
                            System.out.println("Hablando con Esposa de propietario...");
                            personajes[5].dondeEstabas();
                            turnos --;
                            break;
                        default:
                            System.out.println("El numero no esta entre el 1 y el 6");
                    }
                    
                    
                    break;
                case 3:
                    //Salir del juego
                    System.out.println("Fin del juego");
                    System.out.println("El asesino era: " + personajes[asesinoRandom]);
                    jugar = false;
                    break;
                default:
                    //Numero no esta entre el 1 y el 3
                    System.out.println("El numero no está entre el 1 y el 3");
                    jugar = false;
            }
            
            int muerteRandom = (int) (Math.random() * 6);
            
            while(personajes[muerteRandom] == personajes[asesinoRandom]){
                muerteRandom = (int) (Math.random() * 6);
            }
            personajes[muerteRandom].setVivo(false);    
            System.out.println(personajes[muerteRandom].getNombre() + " ha muerto");
            
            System.out.println("Turnos restantes: " + turnos);
        } while (jugar && turnos != 0);
        
        
        
    }
    
}
