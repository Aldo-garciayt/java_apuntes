/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.pkg10;

import java.util.Scanner;

public class Main10 {

    
    public static void main(String[] args) {
       Scanner sc =new Scanner (System.in);
       int N;
       do{
           System.out.print("introduce un numero entero o positivo");
           while(!sc.hasNextInt()){
               System.out.println("valor no valido");
               sc.next();
               
             System.out.print("introduce un numero entero positivo");
           }
          N= sc.nextInt();
          if(N<=0){
              System.out.println("el numero debe ser positivo ");
          }
       }while(N <=0);
       System.out.println("numero entero :" +N);
    }
    
}
