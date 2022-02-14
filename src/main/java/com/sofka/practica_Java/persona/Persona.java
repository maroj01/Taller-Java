package com.sofka.practica_Java.persona;

public class Persona {

    private String nombre;
    private String dni;
    private int edad;
    private final char SEXO_PREDEFINIDO = 'H';
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        generarDNI();
        this.nombre = "";
        this.edad = 0;
        this.sexo = SEXO_PREDEFINIDO;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        peso = 0;
        altura = 0;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {

        double resultadoIMC;
        final int DEBAJO_PESO_IDEAL = -1;
        final int EN_PESO_IDEAL = 0;
        final int SOBREPESO = 1;

        resultadoIMC = peso / (altura * altura);
        if (resultadoIMC < 20) {
            return DEBAJO_PESO_IDEAL;
        } else if (resultadoIMC >= 20 && resultadoIMC <= 25) {
            return EN_PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        boolean mayorEdad;

        if (edad > 18) {
            mayorEdad = true;
        } else mayorEdad = false;
        return mayorEdad;
    }

    private void comprobarSexo() {
        if (sexo != 'H' && sexo != 'M') {
            sexo = SEXO_PREDEFINIDO;
        }
    }

    private void generarDNI() {
        int numeroDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        char letraDNI = generaLetraDNI(numeroDNI);
        dni = Integer.toString(numeroDNI) + letraDNI;
    }

    private char generaLetraDNI(int dni) {
        String textoDNI = String.valueOf(dni);
        char[] digitoDNI = textoDNI.toCharArray();
        int numeroPrimerDigitoDNI = Character.getNumericValue(digitoDNI[0]);

        char letras[] = {'Z', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'X'};
        return letras[numeroPrimerDigitoDNI];
    }

    @Override
    public String toString() {
        return "La información de la persona es: "
                + "Nombre: " + nombre
                + " Sexo: " + sexo
                + " Edad: " + edad
                + " DNI: " + dni
                + " Peso: " + peso
                + " Altura: " + altura;
    }
}