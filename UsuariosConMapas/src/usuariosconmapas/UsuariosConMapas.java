
package usuariosconmapas;

import java.util.HashMap;
import java.util.Scanner;


public class UsuariosConMapas {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        HashMap<String,String> usuarios = new HashMap<>();
        
        usuarios.put("admin", "admin");
        usuarios.put("user", "user111");
        usuarios.put("ivan", "1234");
        
        System.out.println(usuarios);
        int intentos = 1;
        do {            
            System.out.println("USUARIO:");
            String usuarioIntroducido = sc.next();
            
            System.out.println("CONTRASEÑA:");
            String contraseniaIntroducida = sc.next();
            
            if(usuarios.containsKey(usuarioIntroducido)){
                if(contraseniaIntroducida.equals(usuarios.get(usuarioIntroducido))){
                    System.out.println("Sesion iniciada!");
                intentos=10;
                }else{
                    System.out.println("contraseña incorrecta, " + intentos + " de 3 intentos utilizados");
                    intentos++;
                }
                
            }else{
                System.out.println("Usuario incorrecto, " + intentos + " de 3 intentos utilizados");
                
                intentos++;
            }
                
            
            
            
            
        } while (intentos < 4);
        
        
        
    }
    
}
