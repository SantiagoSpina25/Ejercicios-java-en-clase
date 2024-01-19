
package practicadeerrores;


public class Persona {
    //Atributos
    private int edad;
    private String nombre;
    private double dinero;
    
    //Constructor

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
        dinero = 3;
    }
    
    //Metodo
    public void sacarDinero(double dinero) throws SaldoNegativoException{
        this.dinero = this.dinero - dinero;
        if(this.dinero < 0){
            throw new SaldoNegativoException();
        }
        
    }
    public void meterDinero(double dinero){
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    
    
    
    
    
}
