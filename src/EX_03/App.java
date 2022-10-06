//Dada una frase y un carácter introducido por el usuario, indica en qué posiciones se
//encuentra ese carácter sin utilizar indexOf.
package EX_03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        char a;
        Scanner scn = new Scanner(System.in);
        System.out.println("Escriba una frase");
        String frase = scn.nextLine();
        System.out.println("Escriba un caracter");
        a= scn.next().charAt(0);
        int i=0;
        String pos ="";

        for (i=0; i<frase.length(); i++) {
           if (frase.charAt(i) == a) {
               pos +=i+",";
           }


        }System.out.println(pos);


        }


    }


