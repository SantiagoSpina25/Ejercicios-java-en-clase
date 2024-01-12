
package ejercicio28.pkg20.pkg10.pkg23.ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio28201023Ahorcado {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean jugar = false;
        do {            
            
        
        
            System.out.println("-------------Juego ahorcado-------------");

            // Pedimos numero de turnos del juego
            System.out.println("Indica numero de turnos");
            int turnos = sc.nextInt();

            System.out.println("Introduce el tamaño de la palabra");
            int wordSize = sc.nextInt();

            char [] palabra = new char[wordSize];

            Arrays.fill(palabra, '_');

            System.out.println(Arrays.toString(palabra));

            for (int i = 0; i < wordSize; i++) {
                System.out.println("Introduce la letra de la posicion " + i);
                palabra[i] = (char) sc.next().charAt(0);
                System.out.println(Arrays.toString(palabra));
            }



            //Empieza el jugador 2 (el que tiene que adivinar la palabra)
            boolean haGanado = false;
            boolean estaLaLetra = false;
            char [] palabraAdivinada = new char [wordSize];
            Arrays.fill(palabraAdivinada, '_');

            System.out.println("Adivine la palabra");

            do {
                    System.out.println("Introduzca una letra que crees que esta en la palabra");
                    char letra = sc.next().charAt(0);

                    for (int j = 0; j < wordSize; j++) {
                       if(palabra[j] == letra){
                          estaLaLetra = true;
                          palabraAdivinada[j] = letra;

                       }
                    }

                    if(estaLaLetra){
                        System.out.println("Correcto");
                        System.out.println(Arrays.toString(palabraAdivinada));

                    }
                    else{
                        System.out.println("Incorrecto, no esta la letra");
                    }

                    if(Arrays.equals(palabra, palabraAdivinada)){
                        System.out.println("Ha ganado!");
                        haGanado = true;
                    }
                    else{
                        turnos--;
                        System.out.println("Turnos restantes: " + turnos);   
                    }


                     estaLaLetra = false;
            } while (turnos != 0 && !haGanado);

            System.out.println("Fin");
            System.out.println("Quiere jugar de nuevo? true / false");
            jugar = sc.nextBoolean();
            
        } while (jugar);
    }
    
}
