
package diagnosticodierna;
import java.io.*;

import java.util.Scanner;

public class DiagnosticoDierna {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Abrimos fichero
        File adn = new File("adn.txt");
        
        System.out.println("-----------------------Diagnostico de dierna-----------------------");
        int eleccion = 0;
        do {            
            
            System.out.println("1.Introducir Subcadena, 2. Ver Cadena, 3.Salir");
            eleccion = sc.nextInt();
            
            switch (eleccion) {
                case 1:
                    verDierna(adn);
                    break;
                case 2:
                    mostrarCadena(adn);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    eleccion = 3;
            }
           
        } while (eleccion != 3);
        
        
        
        
        
    }

    private static void verDierna(File adn) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Introduce la subcadena");

        try{
            
            String subCadena = sc.next();
            verificarSubCadena(subCadena);
            
            FileReader fR = new FileReader (adn);
            BufferedReader bR = new BufferedReader(fR);

            String cadena = bR.readLine();
                        
            String [] arrayCadena = cadena.split(subCadena);
            
            if(cadena.contains(subCadena)){
                
                //Corta el array cada vez que encuentra el subString, con lo cual el tamaño del array - 1 es la cantidad de veces que aparece
                System.out.println("Se encontro " + subCadena + " " + (arrayCadena.length - 1) + " veces");
                
                
                System.out.println("Queres cambiarte el ADN?? 1.SI 2.NO" );
                int eleccion2 = sc.nextInt();
                
                switch (eleccion2) {
                    case 1:
                        cambiarAdn(cadena, subCadena);
                        break;
                    case 2:
                        System.out.println("OK");
                        break;
                    default:
                        System.out.println("Numero equivocado, la rta es NO por defecto..");;
                }
                
                
                
            }
            else{
                System.out.println("Felicidades, no se ha encontrado la cadena introducida, no tenes dierna");
            }
            

        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(cadenaIncorrectaException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    
    
    
    private static void mostrarCadena(File adn) {
        
        try{
            FileReader fR = new FileReader (adn);
            BufferedReader bR = new BufferedReader(fR);

            String cadena = bR.readLine();
            System.out.println(cadena);
            
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    
    
    private static void cambiarAdn(String cadena, String subCadena) {
        
        try{
            FileWriter fW = new FileWriter ("adnNuevo.txt");
            BufferedWriter bW = new BufferedWriter(fW);
            
            String nuevaCadena = cadena.replaceAll(subCadena, "ACAT");
            
          
            
            System.out.println(nuevaCadena);
            
            bW.write(nuevaCadena);
            bW.close();
            
        }
        catch(IOException e){
            System.out.println(e);
        }
        
        
    }

    private static void verificarSubCadena(String subCadena) throws cadenaIncorrectaException {
        
        char [] arrayChar = subCadena.toCharArray();
        
        for (int i = 0; i < arrayChar.length; i++) {
            if(arrayChar[i] != 'A' && arrayChar[i] != 'G' && arrayChar[i] != 'C'  && arrayChar[i] != 'T'  ){
                throw new cadenaIncorrectaException();
            }

        }
        
       

    }
    
}
