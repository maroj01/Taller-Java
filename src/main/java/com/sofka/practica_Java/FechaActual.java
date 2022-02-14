/**
 * Ejercicio 13
 */

package com.sofka.practica_Java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaActual {
    public static void main(String[] args) {
        consultarFechaActual();
    }

    public static void consultarFechaActual() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La fecha y hora es: " + dtf.format(LocalDateTime.now()));
    }
}
