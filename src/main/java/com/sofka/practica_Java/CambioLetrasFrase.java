/**
 * Ejercicio 9
 */

package com.sofka.practica_Java;

import java.util.Scanner;

public class CambioLetrasFrase {
    public static void main(String[] args) {
        cambiarAdicionarFrase();
    }

    public static void cambiarAdicionarFrase() {
        Scanner lectura = new Scanner(System.in);
        String fraseAnterior = "La sonrisa sera la mejor arma contra la tristeza";
        String fraseIngresada;
        String fraseNueva;

        System.out.println("Frase anterior: "+fraseAnterior);
        System.out.println("Ingrese una frase: ");
        fraseIngresada = lectura.nextLine();
        fraseNueva = fraseAnterior.replace("a", "e") + ". " + fraseIngresada;

        System.out.println("Frase nueva: "+fraseNueva);

    }
}
