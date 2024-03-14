
package juego1000km;


public class Carta implements Comparable{
    
    //Atributos
    private String titulo;
    private int kilometros = 0;
    private boolean ataque;
    
    //Constructores

    //Constructor para carta de distancia
    public Carta(String titulo,int num) {
        this.titulo = titulo;
        kilometros = num;
    }
    
    //Constructor de cartas de ataque 
    public Carta(String titulo, boolean ataque){
        this.titulo = titulo;
        this.ataque = ataque;
    }
    
    //Metodos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }


    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
    
    
    
}
