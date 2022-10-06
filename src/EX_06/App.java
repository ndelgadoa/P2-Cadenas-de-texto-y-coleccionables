package EX_06;

public class App {
    public static void main(String[] args) {
        String frase = "Cadenas de texto y coleccionables";

        int i;
        for (i=0; i<frase.length(); i++) {
            System.out.println("ASCII: "+frase.charAt(i)+" es equivalente a: "+frase.codePointAt(i));

        }

    }


    }
