
package ejercicio41.pkg10.pkg11.pkg23.frontera;
import java.util.Scanner;

public class Ejercicio41101123Frontera {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Persona persona1 = new Persona("Y9763150D", "Santiago");
//        Persona persona2 = new Persona("Y5764941E", "Alberto");
        
        Persona [] arrayPersonas =  new Persona[100] ;
        //Cuando el array en cierta posicion esta vacio, tiene dentro NULL
        
        int i = 0;
        boolean jugar = true;
        do{
        System.out.println("1 para datos personas, 2 para mostrar todas las personas, 3 buscar por nombre, 4 buscar por dni, 5 salir");
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                //Crear persona
                 System.out.println("Introduce un nombre");
                 String nombre = sc.next();
                 System.out.println("Introduce dni");
                 String dni = sc.next();
                 Persona persona = new Persona(dni, nombre);
                 arrayPersonas[i] = persona;
                 i++;
                break;
            case 2:
                //Mostrar todos
                for (int a = 0; a < 1 + i; a++) {
                    System.out.println(arrayPersonas[a]);
                }
                break;
            case 3:
                //Buscar por nombre
                System.out.println("Introduce nombre");
                String nombreIntroducido = sc.next();
                for (int a = 0; a < i; a++) {
                    if(nombreIntroducido.equals(arrayPersonas[a].getNombreCompleto())){
                        System.out.println("La persona con nombre " + nombreIntroducido + " es " + arrayPersonas[a]);
                    }
                }
                break;
            case 4:
                //Buscar por dni
                System.out.println("Introduce dni");
                String dniIntroducido = sc.next();
                for (int a = 0; a < i; a++) {
                    if(dniIntroducido.equals(arrayPersonas[a].getDni())){
                        System.out.println("La persona con dni " + dniIntroducido + " es " + arrayPersonas[a]);
                    }
                }
                break;    
            case 5:
                //Salir
                System.out.println("chau");
                jugar = false;
                break;
            default:
                System.out.println("Numero no esta entre el 1-5");
                jugar = false;
                break;
        }
        
        }while(jugar);
    }
    
    
}
