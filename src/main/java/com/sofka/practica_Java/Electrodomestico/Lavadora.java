package com.sofka.practica_Java.Electrodomestico;

public class Lavadora extends Electrodomestico {

    private static final int CARGA_PREDEFINIDA = 5;
    private int carga;

    public int getCarga() {
        return carga;
    }

    public Lavadora() {
        this.precioBase = PRECIO_BASE_PREDEFINIDO;
        this.peso = PESO_PREDEFINIDO;
        this.color = COLOR_PREDEFINIDO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_PREDEFINIDO;
        this.carga = CARGA_PREDEFINIDA;
    }

    public Lavadora(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_PREDEFINIDO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_PREDEFINIDO;
        this.carga = CARGA_PREDEFINIDA;
    }

    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga) {
        super(precioBase, peso, consumoEnergetico, color);
        this.carga = carga;
    }

    public double precioFinal() {
        double suma = super.precioFinal();
        if (carga > 30) {
            suma += 50;
        }
        return suma;
    }
}