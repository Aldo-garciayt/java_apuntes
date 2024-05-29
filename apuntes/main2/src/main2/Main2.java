/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main2;

import java.util.Scanner;
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numero;
        System.out.println( "Introducir un numero entero ");
        numero =sc.nextInt();
        System.out.println("numero introducido:"+ numero);
        System.out.println("doble de "+ numero + "->"+ 2*numero);
        System.out.println("triple de "+ numero + "->"+ 3*numero);
        // TODO code application logic here
    }
    
}
