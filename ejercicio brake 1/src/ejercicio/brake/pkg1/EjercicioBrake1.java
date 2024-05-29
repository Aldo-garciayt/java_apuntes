/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//generar 100 valores aleatorios comprendidos entre 1 y 10 contar cuantos se generan con valores 1,5,10 y los que no son ni 1,5,10
package ejercicio.brake.pkg1;
public class EjercicioBrake1 {
    public static void main(String[] args) {
        int cant1= 0;
        int cant5= 0;
        int cant10= 0;
        int otros= 0;
        
        for(int f=0; f<100; f++){
            int valor = (int)(Math.random()*10)+1;
            switch(valor){
                case 1:
                    cant1++;
                    break;
                case 5:
                    cant5++;
                    break;
                    
                case 10:
                    cant10++;
                    break;
                default:
                    otros++;
            }
        }
        System.out.println("cantdad de veces que salieron 1: "+ cant1);
        System.out.println("cantdad de veces que salieron 5: "+ cant5);
        System.out.println("cantdad de veces que salieron 10: "+ cant10);
        System.out.println("cantdad de veces que no salieron 1,5,10: "+ otros);
    }
    
    
}
