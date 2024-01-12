
package ejercicio9.pkg27.pkg09.pkg2023.ec.segdo.grado;
import java.util.Scanner;

public class Ejercicio927092023EcSegdoGrado {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, x1, x2;
        
        System.out.println("Introduzca los valores de a, b y c");

        System.out.println("Introduzca el valor de a");
        a = sc.nextDouble();
        
        
        System.out.println("Introduzca el valor de b");
        b = sc.nextDouble();
        
        
        System.out.println("Introduzca el valor de c");
        c = sc.nextDouble();
        
        double aux = b * b - 4*a*c;
        
        if(aux < 0 || a == 0){
            System.out.println("La raiz es menor a 0 o el valor de a es 0, no se puede realizar la ecuacion");
        }
        else{
            x1 = (- b + Math.sqrt(aux))/2*a;
            x2 = (- b - Math.sqrt(aux))/2*a;
            System.out.println("El valor de X1 es: " +  x1);
            System.out.println("El valor de X2 es: " +  x2);
        }
    }
    
}
