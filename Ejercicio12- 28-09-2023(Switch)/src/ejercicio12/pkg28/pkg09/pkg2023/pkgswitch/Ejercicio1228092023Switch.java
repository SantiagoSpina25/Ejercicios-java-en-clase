
package ejercicio12.pkg28.pkg09.pkg2023.pkgswitch;
import java.util.Scanner;


public class Ejercicio1228092023Switch {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un numero para el dia de la semana, del 1 al 7");
        char letra = sc.next().charAt(0);
        
        switch (letra) {
            case 'l':
                System.out.println("El dia elegido es: Lunes");
                break;
            case 'm':
                System.out.println("El dia elegido es: Martes");
                break;
            case 'x':
                System.out.println("El dia elegido es: Miercoles");
                break;
            case 'j':
                System.out.println("El dia elegido es: Jueves");
                break;    
            case 'v':
                System.out.println("El dia elegido es: Viernes");
                break;
            case 's':
                System.out.println("El dia elegido es: Sabado");
                break;
            case 'd':
                System.out.println("El dia elegido es: Domingo");
                break;
            default:
                System.out.println("Tiene que ser una de estas letras: l, m, x, j, v, s, d");
                break;
        }
        
    }
    
}
