
package mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Mapas {

    
    public static void main(String[] args) {
        //**********************************************HASHMAP -no ordena **********************************************
        
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Seat", "ibiza");
        diccionario.put("Ford", "Fiesta");
        diccionario.put("Opel", "Corsa");
        diccionario.put("Peugeot", "206");
        diccionario.put("Fiat", "Punto");
        
        System.out.println(diccionario);
        
        //Cuando machaco muestra el valor de antes de cambiarlo
        System.out.println(diccionario.put("Peugeot", "3008"));
        
        System.out.println(diccionario);
        
        System.out.println(diccionario.size());
        System.out.println(diccionario.isEmpty());
        System.out.println(diccionario.get("Opel"));
//        diccionario.clear();
        
        System.out.println(diccionario.containsKey("Peugeot"));
        System.out.println(diccionario.containsValue("206"));
        
        System.out.println(diccionario.values());//Devuelve una coleccion con los valores del map
        
        System.out.println(diccionario.remove("clave"));
        
        
        
        //Maneras de recorrer un diccionario
        
        //1
        
        HashMap<Integer,String> map = new HashMap<>();
        
        map.put(1, "Lanus");
        map.put(2, "Malaga");
        map.put(3, "Cadiz");
        
        for (HashMap.Entry<Integer, String> ciudades : map.entrySet()) {
            Integer clave = ciudades.getKey();
            String valor = ciudades.getValue();
            System.out.println(ciudades);
//            System.out.println("clave: " + clave + " valor " + valor);
        }
        
        //2 (La que mas le gusta a kiko)
        Iterator<Integer> it = map.keySet().iterator();
        
        
        while (it.hasNext()) {
            int clave = it.next();
            String valor = map.get(clave);
            
            System.out.println("clave=" + clave + " valor=" + valor);
            
        }
        
        //3
        
        for(String ciudad: map.values()){
            System.out.println("Ciudad:" + ciudad);
        }
        
        
        //4
        map.forEach((clave,valor) ->{
            System.out.println("Clave" + clave + "valor" + valor);
        });
        
        
        
        
        
        //**********************************************TREEMAP -orden habitual **********************************************
         
         TreeMap<String,Integer> mapa = new TreeMap<>();
         
         mapa.put("Juan", 18);
         mapa.put("Elena", 20);
         mapa.put("Zarko", 50);
         mapa.put("Alvaro", 18);
         
         System.out.println(mapa);
         
        //**********************************************LINKEDTREEMAP -orden de insercion 
        
        LinkedHashMap<String,Integer> mapa2 = new LinkedHashMap<>();
        
        mapa2.put("Juan", 18);
        mapa2.put("Elena", 20);
        mapa2.put("Zarko", 50);
        mapa2.put("Alvaro", 18);
         
        System.out.println(mapa2);
        
    }
    
}
