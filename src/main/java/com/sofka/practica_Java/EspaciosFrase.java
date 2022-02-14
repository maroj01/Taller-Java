
/**
 * Ejercicio 10
 */

package com.sofka.practica_Java;
import java.util.Scanner;

public class EspaciosFrase {
    public static void main(String[] args) {
        EliminarEspacios();
    }

    public static void EliminarEspacios() {
        Scanner lectura = new Scanner(System.in);
        String frase;
        String fraseSinEspacios;

        System.out.println("Ingresa una frase: ");
        frase = lectura.nextLine();
        fraseSinEspacios = frase.replace(" ", "");
        System.out.println(fraseSinEspacios);

    }
}
