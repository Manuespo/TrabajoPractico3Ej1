package com.company;

public class Main {

    public static void main(String[] args) {
        Figura figura =new Circulo();
        Figura figura1=new Circulo(3,"Verde");
        Figura figura2= new Cilindro(2,"Amarillo",4);
        Figura figura3=new Cilindro();
        System.out.println(figura);
        System.out.println(figura1);
        System.out.println(figura2);
        System.out.println(figura3);

    }
}
