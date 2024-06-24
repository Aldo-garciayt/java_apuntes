
package ejerciciope4;

import java.util.Scanner;

public class EjercicioPE4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero=0;
        int division=0;
        
        System.out.println("introduxca un numero");
        numero = teclado.nextInt();
        if (numero%2==0){
            System.out.println("el numero" + numero + "es divisible entre 2");
            division= numero/2;
            System.out.println("numero /2" + division);
        }else {
            System.out.println("no es divisible");
            System.out.println("division=0");
        }
        
    }
    
}
