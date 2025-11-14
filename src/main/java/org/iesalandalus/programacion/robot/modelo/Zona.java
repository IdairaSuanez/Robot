package org.iesalandalus.programacion.robot.modelo;

public record Zona(int ancho, int alto) {
    public static final int ANCHO_MINIMO = 0;
    public static final int ANCHO_MAXIMO = 100;
    public static final int ALTO_MINIMO = 0;
    public static final int ALTO_MAXIMO = 100;

    public Zona () {
        this(alto, ancho);
    }
    public Zona {
        validarAlto(alto);
        validarAncho(ancho);
    }

    @Override
    public int Ancho() {
        return ancho;
    }
    public void validarAncho(int ancho) {
        if (ancho < ANCHO_MINIMO) {
            throw new IllegalArgumentException("El valor del ancho no es válido, está por debajo del mínimo. ");
        } else if (ancho > ANCHO_MAXIMO) {
            throw new IllegalArgumentException("El valor no es válido, está por encima del máximo");
        }
    }
    public void validarAlto(int alto) {
        if (alto < ALTO_MINIMO) {
            throw new IllegalArgumentException("El valor de alto no es válido, está por debajo del mínimo. ");
        } else if (alto > ALTO_MAXIMO) {
            throw new IllegalArgumentException("El valor no es válido, está por encima del máximo");
        }
    }
}
