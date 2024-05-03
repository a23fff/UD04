package com.fabianff;

public class Estudiante {

    /**
     * Autor de la clase
     * @author a23fabianff
     */

    private String nombre;
    private int edad;
    private double calificacion;
    
    /**
     * Constructor de la clase Estudiante.
     * @param nombre Nombre del estudiante.
     * @param edad Edad del estudiante.
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0; // Inicialmente la calificación es 0.
    }

    // Métodos

    /**
     * Establece la calificación del estudiante.
     * @param calificacion La calificación a establecer.
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Obtiene el nombre del estudiante.
     * @return El nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     * @param nombre El nuevo nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del estudiante.
     * @return La edad del estudiante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del estudiante.
     * @param edad La nueva edad del estudiante.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene la calificación del estudiante.
     * @return La calificación del estudiante.
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Verifica si el estudiante ha aprobado o no.
     * @return true si la calificación es mayor o igual a 5.0, false en caso contrario.
     */
    public boolean aprobo() {
        return calificacion >= 5.0;
    }

    /**
     * Calcula la edad escolar del estudiante en años.
     * @return La edad escolar del estudiante en años.
     */
    public int edadEscolar() {
        return edad / 12; // Se asume que un año escolar tiene 12 meses.
    }

    /**
     * Verifica si el estudiante es mayor de edad para la universidad.
     * @return true si la edad del estudiante es mayor o igual a 18, false en caso contrario.
     */
    public boolean esUniversitario() {
        return edad >= 18;
    }

    /**
     * Imprime la información del estudiante en la consola.
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}

