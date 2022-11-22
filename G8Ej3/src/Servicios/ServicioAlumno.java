/*
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alumno> lista_alumno = new ArrayList();

    public Alumno crearAlumno() {
        System.out.println("Ingrese los Datos del Alumno");
        System.out.println("Nombre:");
        String nombre = leer.next();

        System.out.println("\nIngrese las notas");
        System.out.println("Nota 1");
        Integer nota1 = Integer.parseInt(leer.next());
        System.out.println("Nota 2");
        Integer nota2 = Integer.parseInt(leer.next());
        System.out.println("Nota 3");
        Integer nota3 = Integer.parseInt(leer.next());

        ArrayList<Integer> notas = new ArrayList();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);

        Alumno alumno = new Alumno(nombre, notas);

        agregarAlumno(alumno);

        return alumno;

    }

    public void agregarAlumno(Alumno alumno) {
        lista_alumno.add(alumno);
    }

    public void notaFinal(Alumno alumno) {
        int nota, notaFinal, sumaNotas = 0;

        ArrayList<Integer> notas = alumno.getNotas();

        for (int i = 0; i < notas.size(); i++) {
            nota = notas.get(i);
            sumaNotas += nota;
        }

        notaFinal = sumaNotas / 3;

        System.out.println("La Nota Final de " + alumno.getNombre() + " es: " + notaFinal);

    }

    public void notaFinalPorNombreAlumno() {
        System.out.println("Ingrese el nombre del Alumno para ver su Nota Final:");
        String nombreIngresado = leer.next();

        for (int i = 0; i < lista_alumno.size(); i++) {
            Alumno alumno = lista_alumno.get(i);

            if (alumno.getNombre().equals(nombreIngresado)) {
                notaFinal(alumno);
            } else {
                System.out.println("Alumno No Encontrado");
            }
        }
    }

}
