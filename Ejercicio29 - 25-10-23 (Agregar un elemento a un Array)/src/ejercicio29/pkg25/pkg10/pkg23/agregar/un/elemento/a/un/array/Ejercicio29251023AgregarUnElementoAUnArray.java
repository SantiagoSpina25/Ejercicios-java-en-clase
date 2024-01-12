
package ejercicio29.pkg25.pkg10.pkg23.agregar.un.elemento.a.un.array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio29251023AgregarUnElementoAUnArray {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [] array1 = {1,2,3,4};
        System.out.println(Arrays.toString(array1));
//        int [] array2 = new int [array1.length + 1];
        
//        Arrays.fill(array2, 0);
        
        //Copiamos los dos arrays
        
//        for (int i = 0; i < array1.length; i++) {
//            array2[i] = array1[i];
//        }

        int  [] array2 = Arrays.copyOf(array1, 5);
        

        System.out.println("Introduzca un numero");
        array2[2] = sc.nextInt();

        for (int i = 3; i < array2.length; i++) {
            array2[i] = array1[i - 1];
        }
               
        
        System.out.println(Arrays.toString(array2));
    }
    
}
