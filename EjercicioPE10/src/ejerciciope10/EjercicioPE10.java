
package ejerciciope10;

import java.util.Scanner;

public class EjercicioPE10 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int num, cifras = 0;

        do {
            System.out.print("Introduce un número entero positivo: ");
            num = sc.nextInt();

            if (num < 0) {
                System.out.println("El número introducido no es positivo, inténtalo de nuevo.");
            }
        } while (num < 0);

        if (num == 0) {
            cifras = 1;
        } else {
            while (num != 0) {
                num /= 10;
                cifras++;
            }
        }

        System.out.println("El número introducido tiene " + cifras + " cifras.");
    }
}