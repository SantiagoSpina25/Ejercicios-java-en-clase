
package practica5_spina_santiago_1bdam;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Practica5_Spina_Santiago_1bDam {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------Bienvenido a DAMDental----------------");
        
        int eleccion = 0;
        Paciente [] pacientes = new Paciente [1];
        
        do {            
            System.out.println("1. Crear paciente -- 2. Ver pacientes -- 3. Sondaje -- 4. Salir");
            eleccion = sc.nextInt();
            
            switch (eleccion) {
                case 1:
                    //Actualizamos el array de pacientes mientras creamos uno nuevo
                    pacientes = crearPaciente(pacientes);
                    
                    break;
                case 2:
                    verPacientes();
                    break;
                case 3:
                    sondaje();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Num equivocado");
            }
            
        } while (eleccion != 4);
    }
    
    
    

    private static Paciente [] crearPaciente(Paciente [] pacientes) {

        Scanner sc = new Scanner(System.in);
        
        int id = obtenerId();
        
        System.out.println("Introduzca nombre del paciente");
        String nombre = sc.next();
        
        System.out.println("Introduzca apellido del paciente");
        String apellido = sc.next();
        
        
        System.out.println("Introduzca edad del paciente");
        int edad = sc.nextInt();
        
        Paciente paciente = new Paciente(id,nombre,apellido,edad);
//        System.out.println(paciente);
        
        //Agrandar el array
        Paciente [] arrayAux = new Paciente [id]; 
        
        //Recorremos el array de pacientes para pasar los pacientes anteriores al nuevo
        for (int i = 0; i < pacientes.length; i++) {
            arrayAux[i] = pacientes[i];
            
        }
        //Introducimos al nuevo paciente
        arrayAux[id-1] = paciente;
        
        pacientes = arrayAux;
        
//        System.out.println(Arrays.toString(pacientes));
        
        subirPaciente(pacientes);
        
        return pacientes;
    }

    private static int obtenerId() {
        int id = 0;
        try{
            FileReader fR = new FileReader("config.txt");
            BufferedReader bR = new BufferedReader(fR);
            
            String idObtenido = bR.readLine();

            if(idObtenido == null){
                id = 1;
            }else{
                id = Integer.parseInt(idObtenido);
            }
            
            //Sumar +1 a la ultima id en el archivo config
            actualizarConfig();
            
        }catch(IOException e){
            System.out.println(e);
        }

        return id;
    }

    private static void actualizarConfig() {
        try{
            FileReader fR = new FileReader("config.txt");
            BufferedReader bR = new BufferedReader(fR);
            
            int id;
            String idObtenido = bR.readLine();
            if(idObtenido == null){
                id=2;
            }
            else{
                 id = Integer.parseInt(idObtenido) + 1;
            }
           
            FileWriter fW = new FileWriter("config.txt",false);
            BufferedWriter bW = new BufferedWriter(fW);
            
            String idString = Integer.toString(id);
            
            bW.write(idString);
            bW.close();
            
        }catch(IOException e){
            System.out.println(e);
        }

    }

    private static void subirPaciente(Paciente[] pacientes) {
        
        //Actualizamos el archivo pacientes.txt
        
        try{ 
            
            FileWriter fW = new FileWriter("pacientes.txt",true);
            BufferedWriter bW = new BufferedWriter(fW);
            
            String pacientesString = "";
            
            for (int i = 0; i < pacientes.length; i++) {
                if(pacientes[i] != null){
                    pacientesString += i + " " + pacientes[i] + "\n";
                }
            }
//            System.out.println(pacientesString);
            bW.write(pacientesString);
            bW.close();
            
        }catch(IOException e){
            System.out.println(e);
        }
        
    }

    private static void verPacientes() {
        
        try{
            FileReader fR = new FileReader("pacientes.txt");
            BufferedReader bR = new BufferedReader(fR);   
            
            FileReader fR2 = new FileReader("config.txt");
            BufferedReader bR2 = new BufferedReader(fR2);   
            int tamanio = Integer.parseInt(bR2.readLine());
            String linea = bR.readLine();
            int contador = 0;
            
            Paciente [] arrPacientes = new Paciente [tamanio];

            String [] lineaPartida ;
            while(linea != null){
               lineaPartida = linea.split(" ");
               
               int idPaciente = Integer.parseInt(lineaPartida[0]);
               String nombrePaciente = lineaPartida[1];
               String apellidoPaciente = lineaPartida[2];
               int edadPaciente = Integer.parseInt(lineaPartida[3]);

               
               //Como compruebo si una variable es un String o un int?
               
               arrPacientes[contador] = new Paciente(idPaciente, nombrePaciente, apellidoPaciente, edadPaciente); 
               contador++;
               linea = bR.readLine();
            }
            
            for (int i = 0; i < arrPacientes.length; i++) {
                if(arrPacientes[i]!= null){
                    System.out.println("ID: " + arrPacientes[i].getId() + " NOMBRE Y APELLIDO: " + arrPacientes[i].getNombre() + " "+ arrPacientes[i].getPrimerApellido());
                }
                
            }
            
        }catch(IOException e){
            System.out.println(e);
        }

                 
        
    }

    private static void sondaje() {
        try{
            FileReader fR = new FileReader("sondaje.txt");
            BufferedReader bR = new BufferedReader(fR);   
            
            String dientes = bR.readLine();
            
            String [] arrDientes = dientes.split(" ");
            
            String sangrados = "";
            

            
            for (int i = 0; i < arrDientes.length; i++) {
                if(arrDientes[i].contains("+")){
                    sangrados+=arrDientes[i].substring(1) + ", ";
                }
            }
            
            
            System.out.println("Han sangrado los dientes: " + sangrados);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    
}
