
import java.util.Scanner;

public class SubcadenaMayuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String cadena, subcadena, subcadenaUpper;
        int posicion;

        //Ingresar datos
        System.out.println("Ingrese una cadena de palabras");
        cadena = scan.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("Ingrese la palabra que desea buscar :");
        subcadena = scan.nextLine();

        //Mostrar en mayusculas (UPPER)
        subcadenaUpper = subcadena.toUpperCase();
        cadena = cadena.replace(subcadena, subcadenaUpper);
        System.out.println(cadena);
    }
}
