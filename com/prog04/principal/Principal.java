package com.prog04.principal;

import com.prog04.figuras.Rectangulo;

public class Principal {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.setAltura(20.222222222f);
        rectangulo1.setBase(20.22222222f);
        float area1 = rectangulo1.getArea();

        System.out.println("El rectángulo 1 tiene altura: "
                + rectangulo1.getAltura()
                + ", base: " + rectangulo1.getBase()
                + ", con área: "
                + area1
                + " y "
                + (rectangulo1.isCuadrado() ? "es cuadrado" : "no es cuadrado"));


        Rectangulo rectangulo2 = new Rectangulo(25.1321f, 45.54685f);
        float area2 = rectangulo2.getArea();

        System.out.printf("\n**Rectángulo 2**\nAltura: %2f\nBase: %2f\nÁrea: %2f\n", rectangulo2.getAltura(), rectangulo2.getBase(), area2);
        System.out.println(rectangulo2.isCuadrado() ? "Es cuadrado" : "No es cuadrado\n");
        System.out.println(rectangulo1);
    }

}
