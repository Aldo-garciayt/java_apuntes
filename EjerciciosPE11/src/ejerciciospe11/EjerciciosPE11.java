/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospe11;

/**
 *
 * @author arisi
 */
public class EjerciciosPE11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            if (num > 1) {
                boolean esPrimo = true;
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    System.out.println(num);
                }
            }
        }
    }
}
    
    

