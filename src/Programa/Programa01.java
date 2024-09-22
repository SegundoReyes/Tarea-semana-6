
package Programa;
import java.util.Scanner;
public class Programa01 {
public static void main (String[] args){
  int numeroInicial;
  int numeroFinal;  
 Scanner lectura = new Scanner (System.in);
 
 System.out.print("Ingresa el número inicial (debe ser mayor que el número final): " );
 numeroInicial = lectura.nextInt();
 System.out.print("Ingresa el número final: ");
 numeroFinal = lectura.nextInt();
   if (numeroInicial < numeroFinal) {
      System.out.print("El número inicial debe ser mayor que el número final: " );
 } else {
            
   while (numeroInicial >= numeroFinal) {
   if (numeroInicial % 2 == 0) { 
   System.out.println(numeroInicial); 
        }
      numeroInicial--;
      }
   }
}    
}
