/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Escribe un programa java que lea el nombre la edad y el doble de la edad*/
package trabajo.pkg1;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Trabajo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        String cadena;
        System.out.println("Introduce tu nombre");
        cadena= sc.nextLine();
        int numero;
        System.out.println("Introduce tu edad");
        numero= sc.nextInt();
        System.out.println("tu nombre es: "+cadena);
        System.out.println("tu edad es: "+ numero);
        System.out.println("doble de numero "+ numero + "->"+ 2*numero);
        
    }
    
}
