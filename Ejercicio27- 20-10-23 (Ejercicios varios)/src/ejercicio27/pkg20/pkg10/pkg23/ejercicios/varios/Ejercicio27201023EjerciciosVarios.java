
package ejercicio27.pkg20.pkg10.pkg23.ejercicios.varios;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio27201023EjerciciosVarios {

    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        //EJ 1 ARRAYS.FILL
//        char [] a = new char[5];
//        
//        
//        // Rellena el array a con 'a'
//        Arrays.fill(a, 'a');
//        System.out.println(Arrays.toString(a));
//        
        
        
         //EJ 2 COMPARACION DE ARRAYS CON TAMAÑO DISTINTO
        
        int [] array1 = {1,2,3};
        
        System.out.println("Introduzca el tamaño del array (debe ser mayor o igual que 3)");
        
        int size = sc.nextInt(); 
        
        
        // Si el tamaño del array es menor que 3, no se podra seguir
        
        while(size < 3){
            System.out.println("El array es menor que 3, introduzca nuevamente");
            size = sc.nextInt();
        }
        

        int [] array2 = new int [size];    

        System.out.println("Ahora rellene el array con los numeros que quiera");


        // Introducimos los numeros que queramos en el array
        for (int i = 0; i < size; i++) {
            System.out.println("Posicion " + i);
            array2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array2));


        // Realizamos la comparacion entre los arrays

        if(compararArrays(array1, array2)){
            System.out.println("El array 1 esta contenido el en array 2");
        }
        else{
            System.out.println("El array 1 no esta contenido en el array 2");
        }

        
        
         
         
        
    }
    
    
    public static boolean compararArrays(int[] array1, int[] array2){
        boolean sonIguales = false;
        
        for (int i = 0; i < 3; i++) {
            
            
            //Opcion con array.equals

            // boolean sonIguales = Array.equals(a,0,2,b,0,2);
            // return sonIguales
            
            if(array1[i] == array2[i]){
                sonIguales = true;
            }
            else{
                sonIguales = false;
            }
            
        }
        
        return sonIguales;
    }
    
}
