package com.sofka.practica_Java.videojuegos;

public class Videojuego implements Entregable {

    public static final String MAYOR = "Mayor";
    public static final String NO_MAYOR = "No mayor";
    private String tituloVideoJuego;
    private int horasEstimadas;
    private boolean entregado;
    private String generoVideoJuego;
    private String compania;

    public String getTituloVideoJuego() {
        return tituloVideoJuego;
    }

    public void setTituloVideoJuego(String tituloVideoJuego) {
        this.tituloVideoJuego = tituloVideoJuego;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGeneroVideoJuego() {
        return generoVideoJuego;
    }

    public void setGeneroVideoJuego(String generoVideoJuego) {
        this.generoVideoJuego = generoVideoJuego;
    }

    public String getcompania() {
        return compania;
    }

    public void setcompania(String compania) {
        this.compania = compania;
    }

    public Videojuego() {
        this.tituloVideoJuego = "";
        this.horasEstimadas = 100;
        this.entregado = false;
        this.generoVideoJuego = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.tituloVideoJuego = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.generoVideoJuego = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.tituloVideoJuego = titulo;
        this.horasEstimadas = horasEstimadas;
        this.generoVideoJuego = genero;
        this.compania = compania;
        this.entregado = false;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        if (entregado) {
            return true;
        }
        return false;
    }

    @Override
    public String compareTo(Object a) {
        Videojuego videojuegoComparado = (Videojuego) a;
        if (horasEstimadas > videojuegoComparado.getHorasEstimadas()) {
            return MAYOR;
        } else {
            return NO_MAYOR;
        }
    }

    @Override
    public String toString() {
        return "La informacion del videojuego: \n" +
                "Titulo: " + tituloVideoJuego + "\n" +
                "Horas estimadas: " + horasEstimadas + "\n" +
                "Genero: " + generoVideoJuego + "\n" +
                "Compañia: " + compania;
    }
}