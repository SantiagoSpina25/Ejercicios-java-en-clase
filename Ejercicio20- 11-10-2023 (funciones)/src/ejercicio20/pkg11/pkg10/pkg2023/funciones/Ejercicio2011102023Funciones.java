
package ejercicio20.pkg11.pkg10.pkg2023.funciones;


public class Ejercicio2011102023Funciones {


    public static void main(String[] args) {
        double a = 10, b= 1;
        
        System.out.println(media(a,b));
    }
    // Funcion
    // Double --> Porque la funcion retornara un valor decimal
    // /media --> nombre de la funcion
    public static double media(double num1, double num2) {
        double res = (num1 + num2)/2;
        return res;
    }
    
}
