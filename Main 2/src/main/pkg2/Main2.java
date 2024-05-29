/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Escribe un programa java que lea un numero por teclado y 
y obtiene y muetstra en pantalla el doble y triple del numero*/
package main.pkg2;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int numero;
        System.out.println("introduce un numero entero");
        numero =sc.nextInt();
        System.out.println("numero introducido:"+ numero);
        System.out.println("doble de " + numero + "->"+ 2*numero);
        System.out.println("triple de " + numero + "->"+ 3*numero);
    }
    
}
