package com.sofka.practica_Java.videojuegos;

public class Serie implements Entregable {

    private String tituloSerie;
    private int numeroTemporadas;
    private boolean entregado;
    private String generoSerie;
    private String creadorSerie;
    public static final String MAYOR = "Mayor";
    public static final String NO_MAYOR = "No mayor";

    public String getTituloSerie() {
        return tituloSerie;
    }

    public void setTituloSerie(String tituloSerie) {
        this.tituloSerie = tituloSerie;
    }

    public int getnumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setnumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGeneroSerie() {
        return generoSerie;
    }

    public void setGeneroSerie(String generoSerie) {
        this.generoSerie = generoSerie;
    }

    public String getcreador() {
        return creadorSerie;
    }

    public void setcreador(String creador) {
        this.creadorSerie = creador;
    }

    public Serie() {
        this.tituloSerie = "";
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.generoSerie = "";
        this.creadorSerie = "";
    }

    public Serie(String titulo, String creador) {
        this.tituloSerie = titulo;
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.generoSerie = "";
        this.creadorSerie = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.tituloSerie = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.generoSerie = genero;
        this.creadorSerie = creador;
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
        Serie serieComparada = (Serie) a;
        if (numeroTemporadas > serieComparada.getnumeroTemporadas()) {
            return MAYOR;
        } else {
            return NO_MAYOR;
        }
    }

    @Override
    public String toString() {
        return "La informacion de la Serie: \n" +
                "Titulo: " + tituloSerie + "\n" +
                "Numero de temporadas: " + numeroTemporadas + "\n" +
                "Genero: " + generoSerie + "\n" +
                "Creador: " + creadorSerie;
    }
}