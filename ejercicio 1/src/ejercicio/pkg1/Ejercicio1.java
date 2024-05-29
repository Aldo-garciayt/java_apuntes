/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

public class Ejercicio1 {

    public static void main(String[] args) {
        int cant2= 0;
        int cant8= 0;
        int cant9= 0;
        int cant10= 0;
        int otros= 0;
        
        for(int f=0; f<5000; f++){
            int valor = (int)(Math.random()*10)+1;
            switch(valor){
                case 2:
                    cant2++;
                    break;
                case 8:
                    cant8++;
                    break;
                case 9:
                    cant9++;
                    break;
                case 10:
                    cant10++;
                    break;
                default:
                    otros++;
            }
        }
        System.out.println("cantdad de veces que salieron 2: "+ cant2);
        System.out.println("cantdad de veces que salieron 8: "+ cant8);
        System.out.println("cantdad de veces que salieron 9: "+ cant9);
        System.out.println("cantdad de veces que salieron 10: "+ cant10);
        System.out.println("cantdad de veces que no salieron 2,8,9,10: "+ otros);
    }
    
}
