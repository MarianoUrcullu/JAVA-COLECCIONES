/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package g8ej5;

import g8ej5.ServicioPais.ServicioPais;
import java.util.Scanner;

public class G8Ej5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioPais servicio = new ServicioPais();

        servicio.añadirPais();

        servicio.mostarPaises();

        System.out.println("Ingrese el Pais a Eliminar");
        String paisAEliminar = leer.next();
        servicio.eliminarPais(paisAEliminar);

        servicio.mostarPaises();

    }

}
