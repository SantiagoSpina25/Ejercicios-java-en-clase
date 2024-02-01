
package practicaemail;

import java.util.Arrays;
import java.io.*;

public class PracticaEmail {

    
    public static void main(String[] args) {
        
        File fraseUsuario = new File("fraseUsuario.txt");
        File diccionarioInsultos = new File("diccionarioInsultos.txt");
        
        
        String frase, insultos, fraseCompleta = "";
        
        String [][] diccionario = new String [30][2];
        
        try{
            FileReader fileReader = new FileReader(fraseUsuario);
            FileReader fileReaderDiccionario = new FileReader(diccionarioInsultos);
            
            
            BufferedReader bufferedReaderFraseUsuario = new BufferedReader(fileReader);
            BufferedReader bufferedReaderDiccionarioInsultos = new BufferedReader(fileReaderDiccionario);
//            
            
            frase = bufferedReaderFraseUsuario.readLine();
            insultos = bufferedReaderDiccionarioInsultos.readLine();
            String [] division;
            int contador = 0;
            
            while(insultos != null){
                division = insultos.split(";");
                
                diccionario[contador][0] = division[0];
                diccionario[contador][1] = division[1];
                
                contador++;
                insultos = bufferedReaderDiccionarioInsultos.readLine();
            }
            
            
           bufferedReaderDiccionarioInsultos.close();
            
            
            while(frase != null){
                fraseCompleta = fraseCompleta + frase + '\n';
                frase = bufferedReaderFraseUsuario.readLine();
            }
            
//            System.out.println(fraseCompleta);
            bufferedReaderFraseUsuario.close();
            
            String [] arrayFrase = fraseCompleta.split(" ");
            
//            System.out.println(Arrays.toString(arrayFrase));
            
            //Mostrar diccionario
//            for (int i = 0; i < diccionario.length; i++) {
//                System.out.println(Arrays.toString(diccionario[i]));
//                }
            System.out.println(Arrays.toString(arrayFrase));
            //Creamos la frase family friendly
            String [] fraseFamilyFriendly = arrayFrase;
            //Recorremos la frase original
            
            for (int i = 0; i < arrayFrase.length; i++) {
                
                for (int j = 0; j < diccionario.length; j++) {
                    //Si encuentra un insulto
                    if(arrayFrase[i].equalsIgnoreCase(diccionario[j][0])){
                        
                        fraseFamilyFriendly[i] = diccionario[j][1];
                        
                    }
                    
                }
                
            }
            System.out.println(Arrays.toString(fraseFamilyFriendly));
            
            //Escuchame una cosa imbecil de mierda forro y gil la re calcada concha de tu madre tarado Encima sos feo jaja
            
            String fraseFamilyFriendlyFinal = "";
            
            for (int i = 0; i < fraseFamilyFriendly.length; i++) {
                
                fraseFamilyFriendlyFinal += fraseFamilyFriendly[i] + " ";
            }
            
            
            FileWriter fileWriter =  new FileWriter(fraseUsuario);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write(fraseFamilyFriendlyFinal);

            
            bufferedWriter.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        
        

        
    }
    
}
