
package domino;


public class Ficha implements Comparable<Ficha> {
    private int derecha;
    private int izquierda;
    private int peso;
    
    public Ficha(int derecha, int izquierda) {
        this.derecha = derecha;
        this.izquierda = izquierda;
        
        if(izquierda == derecha){
            peso=izquierda + derecha + 100;
        }
        else{
            peso=izquierda + derecha;
        }
        
        
    }

    public int getDerecha() {
        return derecha;
    }

    public void setDerecha(int derecha) {
        this.derecha = derecha;
    }

    public int getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(int izquierda) {
        this.izquierda = izquierda;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    

    @Override
    public String toString() {
        return "[ " + izquierda + " | " + derecha + " ]";
    }

    @Override
    public int compareTo(Ficha f) {
        return (peso - f.peso);
    }
    
    
    
    
}
