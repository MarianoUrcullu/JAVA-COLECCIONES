/*
Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la nacionalidad y
su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA – CHILENA – VENEZOLANA
solamente.
 */
package Entidades;

import java.util.Calendar;
import java.util.Objects;

public class Alumno {

    private String nombre, apellido, nacionalidad;
    private Integer edad, dia, mes, anio;
    private Calendar nacimiento = Calendar.getInstance();

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String nacionalidad, Integer edad, Integer dia, Integer mes, Integer anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Calendar getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Calendar nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.apellido);
        hash = 37 * hash + Objects.hashCode(this.nacionalidad);
        hash = 37 * hash + Objects.hashCode(this.edad);
        hash = 37 * hash + Objects.hashCode(this.dia);
        hash = 37 * hash + Objects.hashCode(this.mes);
        hash = 37 * hash + Objects.hashCode(this.anio);
        hash = 37 * hash + Objects.hashCode(this.nacimiento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        if (!Objects.equals(this.dia, other.dia)) {
            return false;
        }
        if (!Objects.equals(this.mes, other.mes)) {
            return false;
        }
        if (!Objects.equals(this.anio, other.anio)) {
            return false;
        }
        if (!Objects.equals(this.nacimiento, other.nacimiento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno -->" + " Nombre: " + nombre + " Apellido: " + apellido
                + " Nacionalidad: " + nacionalidad + " Edad: " + edad
                + " Dia: " + dia + "Mes: " + mes + " Año: " + anio
                + " Nacimiento: " + nacimiento;
    }

}
