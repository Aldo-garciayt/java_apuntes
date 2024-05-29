/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.pkg5;

import java.util.Scanner;


public class Main5 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num;
        int supar =0;
        int suimpar =0;
        System.out.println("introduce numero");
        num = teclado.nextInt();
        for (int ind=1;ind<=num;ind++){//ind =indicador
            if(ind%2==0){
                supar+=ind;
            }
            else {
                suimpar+=ind;
            }
        }
        System.out.println("la sua de los pares es"+ supar);
        System.out.println("la suma de los impares es"+ suimpar);
    }
    
}
