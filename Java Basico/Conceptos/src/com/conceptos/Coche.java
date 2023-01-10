package com.conceptos;

public class Coche {
    //Atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad =0;

    //Constructores
    public Coche(){}

    public Coche(String color , String fabricante, String modelo, Double peso, Double largo) {
            this.color = color;
            this.fabricante = fabricante;
            this.modelo = modelo;
            this.peso = peso;
            this.largo = largo;

    }

    public String getColor() {
        return color;
    }

    //Comportamiento

    public void acelerar(Integer cantidad) {
        this.velocidad += cantidad;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
