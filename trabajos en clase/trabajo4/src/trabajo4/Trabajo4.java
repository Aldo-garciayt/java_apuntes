/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo4;

import java.util.Scanner;


public class Trabajo4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String primeralumno;
        double c1;
        double c2;
        double c3;
        double c4;
        double c5;
        double pfinal1;
        
        String segundoalumno;
        double d1;
        double d2;
        double d3;
        double d4;
        double d5;
        double pfinal2;
        
        String terceralumno;
        double e1;
        double e2;
        double e3;
        double e4;
        double e5;
        double pfinal3;
        
        double promedio_final;
        
        System.out.println("Nombre del primer alumno");
        primeralumno = entrada.nextLine();
        
        System.out.println("Ingresa calificacion 1");
        c1 = entrada.nextDouble();
        System.out.println("Ingresa calificacion 2");
        c2 = entrada.nextDouble();
        System.out.println("Ingresa calificacion 3");
        c3 = entrada.nextDouble();
        System.out.println("Ingresa calificacion 4");
        c4 = entrada.nextDouble();
        System.out.println("Ingresa calificacion 5");
        c5 = entrada.nextDouble();
        pfinal1 = (c1+c2+c3+c4+c5)/5;
        
        System.out.println("Nombre del segundo alumno");
        segundoalumno = entrada.nextLine();
        System.out.println("Ingresa calificacion 1");
        d1 = entrada.nextDouble();
        System.out.println("Ingresa calificacion 2");
        d2 = entrada.nextDouble();
        System.out.println("Ingresa calificacion 3");
        d3 = entrada.nextDouble();
        System.out.println("Ingresa calificacion 4");
        d4 = entrada.nextDouble();
        System.out.println("Ingresa calificacion 5");
        d5 = entrada.nextDouble();
        pfinal2 = (d1+d2+d3+d4+d5)/5;
        
        System.out.println("Nombre del tercer alumno");
        terceralumno = entrada.nextLine();
        System.out.println("Ingresa calificacion 1");
        e1 = entrada.nextDouble();
        System.out.println("Ingresa calificacion 2");
        e2 = entrada.nextDouble();
        System.out.println("Ingresa calificacion 3");
        e3 = entrada.nextDouble();
        System.out.println("Ingresa calificacion 4");
        e4 = entrada.nextDouble();
        System.out.println("Ingresa calificacion 5");
        e5 = entrada.nextDouble();
        pfinal3 = (e1+e2+e3+e4+e5)/5;
        
        promedio_final = (pfinal1 + pfinal2 + pfinal3)/3;
        
        System.out.println("El promedio de lo tres alumnos es" + primeralumno + segundoalumno + terceralumno "es de" + promedio_final);
        
        
        
        
        
        
        
        
        
  
    }
    
}
