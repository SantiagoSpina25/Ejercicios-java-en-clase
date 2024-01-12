
package practica1.santiagospina;
import java.util.Scanner;

public class Practica1SantiagoSpina {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
/*
          // EJERCICIO 1
        
        // Pedimos la letra inicial y la edad por teclado al usuario
        System.out.println("¿Cuál es la inicial del nombre?");
        char letra = sc.next().charAt(0);
        
        System.out.println("¿Cuál es su edad?");
        int edad = sc.nextInt();
        
        // Verificamos que el usuario es mayor de edad
        if(edad >= 18){
            
            // Calculamos cuanto le falta al usuario para jubilarse, o si ya lo ha hecho
            int faltaJubilarse = 65 - edad;
            if(faltaJubilarse > 0) {
                System.out.println("A la persona con la inicial " + letra + " le falta para jubilarse un total de: " + faltaJubilarse + " años");
            }
            else{
                int yaJubilado = faltaJubilarse * -1;
                System.out.println("La persona ya se ha jubilado hace " + yaJubilado + " años");
            }
            
        }
        else{
            System.out.println("El usuario no es mayor de edad");
       }
*/        
        
       // EJERCICIO 2
       /*
        
       // Pedimos al usuario la cantidad de euros que quiere calcular
        
        System.out.println("¿Cuántos euros quiere calcular?");
         double euros = sc.nextDouble();

         // Guardamos el valor del dolar en una variable por si cambia este mismo en otro momento

         double valorDolar = 1.16;

         // Calculamos el valor al cambio
         double valorCambio = euros * valorDolar;

         System.out.println( euros + " euros equivalen a " + valorCambio + " dólares americanos");
        */



         // EJERCICIO 3
         /*
          // Declaramos las variables que vamos a usar
          int contador = 0, sumaTotal = 0;


            // Hacemos un while para asi sumar los numeros de 3 en 3 en bulce y luego hacer la suma total
          while(contador < 99){
              contador = contador + 3;
              sumaTotal = sumaTotal + contador;
          }

          System.out.println("La suma total es: " + sumaTotal);
           */

        

            // EJERCICIO 4
            
            /*
            // Declaramos las variables que vamos a utilizar

            int contador = 0, clasificacion, cantSobresaliente = 0, cantNotable = 0, cantAprobado = 0, cantSuspenso = 0;
            
             // Realizamos un bucle en el cual se piden un total de 10 calificaciones por teclado y se calcula mediante un switch
             //   la cantidad de notas que va habiendo, para luego imprimirlas por pantalla
            while(contador < 10){
                System.out.println("Introduzca la clasificacion");
                clasificacion = sc.nextInt();
                
                switch (clasificacion) {
            case 9, 10:
                cantSobresaliente = cantSobresaliente + 1;
                break;
            case 7, 8:
                cantNotable = cantNotable + 1;
                break;
            case 5,6:
                cantAprobado = cantAprobado + 1;
                break;
            case 0,1,2,3,4:
                cantSuspenso = cantSuspenso + 1;
                break;    
            default:
                System.out.println("El numero no esta entre el 1 y el 10");
                break;
         }
                contador ++;
            }
             System.out.println("Los resultados son: Cantidad de sobresalientes: " + cantSobresaliente + " Cantidad de notables: " + cantNotable + " Cantidad de aprobados: " + cantAprobado + " Cantidad de suspensos: " + cantSuspenso);

             */
            
            
            // EJERCICIO 5
            /*
            System.out.println("Supermercado Medac");
            
            System.out.println("----------------------------");
            
            
            
            // Pedimos inicial del producto y su precio por teclado

            System.out.println("¿Producto?");
            char producto = sc.next().charAt(0);
            
            System.out.println("¿Precio?");
            double precio = sc.nextInt();
            
            // Vamos calculando el precio final
            double precioFinal = precio;
            
            // Preguntamos si desea seguir introduciendo mas productos
            
            System.out.println("¿Introducir otro producto (s/n)?");
            char introducirMasProductos = sc.next().charAt(0);
            
            
            // Mediante un bucle pedimos productos y sus precios hasta que el usuario ponga 'n' o 'N'
            while((introducirMasProductos != 'n') && (introducirMasProductos != 'N') ){
                
                System.out.println("¿Producto?");
                producto = sc.next().charAt(0);

                System.out.println("¿Precio?");
                precio = sc.nextInt();
                
                // Se va acumulando el precio final
                precioFinal = precioFinal + precio;
                 
                 System.out.println("¿Introducir otro producto (s/n)?");
                 introducirMasProductos = sc.next().charAt(0);
            }
            
            // Imprimimos el precio final
            System.out.println("El importe final es: " + precioFinal);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            */
            
    }
    
}
