
package notasconmapas;

import java.util.HashMap;
import java.util.Iterator;


public class NotasConMapas {

//    static int sumaTotal;
    
    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();
        
        notas.put("Emilio", 6);
        notas.put("Ivan", 9);
        notas.put("Sergio", 9);
        notas.put("Alvaro", 5);
        notas.put("Monica", 2);
//        notas.put("chanchySpina", 10);
        
       
        int sumaTotal = 0;
        
        Iterator<String> it = notas.keySet().iterator();
        
        while (it.hasNext()) {
            String clave = it.next();
            int valor = notas.get(clave);
            sumaTotal+=valor;
            System.out.println("clave=" + clave + " valor=" + valor);
            
        }
        System.out.println("Suma total: "+sumaTotal);
        //media
        System.out.println("Media:" +sumaTotal/notas.size());
        
//        notas.forEach((clave,valor) ->{
//            sumaTotal+=valor;
//        });
//        System.out.println(sumaTotal);

        
        //Generar un mapa inverso
        
        HashMap<Integer, String> notasInverso = new HashMap<>();

        Iterator<String> it2 = notas.keySet().iterator();
        
        while (it2.hasNext()) {
            String clave = it2.next();
            int valor = notas.get(clave);
            notasInverso.put(valor, clave);
            
        }
        System.out.println(notasInverso);

        


    }
    
}
