/**
 * Ejercicio 1 y 2
 */
package com.sofka.practica_Java;
import java.util.Scanner;

public class ComparadorNumerico {
    public static void main(String[] args) {
        compararNumeros();
        ingresarNumeros();
    }
    public static void compararNumeros() {
        int numeroUno = 8;
        int numeroDos = 8;

        if (numeroUno > numeroDos) {
            System.out.println("El número " + numeroUno + " es mayor que el número " + numeroDos);
        } else if (numeroUno < numeroDos) {
            System.out.println("El número " + numeroUno + " es menor que el número " + numeroDos);
        } else {
            System.out.println("El número " + numeroUno + " es igual al número " + numeroDos);
        }
    }

    public static void ingresarNumeros() {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Favor ingresar el número 1 ");
        int numeroUno = lectura.nextInt();
        System.out.println("Favor ingresar el número 2 ");
        int numeroDos = lectura.nextInt();

        if (numeroUno > numeroDos) {
            System.out.println("El número " + numeroUno + " es mayor que el número " + numeroDos);
        } else if (numeroUno < numeroDos) {
            System.out.println("El número " + numeroUno + " es menor que el número " + numeroDos);
        } else {
            System.out.println("El número " + numeroUno + " es igual al número " + numeroDos);
        }
    }

}



