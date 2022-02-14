/**
 * Ejercicio 3
 */

package com.sofka.practica_Java;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args)
    {
        calcularAreaCirculo();
    }

    public static void calcularAreaCirculo() {
        Scanner lectura = new Scanner(System.in);
        double radio;
        double area;

        System.out.println("Favor ingresar el radio del círculo");
        radio = lectura.nextDouble();
        area = Math.PI * (Math.pow(radio, 2));
        System.out.println("El área del círculo es: " + area);
    }
}
