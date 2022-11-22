/*
 Crear los métodos de A – B - M (Alta – Baja – modificación ) que manipulen los
objetos de este tipo.
 Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros ,
para no hacer carga manual de los datos)
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su
apellido de forma ascendente.
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su
nombre de forma descendente.
 Con un alumno especifico (suponiendo que no existen dos alumnos con el mismo
nombre y apellido), mostrar por pantalla su edad. Considerar, el manejo de fechas,
utilizando el atributo fecha de nacimiento.
 Crear listas paralelas de Alumnos, según la nacionalidad.
 Realizar un reporte final de datos que informe:
    o Cuantos alumnos son mayores de 25 años.
    o Cuantos alumnos tiene su apellido que comienzan con letra L o P
    o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA –
        VENEZOLANA.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    private Scanner leer;
    private ArrayList<Alumno> lista_alumnos;
    private ArrayList<String> lista_ARG, lista_Chi, lista_Ven;

    public ServicioAlumno() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.lista_alumnos = new ArrayList();
        this.lista_ARG = new ArrayList();
        this.lista_Chi = new ArrayList();
        this.lista_Ven = new ArrayList();
    }

    public Alumno altaAlumnos() {
        System.out.print("Ingrese el Nombre: ");
        String nombre = leer.next();

        System.out.println("Ingrese el Apellido");
        String apellido = leer.next();

        System.out.println("Seleccione su Nacionalidad [Argentina | Chilena | Venezolana]");
        String nacionalidad = leer.next();
        if (nacionalidad.equals("")) {
            System.out.println("La lista esta vacia");
        } else if (nacionalidad.equalsIgnoreCase("Argentina")) {
            lista_ARG.add(nacionalidad);
        } else if (nacionalidad.equalsIgnoreCase("Chilena")) {
            lista_Chi.add(nacionalidad);
        } else if (nacionalidad.equalsIgnoreCase("Venezolana")) {
            lista_Ven.add(nacionalidad);
        }
    }

}
