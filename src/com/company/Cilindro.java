package com.company;

public class Cilindro extends Circulo{
    private double altura=1;
    private double volumen;



    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
        this.volumen=volumen();
    }

    public Cilindro() {
        this.volumen=volumen();
    }
    public double volumen(){
        return super.area()*altura;
    }

    @Override
    public double area() {
        return volumen() + 2*super.area();
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "Area Cilindro = "+ area() +
                " Area Base = "+ super.area() +
                " Radio = " + getRadio() +
                " Altura =" + altura +
                ", Volumen =" + volumen +
                '}';
    }

}
