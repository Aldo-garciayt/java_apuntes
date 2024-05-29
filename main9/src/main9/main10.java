/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main9;

import java.io.IOException;
import java.util.Scanner;

public class main10 {
    final static int MAXIMOEMPLEADOS= 20;
    
}

public static void main(string[] args).throws IOException {
double importe;
empleado e;
leer Empleados();
if (numeroDeEmpleados()> 0 ){

System.out.println("emleados introducido: ");
mostrar();
imorte = leerImorteHorasExtras();

Empleado.setPagoPorHorasExtra(importe);

e= empleadoQueMasCobra();
System.out.println("emplleado que mas cobra");
System.out.println(e);
System.out.printf("sueldo :%2 & %n", e.calcularsueldo());

e= empleadosQueMenosCobra();
System.out.println("empleado que menos cobra");
System.out.println(e);
System.out.printf("sueldo: %2 &%n", e.calcularSueldo());

e = empleadoQueMasCobraPorHorasExtras();
System.out.println("empleado que mas cobra por horas extras");
System.out.println(e);
System.out.printf("total horas extras: %2 ", e.calcularImporteHorasExtras());

e= empleadoQueMenosCobraPorHorasExtras();
System.out.println("empleado que menos cobra por horas extras");
System.out.println(e);
System.out.rintf("total horas extras: %2", e.calcularImporteHorasExtras());

ordenarPorSalario();
System.out.println("empleados ordenados por salario");
mostrarEmpleadosYSalario();

     }
}
public static void leer Empleados()throws IOException{
Empleado e;
String dni , nombre;
double sueldoBase;
int horasExtras;
}
}