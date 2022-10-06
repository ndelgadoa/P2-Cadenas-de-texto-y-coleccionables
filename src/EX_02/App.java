//Dadas dos cadenas introducidas por el usuario, hay que juntarlas carácter a carácter.
//En caso de un espacio, ignorar ese carácter. Por ejemplo, si la entrada es “Fran” y
//“Manu”, la salida será: “FMraanu”.
package EX_02;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("primera palabra");
        String cadena1 = scn.next();
        System.out.println("segunda palabra");
        String cadena2 = scn.next();
        int longitudgrande ;
        int longitud1 =cadena1.length();
        int longitud2 =cadena2.length();
        if (longitud1>longitud2) {
            longitudgrande = longitud1;
        }else {
            longitudgrande = longitud2;
        }
        int i;
        for (i=0; i<(longitudgrande); i++) {
            if (i >=cadena1.length()) {

            }else {
                System.out.print(cadena1.charAt(i));
            }
            if (i >=cadena2.length()) {

            }else {
                System.out.print(cadena2.charAt(i));
            }

        }

    }
}
