
package practicadeerrores;

import java.util.Scanner;


public class PracticaDeErrores {

    
    public static void main(String[] args) throws EdadException {
        System.out.println("Discoteca Medac, peques no gracias, minitas si por favor");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una edad");
        int edad = sc.nextInt();
        
        System.out.println("Introduzca un nombre");
        String nombre = sc.next();
        Persona persona = new Persona(edad, nombre);
        
        try {
            if(persona.getEdad() < 18){
                throw new EdadException();
            }
            else{
                persona.sacarDinero(50);
                System.out.println("Dinero sacado, restante: " + persona.getDinero());
            }
            
        } catch (EdadException e) {
            System.out.println("Error por edad");
        }
        catch(SaldoNegativoException e){
            System.out.println("Error, saldo negativo");
        }

        
        //Si es menor, soltar excepcion "si es menor"
        //Si es mayor le sacamos dinero, si tiene saldo negativo le damos un mensaje con saldo negativo
        
        
    }
    
}
