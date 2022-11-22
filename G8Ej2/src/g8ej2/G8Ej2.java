/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package g8ej2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class G8Ej2 {

    public static void main(String[] args) {

        ArrayList<String> razaPerros = new ArrayList();

        Iterator<String> it;
        String var = "";
        Scanner leer = new Scanner(System.in);
        do {
            //System.out.println(razaPerros.size());
            System.out.println("Ingrese una raza de perro.");
            razaPerros.add(leer.next());
            System.out.println("Desea ingresar otro perro(S/N)");
            var = leer.next();
        } while (var.equalsIgnoreCase("S"));

        it = razaPerros.iterator();
        razaPerros.add("caniche");
        it = razaPerros.iterator();
        //razaPerros.removeIf(rodrigo -> (rodrigo.equals("caniche")));
        //razaPerros.remove("caniche");
        //razaPerros.remove(0);
        //razaPerros.removeAll(razaPerros);

        System.out.println("Que Raza desea eliminar?");
        String razaEliminada = leer.next();

        while (it.hasNext()) {
            System.out.println(it.next());
//            if (it.next().equals(razaEliminada)) {
//                it.remove();
//            }
        }
        //razaPerros.removeAll(razaPerros);
        for (String aux : razaPerros) {
            System.out.println(aux);
        }
    }

}
