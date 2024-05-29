/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.pkg11;

import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int edad;
        String nombre, direccion;
        System.out.print("introduce tu nombre ");
        nombre= sc.nextLine();
        System.out.print("introduce la edad");
        edad= sc.nextInt();
        sc.nextLine();//buffer de entrada
        
        System.out.print("introduce tu direccion");
        direccion= sc.nextLine();
        System.out.println("datos introducidos");
        System.out.println("nombre:"+ nombre);
        System.out.println("edad:"+ edad);
        System.out.println("direccion:"+ direccion);
        
    }
    
}
