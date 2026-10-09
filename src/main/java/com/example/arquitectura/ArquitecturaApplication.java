package com.example.arquitectura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArquitecturaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArquitecturaApplication.class, args);

        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println("Cuadrado");
        System.out.println("Área: " + cuadrado.area());
        System.out.println("Perímetro: " + cuadrado.perimetro());

        Circulo circulo = new Circulo(5);
        System.out.println("\nCírculo");
        System.out.println("Área: " + circulo.area());
        System.out.println("Perímetro: " + circulo.perimetro());

        Rectangulo rectangulo = new Rectangulo(10, 5);
        System.out.println("\nRectángulo");
        System.out.println("Área: " + rectangulo.area());
        System.out.println("Perímetro: " + rectangulo.perimetro());

        Triangulo triangulo = new Triangulo(6, 4, 5, 5);
        System.out.println("\nTriángulo");
        System.out.println("Área: " + triangulo.area());
        System.out.println("Perímetro: " + triangulo.perimetro());
    }
}