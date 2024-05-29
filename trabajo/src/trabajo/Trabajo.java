/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Trabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        
        String nombre;
        int hijos;
        int horas;
        int sueldo;
        System.out.println("cual es tu nombre: ");
        System.out.println("Cuantas horas laboraste");
        System.out.println("cuantos hijos tienes: ");
        horas = entrada.nextInt();
        hijos = entrada.nextInt();
        nombre = entrada.nextLine();
        
        sueldo = horas*75;
        
        System.out.println(nombre + "el nombre del empleado es: "+ nombre);
        System.out.println("el numero de hijos es de "+ hijos);
        System.out.println("el sueldo del empleado es: "+ sueldo);
    }
    
}
