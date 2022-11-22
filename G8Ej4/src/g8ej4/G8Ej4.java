package g8ej4;

import g8ej4.servicios.ServicioPelicula;

public class G8Ej4 {

    public static void main(String[] args) {

        ServicioPelicula servicio = new ServicioPelicula();

        servicio.cantidadPelis();

        servicio.mostarTodasLasPeliculas();

        servicio.mostarPelisMayorA1Hora();

        servicio.ordenarDeMenorAMayorDuracion();

        servicio.ordenarDeMayorAMenorDuracion();

        servicio.ordenarTituloAlfabeticamente();

        servicio.ordenarDirectorAlfabeticamente();

    }

}
