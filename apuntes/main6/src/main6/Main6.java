/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main6;

import java.util.Scanner;


public class Main6 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int horas;
        int sueldo;
        
        System.out.println("Cuantas horas laboraste");
        horas = entrada.nextInt();
        
        sueldo = horas*120;
        
        System.out.println("Tu sueldo es:" + sueldo);
        
    }
    
}
