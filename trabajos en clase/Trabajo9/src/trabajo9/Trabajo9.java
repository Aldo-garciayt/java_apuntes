/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo9;

import java.util.Scanner;

public class Trabajo9 {

   
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int N;
        do{
            System.out.print("Introduce un numero negativo");
            while (!sc.hasNextInt()){
                System.out.println("Valor no valido");
                sc.next();
                
                
               System.out.print("Introduce un numero negativo");
               }
              N= sc.nextInt();
              if(N>=0){
                  System.out.println("El numero debe ser negativo");
              }
           }while(N >= 0);
           System.out.println("numero entero :" + N);
    }
    
}
