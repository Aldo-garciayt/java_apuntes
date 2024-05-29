
package main9;

public class Empleado1 {
        private static double pagoPorHoraExtra;
    private String nif;
    private String nombre;
    private double sueldoBase;
    private int horasExtra;
    private double tipoIRPF;
    private char casado;
    private int numeroHijos;
    
    public empleado(){
    }
    public empleado(string nif){
    this.nif=nif;
    }
    public char getCasado(){
        return casado;
    }
    public void setcasado(char casado){
        this.casado=casado;
    }
    public int getHorasExtras(){
        return horasExtra;
    }
    public void setHorasExtras(int horasExtra){
        this.horasExtra = horasExtra;
    }
    public String getNif(){
        return nif;
    } 
    public void setNif(String nif){
        this.nif= nif;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public int getNumeroHijos(){
        return numeroHijos;
    }
    public void setNumeroHijos(int numeroHijos){
    this.numeroHijos= numeroHijos;
    }
    public double getSueldoBase(){
    return sueldoBase;
    }
    public void setSueldoBase(double sueldoBase){
    this.sueldoBase= sueldoBase;
    }
    public double getTipoIRPF(){
    return tipoIRPF;
    }
    public void setTipoIRPF(double tipoIRPF){
    this.tipoIRPF= tipoIRPF;
    }
    public static double getPagoPorHorasExtra(){
        return pagoPorHoraExtra;
    }
    public static void setpagoPorHoraExtra(double pagoPorHorasExtra){
        Empleado.pagoPorHoraExtra = pagoPorHorasExtra;
    }
    public double calcularImporteHorasExtras(){
    return horasExtra * pagoPorHoraExtra;
    }
    public double calcularSueldoBruto(){
    return sueldoBase + calcularImporteHorasExtras();
   }
   public double calcularRetencionIrpf(){
   double tipo =tipoIRPF;
   if(casado == "s" ~casado == "s"){
       tipo =tipo -2;
   }
   tipo =tipo -numeroHijos;
   
   if(tipo<0){
  tipo =0;
  }
   return calcularSueldoBruto()*tipo/100;
   }
   
   public double calculaesueldo(){
   return calcularSueldoBruto() - calcularRetencionIrpf();
   }
   
    
    
    
    public String totring(){
   StringBuilder sb =new StringBulder ();
   sb.appened("nif
    }
    
}
