package com.sofka.practica_Java.persona;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        String nombre = lectura.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = lectura.nextInt();

        System.out.println("Ingrese el sexo (M para mujer y H para hombre): ");
        char sexo = lectura.next().toUpperCase().charAt(0);

        System.out.println("Ingrese el peso en kilos: ");
        double peso = lectura.nextDouble();

        System.out.println("Ingrese la altura en metros: ");
        double altura = lectura.nextDouble();

        Persona objeto1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona objeto2 = new Persona(nombre, edad, sexo);
        Persona objeto3 = new Persona();

        objeto2.setPeso(90.5);
        objeto2.setAltura(1.80);

        objeto3.setNombre("Laura");
        objeto3.setEdad(30);
        objeto3.setSexo('M');
        objeto3.setPeso(60);
        objeto3.setAltura(1.60);

        System.out.println("Objeto 1");
        mostrarMensajePeso(objeto1);
        MuestraMayorDeEdad(objeto1);
        System.out.println(objeto1.toString());

        System.out.println("Objeto 2");
        mostrarMensajePeso(objeto2);
        MuestraMayorDeEdad(objeto2);
        System.out.println(objeto2.toString());

        System.out.println("Objeto 3");
        mostrarMensajePeso(objeto3);
        MuestraMayorDeEdad(objeto3);
        System.out.println(objeto3.toString());
    }


    public static void mostrarMensajePeso(Persona persona) {
        int imc = persona.calcularIMC();

        switch (imc) {
            case -1:
                System.out.println("La persona está por debajo de su peso ideal");
                break;
            case 0:
                System.out.println("La persona está en su peso ideal");
                break;
            case 1:
                System.out.println("La persona está por encima de su peso ideal");
                break;
        }
    }

    public static void MuestraMayorDeEdad(Persona persona) {

        if (persona.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
}

