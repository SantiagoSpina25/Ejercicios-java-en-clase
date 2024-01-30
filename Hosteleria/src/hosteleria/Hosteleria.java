
package hosteleria;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Hosteleria {

    
    public static void main(String[] args) throws HabitacionesVaciasException {
        Scanner sc = new Scanner(System.in);
        
        //Encontrar a una persona y decir en que hotel esta y en que habitacion
        
        //Crud hoteles
        //Crud personas
        Persona [] habitaciones1 = new Persona[30]; 
        Persona [] habitaciones2 = new Persona[30];
        
        Hotel h1 = new Hotel("Hotel Hola", habitaciones1);
        Hotel h2 = new Hotel("Hotel Chau", habitaciones2);
        
        
        //Personas iniciales
        
        habitaciones1[0] = new Persona("Laura", 34);
        habitaciones1[3] = new Persona("Jorge", 44);
        habitaciones1[21] = new Persona("Medinilla", 41);
        
        habitaciones2[7] = new Persona("Salvador", 56);
        habitaciones2[19] = new Persona("JuanFran", 14);
        habitaciones2[4] = new Persona("Kiko", 47);
        
        
        int eleccion = 0;
        
        do {            
            System.out.println("1.Crear Persona e insertarla en un hotel, 2.Mostrar Hotel, 3.Buscar persona por nombre, 4.Borrar persona por nombre, 5.Salir");
           
            try{
                eleccion = sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("El valor que introdujiste no es el correcto, intente de nuevo");
                sc.next();
            }
            
            switch (eleccion) {
                case 1:
                   creacionPersona(habitaciones1, habitaciones2);
                    break;
                case 2:
                    try{
                        mostrarHoteles(h1, h2);
                    }
                    catch(HabitacionesVaciasException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    buscarPersona(h1, h2);
                    break;
                case 4:
                    borrarPersona(h1,h2);
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Numero no esta entre 1 y 5");
            }
            
            
        } while (eleccion !=5);
        
        
    }

    private static void creacionPersona(Persona[] habitaciones1, Persona[] habitaciones2) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nombre de la persona");
        String nombre = sc.next();
        
        System.out.println("Edad de la persona");
        int edad = sc.nextInt();
        
        Persona persona = new Persona(nombre, edad);
        
        System.out.println("");
        
        System.out.println("Persona creada, en que hotel quiere ponerla?   1.Hotel Hola || 2. Hotel Chau");
        
        int hotelEleccion = sc.nextInt();
        
        switch (hotelEleccion) {
            case 1:
                insertarPersona(habitaciones1, persona);
                break;
            case 2:
                insertarPersona(habitaciones2, persona);
                break;
            default:
                System.out.println("Numero equivocado (no esta entre el 1 y el 2)");
                break;
        }
        
        
    }

    private static void insertarPersona(Persona[] habitaciones, Persona persona) {
        //Insertamos la persona en una posicion random
        int numRandom = (int) (Math.random()*habitaciones.length);
        
        while(habitaciones[numRandom] != null){
            numRandom = (int) (Math.random()*habitaciones.length);
        }
        
        habitaciones[numRandom] = persona;
        
        System.out.println("");
        System.out.println("La persona con nombre '"+persona.getNombre() + "' fue insertada" );
        
        
    }

    private static void mostrarHoteles(Hotel h1, Hotel h2) throws HabitacionesVaciasException {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué hotel quieres mostrar? 1.Hotel Hola || 2. Hotel Chau");
        
        int hotelEleccion = sc.nextInt();
        
        switch (hotelEleccion) {
            case 1:
                mostrarHotel(h1);
                break;
            case 2:
                mostrarHotel(h2);
                break;
            default:
                System.out.println("Numero equivocado (no esta entre el 1 y el 2), mostrando ambos hoteles: ");
                mostrarHotel(h1);
                mostrarHotel(h2);
                break;
        }
    }

    private static void mostrarHotel(Hotel hotel) throws HabitacionesVaciasException {
        int contadorOcupadas = 0;
        System.out.print(hotel.getNombre().toUpperCase()+ ": ");
        for (int i = 0; i < hotel.getHabitaciones().length; i++) {
            if(hotel.getHabitaciones()[i] != null){
                System.out.print(hotel.getHabitaciones()[i] + " (hab n" + i +") | ");
                contadorOcupadas++;
            }
        }
        if(contadorOcupadas == 0){
            throw new HabitacionesVaciasException("Todas las habitaciones estan vacias!");
        }
        System.out.println("");
    }

    private static void buscarPersona(Hotel h1, Hotel h2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca nombre de la persona que quiere buscar");
        String personaBuscada = sc.next();
        
        for (int i = 0; i < 30; i++) {
            
            if(h1.getHabitaciones()[i] != null &&  h1.getHabitaciones()[i].getNombre().equalsIgnoreCase(personaBuscada)){
                System.out.println("La persona con nombre '" + personaBuscada + "' se encuentra en '" + h1.getNombre() + "' en la habitacion n" + i );
            }
            else if(h2.getHabitaciones()[i] != null && h2.getHabitaciones()[i].getNombre().equalsIgnoreCase(personaBuscada)){
                System.out.println("La persona con nombre '" + personaBuscada + "' se encuentra en  '" + h2.getNombre() + "' en la habitacion n" + i );
            }
            
            
            
        }
        
    }

    private static void borrarPersona(Hotel h1, Hotel h2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca nombre de la persona que quiere borrar");
        String personaBuscada = sc.next();
        
        for (int i = 0; i < 30; i++) {
            
            if(h1.getHabitaciones()[i] != null &&  h1.getHabitaciones()[i].getNombre().equalsIgnoreCase(personaBuscada)){
                h1.getHabitaciones()[i] = null;
                System.out.println("Persona borrada correctamente del " +h1.getNombre()+ " en la habitacion n" + i);
            }
            else if(h2.getHabitaciones()[i] != null && h2.getHabitaciones()[i].getNombre().equalsIgnoreCase(personaBuscada)){
                h2.getHabitaciones()[i] = null;
                System.out.println("Persona borrada correctamente del " +h2.getNombre() + " en la habitacion n" + i);
            }
            
            
            
        }
    }
    
}
