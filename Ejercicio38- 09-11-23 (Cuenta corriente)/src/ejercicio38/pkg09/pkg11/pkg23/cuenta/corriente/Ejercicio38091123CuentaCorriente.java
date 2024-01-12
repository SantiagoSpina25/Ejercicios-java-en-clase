
package ejercicio38.pkg09.pkg11.pkg23.cuenta.corriente;


public class Ejercicio38091123CuentaCorriente {

    
    public static void main(String[] args) {
        
//        
//        // Crear la cuenta
//        CuentaCorriente cuenta1 = new CuentaCorriente("Y9763150D", "Santiago" );
//        
//        
//        
//        // Ingresar dinero
//        cuenta1.ingresarDinero(30.4);
//        
//        // Sacar dinero
//        cuenta1.sacarDinero(10);
//        
//        System.out.println("");
//        
//         // Mostrar datos de la cuenta
//         cuenta1.mostrarInformacion();
//        
//        CuentaCorriente cuenta2 = new CuentaCorriente(100 );
//        
//        cuenta2.mostrarInformacion();
//        
//        CuentaCorriente cuenta3 = new CuentaCorriente("Y1231340E", "Salva", 1, -40 );
//        
//        cuenta3.mostrarInformacion();
//        
//        CuentaCorriente cuenta4 = new CuentaCorriente("Maria", 400);
//        
//        cuenta4.mostrarInformacion();
        
        Persona persona = new Persona("Juan", 19, "Y9763150D");

        CuentaCorriente cuenta1 = new CuentaCorriente(persona, 100, -50);
        
        cuenta1.mostrarInformacion();
    }
    
}
