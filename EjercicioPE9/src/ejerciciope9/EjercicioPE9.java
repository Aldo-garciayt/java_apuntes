
package ejerciciope9;

import java.util.Scanner;

public class EjercicioPE9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        int numero1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        int numero2 = scanner.nextInt();
        
        int NumeroMin = Math.min(numero2, numero2);
        int NumeroMax = Math.max(numero1, numero2);
        
        for (int i = 0; 1 < 10; i++) {
            int numeroAleatorio = (int) (Math.random() * (NumeroMax - NumeroMin + 1)) + NumeroMin;
            System.out.println(numeroAleatorio);
    }
    }
    
}
