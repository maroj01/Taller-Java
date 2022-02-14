/**
 * Ejercicio 5 y 6
 */
package com.sofka.practica_Java;

public class ParesImpares {
    public static void main(String[] args) {
        //mostrarParesImparesMientras();
        mostrarParesImparesPara();

    }

    public static void mostrarParesImparesMientras() {

        int[] pares = new int[50];
        int[] impares = new int[50];
        int numero = 1;
        int posicionArregloPares = 0;
        int posicionArregloImpares = 0;

        while (numero >= 1 && numero <= 100) {

            if (numero % 2 == 0) {
                pares[posicionArregloPares] = numero;
                posicionArregloPares = posicionArregloPares + 1;

            } else if (numero % 2 != 0) {
                impares[posicionArregloImpares] = numero;
                posicionArregloImpares = posicionArregloImpares + 1;
            }
            numero = numero + 1;
        }
        for (numero = 0; numero < pares.length; numero++) {
            System.out.print(pares[numero] + " ");
        }
        System.out.println("");

        for (numero = 0; numero < impares.length; numero++) {
            System.out.print(impares[numero] + " ");
        }
    }

    public static void mostrarParesImparesPara() {

        int[] pares = new int[50];
        int[] impares = new int[50];
        int numero = 1;
        int posicionArregloPares = 0;
        int posicionArregloImpares = 0;

        for (numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                pares[posicionArregloPares] = numero;
                posicionArregloPares = posicionArregloPares + 1;

            } else if (numero % 2 != 0) {
                impares[posicionArregloImpares] = numero;
                posicionArregloImpares = posicionArregloImpares + 1;
            }
        }

        for (numero = 0; numero < pares.length; numero++) {
            System.out.print(pares[numero] + " ");
        }
        System.out.println("");
        for (numero = 0; numero < impares.length; numero++) {
            System.out.print(impares[numero] + " ");
        }
    }
}
