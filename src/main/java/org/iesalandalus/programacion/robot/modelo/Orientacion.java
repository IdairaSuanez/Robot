package org.iesalandalus.programacion.robot.modelo;

public enum Orientacion {
    NORTE("Norte"),
    NORESTE("Noroeste"),
    ESTE("Este"),
    SURESTE("Sureste"),
    SUR("Sur"),
    SUROESTE("Suroeste"),
    OESTE("Oeste"),
    NOROESTE("Noroeste");


    private String nombre;

    private Orientacion(String cadenaMostrar) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Orientacion{" +
                "cadenaMostrar='" + nombre + '\'' +
                '}';
    }
}
