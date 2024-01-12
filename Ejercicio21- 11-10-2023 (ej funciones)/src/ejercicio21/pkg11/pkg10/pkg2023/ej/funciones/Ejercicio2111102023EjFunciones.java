
package ejercicio21.pkg11.pkg10.pkg2023.ej.funciones;
import java.util.Scanner;

public class Ejercicio2111102023EjFunciones {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente;
        
        System.out.println("Introduzca el valor de a (base)");
        base = sc.nextInt();
        System.out.println("Introduzca el valor de n (exponente)");
        exponente = sc.nextInt();

        System.out.println("El resultado es: " + potencia(base,exponente));
        
    }
    
    public static int potencia(int base, int exponente){
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    
}
