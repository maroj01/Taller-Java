package com.sofka.practica_Java.Electrodomestico;

public class Ejecutable {
    public static void main(String[] args) {

        Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];

        listaElectrodomesticos[0] = new Television();
        listaElectrodomesticos[1] = new Electrodomestico(50, 10);
        listaElectrodomesticos[2] = new Television();
        listaElectrodomesticos[3] = new Electrodomestico(9000, 10);
        listaElectrodomesticos[4] = new Electrodomestico(600, 20, 'D', "gris");
        listaElectrodomesticos[5] = new Lavadora(50, 40, 'M', "VERDE", 40);
        listaElectrodomesticos[6] = new Television(250, 70);
        listaElectrodomesticos[7] = new Lavadora(400, 100, 'A', "verde", 15);
        listaElectrodomesticos[8] = new Television(200, 60, 'C', "ROJO", 30, true);
        listaElectrodomesticos[9] = new Television();

        double sumaElectrodomesticos = 0;
        double sumaTelevisiones = 0;
        double sumaLavadoras = 0;


        for (int i = 0; i < listaElectrodomesticos.length; i++) {

            if (listaElectrodomesticos[i] instanceof Electrodomestico) {
                sumaElectrodomesticos += listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Lavadora) {
                sumaLavadoras += listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Television) {
                sumaTelevisiones += listaElectrodomesticos[i].precioFinal();
            }
        }

        System.out.println("La suma del precio de las lavadoras es: " + sumaLavadoras);
        System.out.println("La suma del precio de los TV's es: " + sumaTelevisiones);
        System.out.println("La suma del precio de todos los electrodomesticos es: " + sumaElectrodomesticos);

    }
}