/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeronegativos;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class NumeroNegativos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner (System.in);
       double nN;
       do{
           System.out.print("introduce un numero negativo");
           while(!sc.hasNextDouble()){
               System.out.println("valor no valido");
               sc.next();
               
             System.out.print("introduce un numero negativo");
           }
          nN= sc.nextInt();
          if(nN>=0){
              System.out.println("el numero debe ser negativo ");
          }
       }while(nN >=0);
       System.out.println("numero entero :" +nN);
    }
    
}
