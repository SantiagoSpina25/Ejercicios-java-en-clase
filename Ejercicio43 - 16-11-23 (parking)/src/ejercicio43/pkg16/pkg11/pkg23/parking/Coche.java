
package ejercicio43.pkg16.pkg11.pkg23.parking;


public class Coche {
    
    // Atributos
    private String matricula;
    private String modelo;
    
    // Constructores
    
    public Coche(String matricula, String modelo){
        this.matricula = matricula;
        this.modelo = modelo;
    }
    
    
    //Metodos

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", modelo=" + modelo + '}';
    }
    
    
    
    
    
    
    
    
}
