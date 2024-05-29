/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo7;

import java.util.Scanner;


public class Trabajo7 {

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float velocidad;
        System.out.println("Ingrese velocidad en km/h:");
        velocidad = sc.nextInt();
        
        System.out.println("La velocidad en m/s es:" +velocidad * 1000/3600 + "m/s");
       
    }
    
}
