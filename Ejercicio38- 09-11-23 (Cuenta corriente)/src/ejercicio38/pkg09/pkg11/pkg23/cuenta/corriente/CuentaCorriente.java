
package ejercicio38.pkg09.pkg11.pkg23.cuenta.corriente;


public class CuentaCorriente {
    
    private double saldo, limite;

//    private String dni, nombreTitular;
    Persona persona;

    CuentaCorriente(Persona persona, double saldo, double limite) {
    
        this.persona = persona;
        this.saldo = saldo;
        this.limite = limite;
    
    }
    
//     CuentaCorriente(String dni, String nombreTitular){
//        this.dni = dni;
//        this.nombreTitular = nombreTitular;
//        this.saldo = 0;
//        this.limite = -50;
//    }
//    
//    public CuentaCorriente(double saldo){
//        this.dni = "no dni";
//        this.nombreTitular = "no nombre";
//        this.saldo = saldo;
//        this.limite = -50;
//    }
//    
//    CuentaCorriente(String dni, String nombreTitular, double saldo, double limite){
//        this.dni = dni;
//        this.nombreTitular = nombreTitular;
//        this.saldo = saldo;
//        this.limite = limite;
//    }
//    
//    CuentaCorriente(String nombreTitular, double saldo){
//        //Llamada a otro constructor
//        this(saldo);
//        this.nombreTitular = nombreTitular;
//    }
    
    
    void ingresarDinero(double cantDinero){
        saldo += cantDinero;
        System.out.println("Dinero ingresado con exito");
    }
    
    void sacarDinero(double cantDinero){
        if((saldo - cantDinero) < limite ){
            System.out.println("Alcanzaste el limite negativo de la cuenta, por favor, retire menos dinero");
        }
        else{
            saldo -= cantDinero;
            System.out.println("Dinero retirado con exito");
        }
        
    }
    
    void mostrarInformacion(){
        System.out.println("nombre: " + persona.nombre);
        System.out.println("dni: " + persona.dni);
        System.out.println("saldo: " + saldo);
        System.out.println("limite: " + limite);
        System.out.println("");
    }
    
}
