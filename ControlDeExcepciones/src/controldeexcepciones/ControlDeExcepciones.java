
package controldeexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ControlDeExcepciones {

    
    public static void main(String[] args) {
        
        int a = 5;
        
//        System.out.println(a/0);
        //Arithmetic Exception, no se puede dividir por 0
        //Exception, padre de todos los excepction, sirve para recibir todos los errores pero no es conveniente
        
//        try{
//            System.out.println(a/0);
//            System.out.println("Entrando por el final del try");
//        }
//        catch( ArithmeticException e){
//            System.out.println("No se puede dividir entre 0");
//
//        }
//        System.out.println("A");      
        
//        Scanner sc = new Scanner(System.in);
//        int num = 0;
//        int array []  = {2,3,7};
//        System.out.println("Introduce un numero");
//        
//        try{
//            division(array);    
//        }
//        catch(ArithmeticException e){
//            System.out.println("Por dividir");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Por pasasrse del array");
//        }

//        catch(Exception ex){
//            //Distintas formas de mostrar error
//            
//            //ex.printStackTrace();
//            
//            //System.out.println(ex.toString());
//            
//
//        }
//        catch(ArithmeticException e){//Aritmetica
//            System.out.println("Error al dividir entre 0");
//        }
//        catch(ArrayIndexOutOfBoundsException  e){//Se pasa del array
//             System.out.println("Error al pasarse del array");
//        }
//        catch(InputMismatchException e){//Valor equivocado
//            System.out.println("El valor que diste no coincide con el valor pedido");
//        }
//        finally{
//            System.out.println("Entrando en el finally");
//        }
    
//        int edad = 9;
//        
//        if(edad < 18){
//            throw new EdadException();
//        }
//        try{
//            System.out.println("a");
//        }
//        catch(EdadException e){
//                System.out.println("a");
//        }







    }

    public static void division(int [] array) throws ArithmeticException {
//        try{
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();
            System.out.println(array[num]/num);
//        }
//        catch(ArithmeticException e){
            System.out.println("Error por division");
//        }
        if(num > 2){
            throw new ArrayIndexOutOfBoundsException();
        }
        
    }    
}
