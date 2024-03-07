
package unirarraylistchar;

import java.util.ArrayList;
import java.util.Scanner;


public class UnirArrayListChar {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Character> texto1 = new ArrayList<>();
        
        System.out.println("Introduce un texto");
        String palabra = sc.next();
        for (int i = 0; i < palabra.length(); i++) {
            texto1.add(palabra.charAt(i));
        }
        System.out.println(texto1);
        
        ArrayList<Character> texto2 = new ArrayList<>();
        
        System.out.println("Introduce un texto");
        String palabra2 = sc.next();
        for (int i = 0; i < palabra2.length(); i++) {
            texto2.add(palabra2.charAt(i));
        }
        System.out.println(texto2);
    
        
        texto1.addAll(texto2);
        
        System.out.println("Resultado: ");
        System.out.println(texto1);
        
        
        
    }
    
}
