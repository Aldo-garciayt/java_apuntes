import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        
        do{
            System.out.println("introduce el numero 1: ");
            numero1 = reader.nextInt();
            System.out.println("introduce el numero 2: ");
            numero2 = reader.nextInt();
        }while(numero1!=numero2);
        System.out.println("haz terminado los numeros son iguale ");
    }
    