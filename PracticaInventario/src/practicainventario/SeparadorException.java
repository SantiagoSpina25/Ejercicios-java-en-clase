
package practicainventario;


public class SeparadorException extends Exception {

    public SeparadorException() {
        super("El separador deberia ser ':' y el actual no es el correcto");
    }
    
}
