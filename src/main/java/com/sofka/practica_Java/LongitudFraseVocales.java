/**
 * Ejercicio11
 */

package com.sofka.practica_Java;

import java.util.Scanner;

public class LongitudFraseVocales {
    public static void main(String[] args) {
        determinarLongitud();
    }

    public static void determinarLongitud() {
        Scanner lectura = new Scanner(System.in);
        String frase;
        int longitudFrase;
        int cantidadVocales = 0;

        System.out.println("Ingresa frase: ");
        frase = lectura.nextLine();

        longitudFrase = frase.length();

        for (int x = 0; x < longitudFrase; x++) {
            if ((frase.charAt(x) == 'a') || (frase.charAt(x) == 'e') || (frase.charAt(x) == 'i') || (frase.charAt(x) == 'o') || (frase.charAt(x) == 'u')) {
                cantidadVocales++;
            }
        }
        System.out.println("La longitud de la frase es: "+longitudFrase+" y la cantidad de vocales es: "+ cantidadVocales);

    }
}
