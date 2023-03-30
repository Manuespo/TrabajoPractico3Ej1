package com.company;


public class Circulo extends Figura {
    private double radio=1;
    private String color="Rojo";
    private double area;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
        this.area=area();
    }


    public Circulo() {
        this.area=area();
    }

    @Override
    public double area() {
        return 2*Math.PI*radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
