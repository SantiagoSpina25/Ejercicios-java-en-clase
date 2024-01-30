
package ej.pkg7.trimestre.pkg2.lecturaescritura;
import java.io.*;

public class Ej7Trimestre2LecturaEscritura {

    
    public static void main(String[] args) {
        //Guardamos el archivo en una variable llamada "file"
        File file = new File("inspector.txt");

//        try {
//            //Llamamos al fileReader y le pasamos el archivo
//            FileReader fileReader = new FileReader(file);
//            
//            //Creamos un array de letras
//            char [] arrayChar = new char [8];
//            char letra = ' ';
//            if(file.canRead()){
//                
//                int num = fileReader.read();
//                while (num!=-1) {                    
//
//                    for (int i = 0; i < arrayChar.length; i++) {
//                        letra = (char) num;
//                        arrayChar[i]=letra;
//                        num=fileReader.read();
//                        
//                    }
//                }
//
//                
//                
////                for (int i = 0; i < file.length(); i++) {
////                    int num = fileReader.read();
////                    char letra = (char) num;
////                    System.out.print(letra);
////                }
////                System.out.println(" ");
//
//                for (int i = 0; i < arrayChar.length; i++) {
//                    System.out.print(arrayChar[i]);
//                }
//                System.out.println(" ");
//                fileReader.close();
//            }
//        } catch (IOException e) {
//            System.out.println("Error al leer el archivo");
//        }

        //Archivo guardado en otro sitio
        //File file2 = new File("/user/documents/inspector.txt"); //Se pone la ruta
        
        
        //Forma agarrando toda la linea
        

        
        //Escritura
        
        try {
            //Si existe escribe, sino lo crea en la carpeta del proyecto
            
            //Si es true mantiene lo anterior, si es true machaca
            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write("Lionel");
            bufferedWriter.newLine();
            bufferedWriter.write("Messi");
            
            
            
            bufferedWriter.close();
            
        } catch (IOException e) {
            e.toString();
        }
        
        
        //Lectura
        String frase;
        String frase2 = "";
        try {
             FileReader fileReader = new FileReader(file);
             
             BufferedReader bufferedReader = new BufferedReader(fileReader);
            frase = bufferedReader.readLine();
             while (frase != null) {                
                frase2 = frase2 + frase + '\n';
                frase = bufferedReader.readLine();
                
            }
             System.out.println(frase2);
            
             
             
             
             
             //Cerrar comunicacion
             bufferedReader.close();
        } catch (IOException e) {
            e.toString();
        }
        

    }
    
}
