/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        int cuenta = 0;
        int suma = 0;
        int positivos =0;
        int negativos =0;
        int A = 0;
        
        do{
            System.out.println("escribir el numero: ");
            A = reader.nextInt();
            cuenta++;
            if(A>= 0)positivos++;
            else negativos--;
            suma = suma + A;
            
            
        }while(cuenta<10);
        System.out.println("la suma es:"+ suma);
        System.out.println("los numeros positivos son: "+ positivos );
        System.out.println("los numeros negativos son: "+ negativos );
    }
    
}
