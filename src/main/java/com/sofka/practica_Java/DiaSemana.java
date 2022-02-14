/**
 * Ejercicio 8
 */


package com.sofka.practica_Java;
import java.util.Locale;
import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        ComprobarDiaLaboral();
    }

    public static void ComprobarDiaLaboral() {
        Scanner lectura = new Scanner(System.in);
        String dia;
        String condicionDia="";

        System.out.println("Favor ingrese un día de la semana");
        dia = lectura.nextLine().toLowerCase();

        switch (dia.toLowerCase(Locale.ROOT)) {
            case "lunes":
                condicionDia = "día laboral";
                break;
            case "martes":
                condicionDia = "día laboral";
                break;
            case "miercoles":
                condicionDia = "día laboral";
                break;
            case "jueves":
                condicionDia = "día laboral";
                break;
            case "viernes":
                condicionDia = "día laboral";
                break;
            case "sabado":
                condicionDia = "día no laboral";
                break;
            case "domingo":
                condicionDia = "día no laboral";
                break;
            default:
                System.out.println("Ingrese un día valido");

        }
        System.out.println(dia+" es un "+condicionDia);

    }
}
