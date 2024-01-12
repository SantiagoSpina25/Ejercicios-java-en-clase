
package ej.pkg6.trimestre.pkg2.alumnos;

import java.util.Scanner;


public abstract class Persona {
    
    //Atributos
    protected String nombre;
    protected double [] notas;
    protected boolean suspenso = false;
    
    //Constructores
    public Persona(String nombre){
        this.nombre = nombre;
        notas = new double [6];
    }
    
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean isSuspenso() {
        return suspenso;
    }

    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }
    
    //Personalizados
    
    public void insertarNotas(){
        Scanner sc = new Scanner(System.in);
        
        String [] nombreAsignaturas= {"Programacion", "LLMM", "Sistemas", "FOL", "BBDD", "Entornos"};
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Cual es la nota de " + nombreAsignaturas[i]);
            notas[i] = sc.nextDouble();
        }
        
    }
    
    public void estaAprobado(){
        
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] < 5){
                suspenso = true;
            }
        }

    }

    @Override
    public String toString() {
        String respuesta = "";
        for (int i = 0; i < notas.length; i++) {
            respuesta+=notas[i] + " || ";
            
        }
               
        return nombre + " ["+respuesta + "]";
    }
    
    
    
    
    
    
}


    
