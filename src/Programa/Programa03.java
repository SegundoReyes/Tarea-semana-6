
package Programa;
import java.util.Scanner;
public class Programa03 {
public static void main (String[] args){
  int numero = 1;  
Scanner lectura = new Scanner (System.in);
 System.out.print("Ingresa un número entero positivo hasta el cual deseas contar : ");
        int limite = lectura.nextInt(); 

        while (numero <= limite) { 
            System.out.println(numero); 
            numero++; 
        }

        
}
    
}
