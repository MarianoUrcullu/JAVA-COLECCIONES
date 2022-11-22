/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 */
package g8ej3;

import Servicios.ServicioAlumno;
import java.util.Scanner;

public class G8Ej3 {

    public static void main(String[] args) {

        ServicioAlumno s = new ServicioAlumno();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String opcion;

        do {
            s.crearAlumno();

            System.out.println("Desea ingresar otro Alumno? [S/N]");
            opcion = leer.next();
            opcion = opcion.toUpperCase();
            System.out.println("\n");
        } while (!"N".equals(opcion));

        s.notaFinalPorNombreAlumno();

    }

}
