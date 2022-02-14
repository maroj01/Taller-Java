package com.sofka.practica_Java.videojuegos;

public class Ejecutable {
    public static void main(String[] args) {

        Serie[] arregloSeries = new Serie[5];
        Videojuego[] arregloVideojuegos = new Videojuego[5];

        arregloSeries[0] = new Serie("La verdedora de rosas", 20, "Puñalada", "Victor Gaviria");
        arregloSeries[1] = new Serie("You", 3, "Drama tóxico", "Greg Berlanti");
        arregloSeries[2] = new Serie("La casa de papel", 96, "Casposo", "Alex Pina");
        arregloSeries[3] = new Serie("La chicas del cable", 6, "Mujeres al poder", "Ramon Campos");
        arregloSeries[4] = new Serie();

        arregloVideojuegos[0] = new Videojuego();
        arregloVideojuegos[1] = new Videojuego("Silent Hill 1", 300, "Terror", "Konami");
        arregloVideojuegos[2] = new Videojuego("Fatal Frame", 65);
        arregloVideojuegos[3] = new Videojuego("El dios de la guerra", 300, "Acción", "Santa Monica");
        arregloVideojuegos[4] = new Videojuego("FIFA", 196, "Deportes", "EA");

        arregloSeries[0].entregar();
        arregloSeries[4].entregar();
        arregloSeries[1].entregar();

        arregloVideojuegos[0].entregar();
        arregloVideojuegos[2].entregar();
        arregloVideojuegos[1].entregar();

        int entregados = 0;

        for (int i = 0; i < 5; i++) {
            if (arregloSeries[i].isEntregado()) {
                entregados += 1;
                arregloSeries[i].devolver();
            }
            if (arregloVideojuegos[i].isEntregado()) {
                entregados += 1;
                arregloVideojuegos[i].devolver();
            }
        }

        Serie serieTemporadaMayor = arregloSeries[0];
        Videojuego videojuegoHorasMayor = arregloVideojuegos[0];

        for (int i = 1; i < 5; i++) {
            if (arregloSeries[i].compareTo(serieTemporadaMayor).equals(Serie.MAYOR)) {
                serieTemporadaMayor = arregloSeries[i];
            }
            if (arregloVideojuegos[i].compareTo(videojuegoHorasMayor).equals(Videojuego.MAYOR)) {
                videojuegoHorasMayor = arregloVideojuegos[i];
            }
        }
        System.out.println("La cantidad total de entregados es: " + entregados);
        System.out.println(videojuegoHorasMayor);
        System.out.println(serieTemporadaMayor);
    }
}