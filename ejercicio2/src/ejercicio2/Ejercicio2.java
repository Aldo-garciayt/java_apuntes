/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
//programa que lea 10 numeros desde el teclado en un proceso repetitivo y muestre la suma a realizar el programa con do y while

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //lo primero que tenemos que conocer es que la clase scanner nos permita leer contenido
        //insertado de forma sencilla por consola  lo que tenemos que hacer es crear un scanner sobre el elemento de consola que es el System.in
        
        Scanner reader = new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        int A = 0;
        
        do{
            System.out.println("introduce el numero A: ");
            //a partir de ese momento cada vez que queramos que el usuario nos de una entrada por teclado, es nuestro caso un numero deberemos llamarlo al metodo nextInt()
            A = reader.nextInt();
            contador = contador +1;
            suma = suma +A;
        }while(contador<10);
        System.out.println("la suma es:"+ suma);
    }
    
}
