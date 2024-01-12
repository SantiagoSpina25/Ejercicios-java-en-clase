
package metodos.arrays;
import java.util.Arrays;

public class MetodosArrays {


    public static void main(String[] args) {
        
        int [] array1 = new int [4];
        int [] array2 = new int [4];
         
        // arr.fill(array, "relleno")
        // Metodo para rellenar el array con el valor que queramos
        Arrays.fill(array1, 0);
        
        // arr.toString(array)
        // Metodo para mostrar el array por pantalla
        System.out.println(Arrays.toString(array1));
        
        
        // arr.equals(array1, array2)
        // Metodo para comparar dos arrays, retorna un booleano
        Arrays.equals(array1, array2);
        
        
        //Arrays.copyOf(array1, array2, tamaño)
        
        //Arrays.sort()
        
    }
    
}
