
package ejercicio4.pkg22.pkg09.pkg2023.calcular.area.de.un.circulo;
import java.util.Scanner;

public class Ejercicio422092023CalcularAreaDeUnCirculo {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Introduzca el radio");
        double radio = sc.nextDouble();
        
        final double pi = Math.PI;
        
        double area = Math.round(pi * (radio * radio));
        
        double longitud = Math.round(2 * pi * radio);
        
        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud del ciruclo es: " + longitud);
           
    }
    
}
