
package ejercicio45.pkg22.pkg11.pkg23.motel.de.carreteraa;
import java.util.Scanner;

public class Ejercicio45221123MotelDeCarreteraa {

    
    public static void main(String[] args) {
        // Precio x noche 50Euros, 20 habitciones
        //Clase huesped (nombre, n de noches       
       Scanner sc = new Scanner(System.in);
       boolean jugar = true;
       int habitacionesLibres = 0;
       Huesped [] habitaciones = new Huesped [20];
       
        do {            
            
            

            System.out.println("Bienvenido al motel Brazuca hijo de puta, elija que quiere realizar");
            System.out.println("1. Insertar huesped, 2. n de habitaciones libres, 3.Calcular precio por nombred del huesped, 4. Eliminar huesped por nombre, 5. "
                    + "Buscar huesped por nombre , 6. Buscar huesped por numero de habitacion, 7. Salir");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre del huesped");
                    String nombre = sc.next();
                    System.out.println("Numero de noches que se queda");
                    int numeroDeHabitaciones = sc.nextInt();
                    //Creamos el objeto huesped
                    Huesped nuevoHuesped = new Huesped(nombre, numeroDeHabitaciones);
                    
                    //Verificamos si esta lleno
                    if(estaLleno(habitaciones)){
                        System.out.println("No hay habitaciones libres");
                    }
                    else{
                    //Lo introducimos en una habitacion libre
                        for (int i = 0; i < habitaciones.length; i++) {
                            if(habitaciones[i] == null){
                                System.out.println("Introduciendo huesped en habitacion " + i);
                                habitaciones[i] = nuevoHuesped;
                                break;
                            }

                        }
                    }
                   
                    
                    break;
                    
                case 2:
                    //Numero de habitaciones libres
                    System.out.println("Habitaciones libres: ");
                    for (int i = 0; i < habitaciones.length; i++) {
                        if(habitaciones[i] == null){
                            habitacionesLibres ++;
                        }
                    }
                    System.out.println(habitacionesLibres);
                    if(habitacionesLibres == 0){
                        System.out.println("Todas las habitaciones estan llenas");
                    }
                    habitacionesLibres = 0;
                    break;
                    
                case 3:
                    //Buscar precio x nombre de huesped
                    System.out.println("Introduzca nombre del huesped");
                    String nombreHuespedBuscado = sc.next();
                    
                     for (int i = 0; i < habitaciones.length; i++) {
                        if(habitaciones[i] != null){
                            if((habitaciones[i].getNombre()).equalsIgnoreCase(nombreHuespedBuscado)){
                                System.out.println("Huesped encontrado!");
                                System.out.println("Precio total del huesped: " + habitaciones[i].getPrecioXNoche());
                            }
                            else{
                                System.out.println("Persona no encontrada");
                            }
                        }
                    }
                     
                    break;
                case 4:
                   //Buscar precio x nombre de huesped
                   System.out.println("Introduzca nombre del huesped que quiere eliminar");
                   String huespedAEliminar = sc.next();
                   
                   for (int i = 0; i < habitaciones.length; i++) {
                        if(habitaciones[i] != null){
                            if((habitaciones[i].getNombre()).equalsIgnoreCase(huespedAEliminar)){
                                System.out.println("Huesped encontrado, eliminandolo del motel!");
                                habitaciones[i] = null;
                            }
                            else{
                                System.out.println("Persona no encontrada");
                            }
                        }
                    }
                        
                    break;
                case 5:
                    
                    //Buscar huesped por nombre
                   System.out.println("Introduzca nombre del huesped que quiere buscar");
                   String huespedAEncontrar = sc.next();
                   
                   for (int i = 0; i < habitaciones.length; i++) {
                        if(habitaciones[i] != null){
                            if((habitaciones[i].getNombre()).equalsIgnoreCase(huespedAEncontrar)){
                                System.out.println("Huesped encontrado");
                                System.out.println(habitaciones[i].toString());
                            }
                            else{
                                System.out.println("Persona no encontrada");
                            }
                        }
                    }
                    
                    
                    
                    
                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Saliendo...");
                    jugar = false;
                    break;
                default:
                    System.out.println("No introdujo un num entre el 1-7, saliendo...");
                    jugar = false;
            }
       
        
        } while (jugar);
        
    }
    
    
    public static boolean estaLleno(Huesped [] habitaciones){
        boolean rta = false;
        int cont = 0;
        
        for (int i = 0; i < habitaciones.length; i++) {
            if(habitaciones[i] == null){
                cont++;
            }
        }
        if(cont ==0){
            rta = true;
        }
        return rta;
                
    }
    
}
