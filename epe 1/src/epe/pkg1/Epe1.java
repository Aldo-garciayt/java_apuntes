/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epe.pkg1;


public class Epe1 {

    public static void main(String[] args) {
        int a=6;
        int b=2;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        int modulo;
        
        suma= a+b;
        resta= a-b;
        multiplicacion= a*b;
        division= a/b;
        modulo= a-(b*division) ;
        
        System.out.println("la suma de a mas b es: "+ suma );
        System.out.println("la resta de a menos b es: "+ resta );
        System.out.println("la multiplicacion de a por b es: "+ multiplicacion );
        System.out.println("la division de a entre b es: "+ division );
        System.out.println("el modulo de la division de a entre b es: "+ modulo );
        
    }
    
}
