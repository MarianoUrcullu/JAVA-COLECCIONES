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
package g8ej5.ServicioPais;

import g8ej5.entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ServicioPais {

    private Scanner leer;
    private TreeSet<Pais> lista_paises;

    public ServicioPais() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.lista_paises = new TreeSet();
    }

    /**
     * Creamos el pais y lo agregamos a la lista
     *
     * @return
     */
    public Pais crearPais() {
        System.out.println("    [CARGAR PAIS]   ");
        System.out.println("\nIngrese el Nombre del Pais");
        String pais = leer.next();

        Pais p = new Pais(pais);

        cargarPais(p);

        return p;

    }

    /**
     * Metodo para agregar a la lista
     *
     * @param p
     */
    public void cargarPais(Pais p) {
        lista_paises.add(p);
    }

    /**
     * Metodo para agregar todos los paises
     */
    public void añadirPais() {
        String op;
        do {
            crearPais();
            System.out.println("Desea agregar otro Pais? [S/N]");
            op = leer.next();
            op = op.toUpperCase();
        } while (!"N".equals(op));
    }

    /**
     * Metodo para mostrar los Paises
     */
    public void mostarPaises() {
        System.out.println("    [LISTA DE PAISES]   ");
        for (Pais aux : lista_paises) {
            System.out.println(aux.toString());
        }
    }

    /**
     * Metodo para buscar un Pais pasado por parametro y eliminarlo
     *
     * @param paisAEliminar
     */
    public void eliminarPais(String paisAEliminar) {
        Iterator<Pais> it = lista_paises.iterator();

        while (it.hasNext()) {
            if (it.next().getPais().equals(paisAEliminar)) {
                it.remove();
                System.out.println("Pais Eliminado");
            }

        }
    }

}
