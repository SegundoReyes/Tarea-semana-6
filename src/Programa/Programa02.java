
package Programa;
import java.util.Scanner;
public class Programa02 {
 public static void main (String[]args){
     int contrasena = 0;
  Scanner lectura = new Scanner (System.in);
    while (contrasena != 4567) {
     System.out.println("Introduce tu contraseña numérica:");
     contrasena = lectura.nextInt();
    if (contrasena != 4567) {
       System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
     }
  }
     System.out.println("¡Contraseña correcta! Has ingresado con éxito.");
     lectura.close(); 
 }
    
}
