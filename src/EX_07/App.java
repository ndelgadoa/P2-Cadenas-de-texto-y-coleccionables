package EX_07;
import java.util.ArrayList;
import java.util.Iterator;


public class App {
    public static void main(String[] args) {
        ArrayList<String> list
                = new ArrayList<>();
        list.add("Soy");
        list.add("Juan");
        list.add("Magan");
        list.add("y");
        list.add("tu");
        list.add("no");
        list.add("lo");
        list.add("eres");
        System.out.println("The list is: \n"
                + list);
        Iterator<String> iter
                = list.iterator();
        System.out.println("\nThe iterator values"
                + " of list are: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
