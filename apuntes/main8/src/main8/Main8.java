/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main8;

import java.util.Scanner;


public class Main8 {

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Introduce grados centigrados");
        gradosC =sc.nextDouble();
        gradosF =32 + (9* gradosC/5);
        System.out.println(gradosC + "C" + gradosF + "F");
        
        
    }
    
}
