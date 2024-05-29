/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main5;

import java.util.Scanner;


public class Main5 {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        String nombre_alumno;
        double evaluacion1;
        double evaluacion2;
        double evaluacion3;
        double evaluacion_final;
        
        System.out.println("Nombre del alumno");
        nombre_alumno = entrada.nextLine();
        
        System.out.println("Primera nota");
        evaluacion1 = entrada.nextDouble();
        
        System.out.println("Segunda nota");
        evaluacion2 = entrada.nextDouble();
        
        System.out.println("Tercera nota");
        evaluacion3 = entrada.nextDouble();
        
        evaluacion_final =(evaluacion1 + evaluacion2 + evaluacion3)/3;
        
        System.out.println("La nota de " + nombre_alumno + "es de" + evaluacion_final);
        
        
    
       
    }
    
}
