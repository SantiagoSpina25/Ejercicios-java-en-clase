
package ejercicio39.pkg09.pkg11.pkg23.sintonizador.digital;


public class SintonizadorFm {
    
    private double frecuencia;
    
    
    SintonizadorFm(double frecuencia){
        this.frecuencia = frecuencia;
    }
    
    // Limite: 80 -- 108 en loop
    
    void subirFrecuencia(){
        System.out.println("Frecuencia subida");
        if((frecuencia + 0.5) > 108){
            frecuencia = 80;
        }
        else{
            
            frecuencia += 0.5;
        }
        
    }
    
    void bajarFrecuencia(){
        System.out.println("Frecuencia bajada");
        if((frecuencia - 0.5) < 80){
            frecuencia = 108;
        }
        else{
            frecuencia -= 0.5;
        }
        
    }
    
    void mostrarFrecuencia(){
        System.out.println("La frecuencia actual es: " + frecuencia + " Mhz");
    }
}
