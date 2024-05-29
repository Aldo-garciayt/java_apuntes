/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//simular el tirador de un dado  
package ejercicio.brake.pkg2;

public class EjercicioBrake2 {

    public static void main(String[] args) {
        int pares= 0;
        int impares= 0;
        
        for(int f=0; f<1000; f++){
            int dado = (int) (Math.random()*6)+1;
            switch(dado){
                case 1:
                case 3:
                case 5:
                    impares++;
                    break;
                case 2:
                case 4:
                case 6:
                    pares++;
            }
        }
    }
    
}
