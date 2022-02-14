package com.sofka.practica_Java.Electrodomestico;

public class Electrodomestico {

    protected final static String COLOR_PREDEFINIDO = "blanco";
    protected final static char CONSUMO_ENERGETICO_PREDEFINIDO = 'F';
    protected final static double PRECIO_BASE_PREDEFINIDO = 100;
    protected final static double PESO_PREDEFINIDO = 5;

    protected double precioBase;
    protected double peso;
    protected String color;
    protected char consumoEnergetico;


    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public Electrodomestico() {
        this.precioBase = PRECIO_BASE_PREDEFINIDO;
        this.peso = PESO_PREDEFINIDO;
        this.color = COLOR_PREDEFINIDO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_PREDEFINIDO;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_PREDEFINIDO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_PREDEFINIDO;
    }

    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    private void comprobarConsumoEnergetico(char consumoEnergetico) {
        char letraMayuscula = Character.toUpperCase(consumoEnergetico);
        if (letraMayuscula == 'A' || letraMayuscula == 'B' || letraMayuscula == 'C' || letraMayuscula == 'D' ||
                letraMayuscula == 'E') {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = CONSUMO_ENERGETICO_PREDEFINIDO;
        }
    }

    private void comprobarColor(String color) {

        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;

        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            this.color = color;
        } else {
            this.color = COLOR_PREDEFINIDO;
        }
    }


    public double precioFinal() {
        double suma = 0;
        switch (consumoEnergetico) {
            case 'A':
                suma += 100;
                break;
            case 'B':
                suma += 80;
                break;
            case 'C':
                suma += 60;
                break;
            case 'D':
                suma += 50;
                break;
            case 'E':
                suma += 30;
                break;
            case 'F':
                suma += 10;
                break;
        }

        if (peso >= 0 && peso <= 19) {
            suma += 10;
        } else if (peso >= 20 && peso <= 49) {
            suma += 50;
        } else if (peso >= 50 && peso <= 79) {
            suma += 80;
        } else if (peso >= 80) {
            suma += 100;
        }
        return precioBase + suma;
    }
}