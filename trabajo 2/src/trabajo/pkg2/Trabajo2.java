/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Escribe un programa java que lea el nombre completo, la eda y 
lo triplique, cuadruplique y quintuplique la edad de una persona*/
package trabajo.pkg2;
import java.util.Scanner;


/**
 *
 * @author sebas
 */
public class Trabajo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        String cadena;
        System.out.println("introduce tu nombbre completo");
        cadena = sc.nextLine();
        int numero;
        System.out.println("introduce tu edad");
        numero= sc.nextInt();
        System.out.println("Tu nombre completo es: "+ cadena);
        System.out.println("Tu edad es: "+ numero);
        System.out.println("Triple de"+ numero +"->"+ 3*numero);
        System.out.println("Cuadruple de"+ numero +"->"+ 4*numero);
        System.out.println("Quintuple de"+ numero +"->"+ 5*numero);
        
        
    }
    
}
