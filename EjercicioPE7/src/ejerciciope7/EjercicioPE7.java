
package ejerciciope7;

import java.util.Scanner;

public class EjercicioPE7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n=0;
        do{
            System.out.println("introduzca un numero");
            n = teclado.nextInt();
            
        }while (n<0);
        
        System.out.println("el numero es" + n);
        }
    }
    

