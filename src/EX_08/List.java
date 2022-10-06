package EX_08;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("que");
        lista.add("hace");
        String[] miarray = new String[lista.size()];
        miarray = lista.toArray(miarray);
        for(String s : miarray)
            System.out.println(s);
    }
}
