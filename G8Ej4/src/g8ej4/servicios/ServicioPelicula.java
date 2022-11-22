package g8ej4.servicios;

import g8ej4.entidades.Pelicula;
import g8ej4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioPelicula {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> lista_peliculas = new ArrayList();

    /**
     * Creamos una Pelicula con los atributos ingresandolos por teclado
     *
     * @return Pelicula
     */
    public Pelicula crearPelicula() {
        System.out.println("INGRESE LOS DATOS DE LA PELICULA");
        System.out.println("\nIngrese el Titulo");
        String titulo = leer.next();

        System.out.println("\nIngrese el Director de la Pelicula");
        String director = leer.next();

        System.out.println("Ingrese la Duracion de la Pelicula (En minutos)");
        Integer duracion = Integer.parseInt(leer.next());

        Pelicula p = new Pelicula(titulo, director, duracion);

        agregarPelicula(p);

        return p;
    }

    /**
     * Agregamos una pelicula a la Lista de Peliculas
     *
     * @param p
     */
    public void agregarPelicula(Pelicula p) {
        lista_peliculas.add(p);
    }

    /**
     * Creamos todas las peliculas
     */
    public void cantidadPelis() {
        String opcion;
        do {
            crearPelicula();
            System.out.println("Desea agregar otra pelicula? [S/N]");
            opcion = leer.next();
            opcion = opcion.toUpperCase();
        } while (!"N".equals(opcion));
    }

    /**
     * Mostrar en pantalla todas las películas.
     */
    public void mostarTodasLasPeliculas() {
        System.out.println("[   TODAS LAS PELICULAS    ]");
        for (int i = 0; i < lista_peliculas.size(); i++) {
            System.out.println((i + 1) + "- " + lista_peliculas.get(i));
        }
        System.out.println("");
    }

    /**
     * Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
     */
    public void mostarPelisMayorA1Hora() {
        System.out.println("[   TODAS LAS PELICULAS QUE DURAN MAS DE 1 HORA    ]");
        for (int i = 0; i < lista_peliculas.size(); i++) {
            Pelicula p = lista_peliculas.get(i);
            if (p.getDuracion() > 60) {
                System.out.println((i + 1) + "- " + lista_peliculas.get(i));
            }
            System.out.println("");
        }
    }

    /**
     * Ordenar las películas de acuerdo a su duración (de mayor a menor) y
     * mostrarlo en pantalla.
     */
    public void ordenarDeMayorAMenorDuracion() {
        System.out.println("    [PELICULAS DE MAYOR A MENOR DURACION]   ");
        Collections.sort(lista_peliculas, Comparadores.ordenarPorDuracionDeMayorAMenor);

        for (int i = 0; i < lista_peliculas.size(); i++) {
            System.out.println((i + 1) + "- " + lista_peliculas.get(i));
        }
        System.out.println("");
    }

    /**
     * Ordenar las películas de acuerdo a su duración (de menor a mayor) y
     * mostrarlo en pantalla.
     */
    public void ordenarDeMenorAMayorDuracion() {
        System.out.println("    [PELICULAS DE MENOR A MAYOR DURACION]   ");
        Collections.sort(lista_peliculas, Comparadores.ordenarPorDuracionDeMenorAMayor);

        for (int i = 0; i < lista_peliculas.size(); i++) {
            System.out.println((i + 1) + "- " + lista_peliculas.get(i));
        }
        System.out.println("");
    }

    /**
     * Ordenar las películas por título, alfabéticamente y mostrarlo en
     * pantalla.
     */
    public void ordenarTituloAlfabeticamente() {
        System.out.println("    [TITULO ORDENADO ALFABETICAMENTE]   ");
        Collections.sort(lista_peliculas, Comparadores.ordenarTituloAlfabeticamente);

        for (int i = 0; i < lista_peliculas.size(); i++) {
            System.out.println((i + 1) + "- " + lista_peliculas.get(i));
        }
        System.out.println("");
    }

    /**
     * Ordenar las películas por director, alfabéticamente y mostrarlo en
     * pantalla.
     */
    public void ordenarDirectorAlfabeticamente() {
        System.out.println("    [DIRECTOR ORDENADO ALFABETICAMENTE]   ");
        Collections.sort(lista_peliculas, Comparadores.ordenarDirectorAlfabeticamente);

        for (int i = 0; i < lista_peliculas.size(); i++) {
            System.out.println((i + 1) + "- " + lista_peliculas.get(i));
        }
        System.out.println("");
    }
}
