/**
 * Ejercicio 14
 */

package com.sofka.practica_Java;

import java.util.Scanner;

public class NumerosDosEnDos {
    public static void main(String[] args) {
        generarNumero();
    }



    public static void generarNumero() {
        Scanner lectura = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Por favor ingresar un número menor de 1000");
            numero = lectura.nextInt();
        } while (numero < 1 || numero > 1000);

        int i;
        for (i = numero; i <= 1000; i=i+2) {

            System.out.println(i);
        }
    }
}
