//Lee una cadena de texto que contenga un nombre y los apellidos de alguien,
//devolviéndolos en formato “Apellidos, Iniciales”. Por ejemplo, si la entrada es
//“Francisco Mesas Cervilla”, la salida será: “Mesas Cervilla, F.”. Si la entrada es
//“Francisco José López Pérez”, la salida será: “López Pérez, F. J.”
package EX_01;

public class App {
    String nombre ="Nil Delgado Asensio";
    public static void main(String[] args) {
        App objeto = new App();
        objeto.apellido();

    }


    public void apellido() {
        char primercaracter = nombre.charAt(0);
        String[] apellido = nombre.split(" ");
        String apellido1 = apellido[1];
        String apellido2 = apellido[2];
        System.out.println(apellido1+" " + apellido2+" " + primercaracter);
    }





    }



