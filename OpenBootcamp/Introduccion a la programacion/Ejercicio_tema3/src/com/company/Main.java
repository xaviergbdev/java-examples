package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Primera Parte");
        //Primera parte
        int resultado = suma(12,23,10);
        System.out.println("La suma es " + resultado);
        System.out.println("##########################");

        //Segunda Parte
        System.out.println("Segunda Parte");

        Coche c1= new Coche();
        c1.agregarPuerta();
        System.out.println("El numero de puertas del coche es -> " +c1.puertas);
    }
    public static int suma(int a, int b,int c) {
        return a+b+c;
    }
}

class Coche {
    public int puertas =0;

    public void agregarPuerta(){
        this.puertas++;
    }
}
