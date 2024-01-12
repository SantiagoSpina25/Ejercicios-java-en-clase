
package ejercicio11.pkg28.pkg09.pkg2023.calificaciones;
import java.util.Scanner;
public class Ejercicio1128092023Calificaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es la nota del examen?");
        int nota = sc.nextInt();
        
        switch (nota) {
            case 9, 10:
                System.out.println("La nota es: sobresaliente");
                break;
            case 7, 8:
                System.out.println("La nota es: notable");
                break;
            case 6:
                System.out.println("La nota es: bien");
                break;
            case 5:
                System.out.println("La nota es: aprobado");
                break;
            case 0,1,2,3,4:
                System.out.println("La nota es: insuficiente");
                break;    
            default:
                System.out.println("El numero no esta entre el 1 y el 10");
                break;
        }
        
        
        
        
        
        
        
        
        
        
        
//        
//        if(nota == 9 || nota == 10){
//            System.out.println("La nota es: sobresaliente");
//        }
//        else if(nota == 7 || nota == 8){
//            System.out.println("La nota es: notable");
//        }
//        else if(nota == 6){
//            System.out.println("La nota es: bien");
//        }
//        else if(nota == 5){
//            System.out.println("La nota es: aprobado");
//        }
//        else if(nota <= 4 && nota >= 0){
//            System.out.println("La nota es: insuficiente");
//        }
//        else{
//            System.out.println("El numero no esta entre el 1 y el 10");
//        }

    }
    
}
