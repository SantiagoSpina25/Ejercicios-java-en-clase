
package ejercicio43.pkg16.pkg11.pkg23.parking;
import java.util.Scanner;

public class Ejercicio43161123Parking {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Coche [][] parking = new Coche[5][5];
        
        do {            
            
            System.out.println("1. insertar coche, 2. ver todos los coches, 3. buscar x matricula, 4. sacar coche, 5. salir");
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Matricula: ");
                    String matricula = sc.next();
                    System.out.println("Modelo: ");
                    String modelo = sc.next();
                    
                    Coche c = new Coche(matricula, modelo);
                    int plazasDisponibles = 0;
                    for (int fila = 0; fila < parking.length; fila++) {
                        for (int columna = 0; columna < parking[fila].length; columna++) {
                            if(parking[fila][columna] == null){
                                plazasDisponibles++;
                                System.out.println("Posiciones: ");
                                System.out.println("Fila: " + fila + " columna: " + columna);
                            }
                        }
                    }
                    System.out.println("Plazas disponibles: " + plazasDisponibles);
                    
                    System.out.println("Donde quiere aparcar?");
                    System.out.println("PosX");
                    int posX = sc.nextInt();
                    System.out.println("PosY");
                    int posY = sc.nextInt();
                    
                    System.out.println("Ok, aparcado en: " + posX + " " + posY);
                    parking[posX][posY] = c;
                    break;
                case 2:
                    
                    for (int fila = 0; fila < parking.length; fila++) {
                        for (int columna = 0; columna < parking[fila].length; columna++) {
                            if(parking[fila][columna] != null){
                                System.out.println("fila: " + fila + " col: " + columna  + " = "+parking[fila][columna]);
                            }
                        }
                    }
                    
                    
                    
                    
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("El numero no esta entre el 1 - 5");
            }
            
        } while (true);
        
        
    }
    
}
