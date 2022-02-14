/**
 * Ejercicio 4
 */

package com.sofka.practica_Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrecioProducto {
    public static void main(String[] args) {
        indicarPrecio();
    }

    public static void indicarPrecio() {
        DecimalFormat formatoMiles = new DecimalFormat("###,###.##");
        Scanner lectura = new Scanner(System.in);
        double valor;
        final double iva = 0.21;
        double totalCosto;

        System.out.println("Cuánto cuesta una camisa? ");
        valor = lectura.nextDouble();

        totalCosto = valor * iva + valor;
        System.out.println("El valor total de la camisa incluyendo IVA es de: " + formatoMiles.format(totalCosto) + " pesos.");

    }
}
