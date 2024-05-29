/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo8;

import java.util.Scanner;


public class Trabajo8 {

  
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        double cateto1;
        double cateto2;
        
        System.out.println("Ingrese valor del cateto 1:");
        cateto1 = entrada.nextDouble();
        System.out.println("Ingrese valor del cateto 2:");
        cateto2 = entrada.nextDouble();
        
        double r = Math.sqrt((cateto1*cateto1) + (cateto2*cateto2));
        
        System.out.println("El valor de la hipotenusa es igual a:" + r);
        
    }
    
}
