/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package g8ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class G8Ej1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razaPerros = new ArrayList();

        String var = "";

        do {
            System.out.println("Ingrese una Raza de Perro");
            razaPerros.add(leer.next());
            System.out.println("Desea ingresar otra Raza (S/N)");
            var = leer.next();
        } while (var.equalsIgnoreCase("S"));

        for (String aux : razaPerros) {
            System.out.println(aux);
        }

    }

}
