/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg1;

import java.util.Scanner;

public class Tarea1 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        int n4;
        System.out.println("ingresa dos numeros positivos");
        n1= teclado.nextInt();
        n2= teclado.nextInt();
        int sumapositiva =n1+n2;  
        System.out.println("la suma de los numeros positivos es igual a "+ sumapositiva);
        System.out.println("ingresa dos numeros negativos");
        n3= teclado.nextInt();
        n4= teclado.nextInt();
        int sumanegativa =n3+n4;
        System.out.println("la suma de los numeros negativos es igual a "+ sumanegativa);
        
        
    }
    
}
