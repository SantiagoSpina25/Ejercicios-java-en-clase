
package ej.pkg4.trimestre.pkg2;
import java.util.Arrays;
import java.util.Scanner;

public class Ej4Trimestre2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turnos = 1;
//        boolean ganar = false;
        
        HotelBlue hotelBlue = new HotelBlue();
        HotelBoom hotelBoom = new HotelBoom();
        HotelChinatown hotelChinatown = new HotelChinatown();
        HotelFontaine hotelFontaine = new HotelFontaine();
        HotelPresident hotelPresident = new HotelPresident();
        HotelWakiki hotelWakiki = new HotelWakiki();
        
        
        
        
        Hotel [] arrayHoteles = {hotelBlue, hotelBoom, hotelChinatown, hotelFontaine, hotelPresident, hotelWakiki};
        System.out.println("*******COMIENZA EL JUEGO: EL COMPLEJO HOTELERO NO TAN COMPLEJO********");
            
        System.out.println("Introduzca nombre jugador...");
        Jugador jugador = new Jugador(sc.next());
        
        do {            
            
            mostrarInfo(arrayHoteles, turnos, jugador);
            
            int dadoHoteles = (int) (Math.random() * 6);
            
            System.out.println("Has caido en " + arrayHoteles[dadoHoteles]);
            
            if(arrayHoteles[dadoHoteles].isComprado()) {
                System.out.println("Esta casilla ya estaba comprada, se te descuentan 500.000$");
                jugador.setDinero(jugador.getDinero()-500000);   
                turnos++;
            }
            else{   
                System.out.println("Que quieres hacer?  1.Jugar  2. Pasar" );
                int decision = sc.nextInt();

                switch (decision) {
                    case 1:
                        tirarDadoPrecio(arrayHoteles, dadoHoteles, jugador);  
                        turnos++;
                        break;
                    case 2:
                        System.out.println("Turno pasado");
                        turnos++;
                        break;
                    default:
                        System.out.println("El numero no estra entre el 1 y el 2, perdiste un turno");
                        turnos++;
                }
            }
            
        } while (jugador.getDinero() != 0 && turnos != 13);
        

        
    }

    private static void tirarDadoPrecio(Hotel [] arrayHoteles ,int dadoHoteles, Jugador jugador) {
         int dadoPrecio = (int) (Math.random() * 4);
                    
        System.out.println("Dado tirado: " + dadoPrecio);
        
        switch (dadoPrecio) {
            case 0:
                System.out.println("El hotel te sale gratis");
                arrayHoteles[dadoHoteles].setComprado(true);
                break;
            case 1:
                System.out.println("El hotel te sale: " + arrayHoteles[dadoHoteles].getPrecio());
                jugador.setDinero(jugador.getDinero()-arrayHoteles[dadoHoteles].getPrecio());
                arrayHoteles[dadoHoteles].setComprado(true);
                break;
            case 2:
                System.out.println("El hotel te sale el doble: " +  arrayHoteles[dadoHoteles].getPrecio() * 2);
                jugador.setDinero(jugador.getDinero()-arrayHoteles[dadoHoteles].getPrecio() * 2);
                arrayHoteles[dadoHoteles].setComprado(true);
                break;
            case 3:
                System.out.println("El hotel te sale el triple: " + arrayHoteles[dadoHoteles].getPrecio() * 3 + " ademas no lo compras");
                jugador.setDinero(jugador.getDinero()-arrayHoteles[dadoHoteles].getPrecio() * 3);
                arrayHoteles[dadoHoteles].setComprado(true);
                break;
        }
    }
    
    public static void mostrarInfo(Hotel[] arrayHoteles, int turnos, Jugador jugador){
        System.out.println("Turno: " + turnos + ":");
        System.out.println(jugador.getNombre() + " tienes " + jugador.getDinero());

        System.out.println(Arrays.toString(arrayHoteles));
    }
    
    
}
