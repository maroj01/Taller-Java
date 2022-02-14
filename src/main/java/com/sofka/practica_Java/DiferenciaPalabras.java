/**
 * Ejercicio 12
 */

package com.sofka.practica_Java;

import java.util.Scanner;

public class DiferenciaPalabras {
    public static void main(String[] args) {
        DiferenciarPalabras();

    }

    public static void DiferenciarPalabras() {

        Scanner lectura = new Scanner(System.in);
        String primeraPalabra;
        String segundaPalabra;
        int entero = 0;

        System.out.println("Ingresar primera palabra: ");
        primeraPalabra = lectura.next().toLowerCase();

        System.out.println("Ingresar segunda palabra: ");
        segundaPalabra = lectura.next().toLowerCase();

        if (primeraPalabra.length() == segundaPalabra.length()) {
            for (int i = 0; i < primeraPalabra.length(); i++) {
                if (primeraPalabra.charAt(i) == segundaPalabra.charAt(i)) {
                    entero++;
                }
            }
            if (entero == primeraPalabra.length()) {
                System.out.println("Las palabras son iguales");
            } else {
                System.out.println("La longitud de las palabras es la misma pero las letras son diferentes");
            }

        } else {
            System.out.println("Las palabras no tienen la misma longitud");
        }

    }
}
