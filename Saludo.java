
import java.util.Scanner; // Importar la clase Scanner

public class Saludo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);
     
        // Pedir el nombre del usuario
        System.out.print("Ingresa tu nombre: ");
        String nombre = teclado.nextLine(); // Leer el nombre
     
        // Mostrar el saludo
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
     
        // Cerrar el Scanner
        teclado.close();
    }
}
