/**
 * Ejercicio 7
 */
package com.sofka.practica_Java;

import java.util.Scanner;

public class MayorIgualCero {
    public static void main(String[] args) {
        ComprobarNumero();
    }

    public static void ComprobarNumero() {
        Scanner lectura = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Favor ingrese un número");
            numero = lectura.nextInt();
        } while (numero < 0);
        System.out.println("El número ingresa es: "+numero);

    }
}
