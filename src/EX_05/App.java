package EX_05;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Escriba su contraseña");
        String contra = scn.nextLine();
        int i;
        int mayus = 0;
        int minus = 0;
        int numeros = 0;
        int characters = 0;
        if (contra.length() >= 8) {
            for (i = 0; i < contra.length(); i++) {
                if (Character.isUpperCase(contra.charAt(i))) {
                    mayus++;


                } else if (Character.isLowerCase(contra.charAt(i))) {
                    minus++;

                } else if (Character.isDigit(contra.charAt(i))) {
                    numeros++;

                } else {
                    characters++;

                }
            }
        } else {
            System.out.println("Tamaño incorrecto");
        }
        System.out.println("mayus = "+mayus);
        System.out.println("minus = "+minus);
        System.out.println("números = "+numeros);
        System.out.println("simbolos = "+characters);
        if (mayus >= 1 && minus >= 1 && numeros >= 1 && characters >= 1 && contra.length() >= 8) {
            System.out.println("Contraseña fuerte");


        }

    }
}
