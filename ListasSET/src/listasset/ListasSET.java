
package listasset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class ListasSET {

    
    public static void main(String[] args) {
//        HashSet<Integer> numeros = new HashSet<>();
//        //Tambien se puede hacer asi:    Set numeros = new HashSet<Integer>();
//        
//        numeros.add(5);
//        numeros.add(3);
//        numeros.add(2);
//        numeros.add(9);
//                
//        System.out.println(numeros);
//        numeros.add(9);
//        System.out.println(numeros);
//        
//        
//        for (int i = 1; i < 11; i++) {
//            if(numeros.contains(i)){
//                System.out.println("La lista contiene el numero: " + i);
//            }
//        }
//        
//        
        
        
        
        
        
//        
//        HashSet<String> nombres = new HashSet<>();
//         nombres.add("Juan");
//         nombres.add("Pedro");
//         nombres.add("Zorra");
//         nombres.add("Abeja");
//         nombres.add("Vicente");
         
//         System.out.println(nombres);
        
//         Iterator<String> it = nombres.iterator();
         //Para iterar
//         while(it.hasNext()){
//             System.out.println("Nombre es: " + it.next());
//         }
//         String prueba = "Pedro";
         
         //Comprobar si contiene
//         System.out.println(nombres.contains(prueba));
         
         
//        HashSet<Persona> personas = new HashSet<>();
//        personas.add(new Persona("Alex", 0, "111"));
//        personas.add(new Persona("Pepe", 20, "777"));
//        
//        
//        Persona p1 = new Persona("Elena", 30, "77");
//        personas.add(p1);
//        System.out.println(personas);
//        personas.add(p1);
//        System.out.println(personas);
//        personas.contains(p1);
//        
//        System.out.println(personas.contains(p1));
//        
//        Persona p2 = new Persona("Elena", 30, "77");
//        personas.add(p2);
//        System.out.println(personas);
////        
//        Persona p1 = new Persona("Juan", 77, "777");
//        Persona p2 = new Persona("Juan", 77, "777");
//        personas.add(p1);
//        personas.add(p2);
//        System.out.println(personas);
        
        
        //Treeset
        
        TreeSet<String> nombres = new  TreeSet<>();
        
        nombres.add("Pepe");
        nombres.add("Bryan");
        nombres.add("Jonymelavo");
        nombres.add("Benitocarmelas");
        nombres.add("AitorTilla");
        
        System.out.println(nombres);
        
        TreeSet<Persona> personas = new  TreeSet<>();
        personas.add(new Persona("Juan",19,"Y32423"));
        personas.add(new Persona("Juan",39,"Ysfg3"));
        personas.add(new Persona("Juan",49,"fsdf"));
        System.out.println(personas);
        
        
        LinkedHashSet<String> nombress = new LinkedHashSet<>();
        nombres.add("Juan");
        nombres.add("Elena");
        nombres.add("Dios");
        nombres.add("Pepe");
        System.out.println(nombres);
        
    }
    
}
 