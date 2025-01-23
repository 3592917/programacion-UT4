package com.prog04.figuras;

public class Rectangulo {
    private float base;
    private float altura;

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura(){
       return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getBase(){
        return base;
    }

    public Rectangulo(){}
    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public float getArea(){
        return base * altura;
    }

    public String toString(){
        return "El área del rectángulo es: " + getArea() + " y la altura: " + altura;
    }

    public boolean isCuadrado(){
        return base == altura;
    }

}
