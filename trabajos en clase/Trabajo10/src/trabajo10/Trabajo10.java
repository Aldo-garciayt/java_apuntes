/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo10;

import java.util.Scanner;


public class Trabajo10 {

   
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        int edad;
        int numero;
        String nombre, direccion;
        String genero;
        
        System.out.print("Introduce tu nombre");
        nombre = sc.nextLine();
        System.out.print("Introduce tu edad");
        edad = sc.nextInt();
        sc.nextLine();  
        System.out.print("Introduce el genero");
        genero = sc.nextLine();//buffer de entrada
        System.out.print("Introduce tu direccion");
        direccion = sc.nextLine();
        System.out.print("Introduce tu numero de telefono");
        numero = sc.nextInt();
      


        
        System.out.println("Datos introducidos");
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Genero:" + genero);
        System.out.println("Direccion:" + direccion);
        System.out.println("Numero:" + numero);
    }
    
}
