
package ejercicio30.pkg25.pkg10.pkg23.matrices;
import java.util.Arrays;


public class Ejercicio30251023Matrices {


    public static void main(String[] args) {
        
        //Declarar matriz
        int [] [] matriz = new int [3] [3];
        
        //Rellenar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 3;
            }
        }
        
        //Mostrar
        
        mostrarArray(matriz);
        
        // Otra forma de crear matrices
        
        int [] [] matriz2 ={ {2,3}, {1,1}, {0,5}};
        mostrarArray(matriz2);
//        for (int i = 0; i < matriz2.length; i++) {
//            System.out.println(Arrays.toString(matriz2[i]));
//        }
        
        char [] [] matrizX = new char [3] [4];
        
        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < matrizX[0].length; j++) {
                matrizX[i][j] = 'x';
            }
        }
        
        
        
        
        
        mostrarArrayChar(matrizX);
        
    }
    
    public static void mostrarArray(int [] []matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    public static void mostrarArrayChar(char [] []matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    
    
}
