
import java.util.Scanner; 
public class Saludo {
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
     
      
        System.out.print("Ingresa tu nombre: ");
        String nombre = teclado.nextLine(); 
            
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
     
        teclado.close();
    }
}
