/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main4;

import java.util.Scanner;


public class Main4 {

    public static void main(String[] args) {
        int numero;
        Scanner teclado= new Scanner (System.in);
        System.out.println("introduce un numero");
        numero = teclado.nextInt();
        if(numero<0){
            System.out.println("el numero "+numero+"es negativo");
        }
        else{
            System.out.println("el numero "+numero+"es positivo");
        }
        if(numero%2==0){
             System.out.println("el numero "+numero+"es par");
        }
        else{
             System.out.println("el numero "+numero+"es impar");
        }
            
    }
    
}
