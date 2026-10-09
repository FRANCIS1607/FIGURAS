package com.example.arquitectura;

public class Triangulo extends Figura{

    private double altura;
    private double base;
    private double lado2;
    private double lado3;

    public Triangulo(double altura, double base, double lado2, double lado3) {
        this.altura = altura;
        this.base = base;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double perimetro() {
        return base+ lado2+ lado3;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }
}
