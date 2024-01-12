
package ej.pkg6.trimestre.pkg2.alumnos;

import java.util.Scanner;


public class Ej6Trimestre2Alumnos {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido");
        
        Persona [] alumnos = new Persona[100];
        
        int opcion;
        int pos = 0;
        
        do {            
            System.out.println("1. Insertar alumnx, 2.Mostrar alumnos, 3. Mostrar alumnos, 4. Mostrar suspensos,"
                + " 5. Mostrar estadistica de suspensos/alumnos y alumnas , 6. Salir");
            
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1://Insertar nuevo alumno o alumna
                    System.out.println("Inserte nombre");
                    String nombre = sc.next();
                    
                    System.out.println("1. Alumno 2. alumna?");
                    int sexo = sc.nextInt();
                    
                    if(sexo == 1){
                        alumnos[pos] = new Alumno(nombre);
                        alumnos[pos].insertarNotas();
                        pos++;
                    }
                    else if(sexo ==2){
                        alumnos[pos] = new Alumna(nombre);
                        alumnos[pos].insertarNotas();
                        pos++;
                    }
                    else{
                        System.out.println("El numero no esta entre el 1 y el 2");
                    }
                    
                    break;
                case 2://Mostrar a los pibes
                    for (int i = 0; i < alumnos.length; i++) {
                        if(alumnos[i] instanceof Alumno){
                            System.out.println(alumnos[i]);
                        }
                    }
                    break;
                case 3://Mostrar a las pibas
                    for (int i = 0; i < alumnos.length; i++) {
                        if(alumnos[i] instanceof Alumna){
                            System.out.println(alumnos[i]);
                        }
                    }
                    break;
                case 4://Mostrar suspensos
                    
                    System.out.println("1. alumnos, 2. alumnas");
                    int rta = sc.nextInt();
                    
                    for (int i = 0; i < pos; i++) {
                        
                        alumnos[i].estaAprobado();
                        
                        if(rta == 1){
                            if(alumnos[i] instanceof Alumno && alumnos[i].isSuspenso()){
                                System.out.println(alumnos[i]);
                            }
                        }
                        else{
                            if(alumnos[i] instanceof Alumna && alumnos[i].isSuspenso()){
                                System.out.println(alumnos[i]);
                            }
                        }
                    }
                    break;
                case 5://Mostrar estadistica
                    int contMasculino = 0, contFemenino = 0;
                    
                    for (int i = 0; i < pos; i++) {
                        if(alumnos[i].isSuspenso() && alumnos[i] instanceof Alumno){
                            contMasculino++;
                        }
                        else if(alumnos[i].isSuspenso() && alumnos[i] instanceof Alumna){
                            contFemenino++;
                        }
                    }
                    System.out.println("Pibes: " + contMasculino/pos + " pibas: " + contFemenino/pos);
                    break;
            
            } 
            
        } while (opcion != 6);
        
    }
    
}
