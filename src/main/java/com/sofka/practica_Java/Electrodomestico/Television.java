package com.sofka.practica_Java.Electrodomestico;

public class Television extends Electrodomestico {

    private static int resolucion;
    private boolean sintonizadorTDT;

    public static int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public Television() {
        this.precioBase = PRECIO_BASE_PREDEFINIDO;
        this.peso = PESO_PREDEFINIDO;
        this.color = COLOR_PREDEFINIDO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_PREDEFINIDO;
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_PREDEFINIDO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_PREDEFINIDO;
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double precioFinal() {
        double suma = super.precioFinal();
        if (resolucion > 40) {
            suma += precioBase * 0.3;
        }
        if (sintonizadorTDT) {
            suma += 50;
        }
        return suma;
    }
}