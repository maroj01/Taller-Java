
/**
 * Ejercicio 15
 */

package com.sofka.practica_Java;

import java.util.Scanner;

public class MenuCinematografica {
    public static void main(String[] args) {
        MenuCinematografica menuCinematografica = new MenuCinematografica();
        menuCinematografica.validarOpciones();
    }

    Scanner lectura = new Scanner(System.in);
    int opcion;
    String resultado = "";
    Boolean repeticion = true;
    final String OPCIONES = "****** GESTION CINEMATOGRAFICA ********" + "\n" +
            "1-NUEVO ACTOR" + "\n" +
            "2-BUSCAR ACTOR" + "\n" +
            "3-ELIMINAR ACTOR" + "\n" +
            "4-MODIFICAR ACTOR" + "\n" +
            "5-VER TODOS LOS ACTORES" + "\n" +
            "6- VER PELICULAS DE LOS ACTORES" + "\n" +
            "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" + "\n" +
            "8-SALIR" + "\n" +
            "Por favor digita el número de alguna de las opciones anteriores";

    public void validarOpciones() {
        System.out.println(OPCIONES);
        opcion = lectura.nextInt();

        if (opcion >= 1 && opcion < 8) {
            resultado = "valido";

        } else if (opcion == 8) {
            resultado = "salir";
        } else{
            resultado = "invalido";
        }
        procesarMenu(resultado);

    }

    public void procesarMenu(String resultado) {

        while (repeticion) {

            switch (resultado) {
                case "valido":
                    validarOpciones();
                    break;
                case "invalido":
                    System.out.println("Opción incorrecta");
                    validarOpciones();
                    break;
                case "salir":
                    System.exit(0);
                    repeticion = false;
                    break;
            }
        }
    }
}

