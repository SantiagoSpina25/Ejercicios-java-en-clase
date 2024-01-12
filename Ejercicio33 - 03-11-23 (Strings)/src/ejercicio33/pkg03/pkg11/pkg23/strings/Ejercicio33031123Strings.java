
package ejercicio33.pkg03.pkg11.pkg23.strings;

import java.lang.module.ModuleDescriptor;


public class Ejercicio33031123Strings {


    public static void main(String[] args) {
        
        char [] cadena = new char [4];
        cadena[0] = 'h';
        cadena[1] = 'o';
        cadena[2] = 'l';
        cadena[3] = 'a';
        
        String palabra = "hola";
        
        // Metodos que vamos a usar
               
        String texto4 = "holas";
        String texto1 = "hola";
        String texto2 = "que tal";
        String texto3 = texto1 + texto2;
        
        System.out.println(texto1);
        System.out.println(texto2);
        System.out.println(texto3);
        
        
        // Comprobar si dos strings son iguales, devuelve boolean
        System.out.println(texto1.equals(texto4));
        
        // Tamaño del string
        System.out.println(texto3.length());
        
        // Buscar una letra
        System.out.println(texto1.indexOf('h'));
        System.out.println(texto3.indexOf('a'));
        
        // Buscar una letra por posicion
        System.out.println(texto2.charAt(2));
        
        // Crea un substring 
        System.out.println(texto1.substring(0, 2));
        
        
        // Pasa a mayusculas
        System.out.println(texto1.toUpperCase());
        
        // Pasa a minusculas
        System.out.println(texto1.toLowerCase());
                

        // Pasa de numero a string
        String palabraANumber = String.valueOf(5);
        System.out.println(palabraANumber + "hola");
    }
    
}
