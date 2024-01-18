
package ejercicioajedrez;

import java.util.Scanner;


public class Peon extends Figura{
    
    protected int contadorMovimientos;
    //Constructor
    public Peon(String equipo, int posx, int posy) {
        nombre = "Peon";
        this.equipo = equipo;
        this.posx = posx;
        this.posy = posy;
        contadorMovimientos = 0;
    }

    @Override
    public void mover() {
        Scanner sc = new Scanner(System.in);
        
        //Movimiento para figura negra
        if(equipo.equals("Negra")){
            
            if(contadorMovimientos == 0){
                
                System.out.println("Elija cuantas posiciones quiere moverse");
                System.out.println("1.Una o 2. Dos");
                int eleccion = sc.nextInt();
                
                switch (eleccion){
                    case 1:
                        posx= posx+ 1;
                        comprobarMovimiento(posx, posy,posx+ 1);
                        break;
                    case 2:
                        posx=posx+2;
                        contadorMovimientos++;
                        break;
                    default:
                        System.out.println("No esta entre los valores comprendidos");
                }
                

            }
            else{ 
                if(comprobarMovimiento(posx, posy,posx+ 1)){
                    posx++;
                    System.out.println("Movido una casilla");
                }                
            }
            
            
        }else{//Movimiento para figura blanca
             if(contadorMovimientos == 0){
                
                System.out.println("Elija cuantas posiciones quiere moverse");
                System.out.println("1.Una o 2. Dos");
                int eleccion = sc.nextInt();
                
                switch (eleccion){
                    case 1:
                        posx--;
                        break;
                    case 2:
                        posx=posx-2;
                        contadorMovimientos++;
                        break;
                    default:
                        System.out.println("No esta entre los valores comprendidos");
                }

            }
            else{
                posx--;
                System.out.println("Movido una casilla");
            }
            
        }
    }
    
    public boolean comprobarMovimiento(int posx, int posy, int movimiento){
        boolean puedeMover = true;
        //Comprobamos que no se pase del tablero
        if(((posx + movimiento) > 8) || ((posx + movimiento) < 0) || ((posy + movimiento) < 0) || ((posy + movimiento) < 0) ){
            System.out.println("El movimiento no se puede realizar");
            puedeMover = false;
        }
        return puedeMover;
    }
    
    
    
    
    
    
    
}
