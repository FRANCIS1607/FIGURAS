package com.example.arquitectura;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return lado*4;
    }

    @Override
    public double area() {
        return lado*lado;
    }
}
