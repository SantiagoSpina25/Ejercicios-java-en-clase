
package ejercicio44.pkg17.pkg11.pkg23.quienmato;


public class Persona {
    //Atributos
    private String nombre;
    private String lugar;
    private boolean asesino;
    private boolean vivo;
    
    
    //Constructor
    
    public Persona(String nombre, String lugar){
        this.nombre = nombre;
        this.vivo = true;
        this.lugar = lugar;
    }
    
    
    
    
    
    //Metodo

    public String getNombre() {
        return nombre;
    }
    
    
    
    
    
    
    public void dondeEstabas(){
        
        String [] lugares = {"baño", "Hall de entrada", "cocina", "jardin", "dormitorio", "salon"};
        
        if(asesino){
            
            int lugarRandom = (int) (Math.random()*6);
            lugar = lugares[lugarRandom];
            System.out.println("Yo estaba en: " + lugar);
        }
        else if(!vivo){
            System.out.println("Este personaje ha muerto");
            
        }
        else{
            System.out.println("Yo estaba en: " + lugar);
        }
        
    }

    public void setAsesino(boolean asesino) {
        this.asesino = asesino;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    
    
    
    @Override
    public String toString() {
        return  nombre + ", lugar=" + lugar ;
    }
    
    
    
    
    
    
    
    
    
    
}
