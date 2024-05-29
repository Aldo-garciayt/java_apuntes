/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo2;

import java.util.Scanner;

public class Trabajo2 {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numero;
        String cadena;
        System.out.println("Introducir nombre:");
        cadena =sc.nextLine();
         System.out.println("Introducir apellido paterno:");
         cadena =sc.nextLine();
         System.out.println("Introducir apellido materno:");
         cadena =sc.nextLine();
        System.out.println("Introducir edad");
        numero =sc.nextInt();
        System.out.println("edad introducida:" + numero);
        System.out.println("triple de " + numero +"->" + 3*numero);
        System.out.println("cuadruple de " + numero +"->" + 4*numero);
        System.out.println("quintuple de " + numero +"->" + 5*numero);
    }
    
}
