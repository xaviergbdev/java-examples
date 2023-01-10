package com.conceptos;

import java.util.Random;


public class Main {
    public static void main(String[] args) {

    Coche ch1= new Coche("marron","Honda","H0",100.5,2.5);

    ch1.acelerar(65);
    System.out.println(ch1.toString());

    Coche ch3 = new CocheElectrico(); //Poliformismo

    CocheElectrico ce=new CocheElectrico("Motor de prueba");
    ce.color="Negro";
    ce.fabricante="Toyota";
    ce.modelo="Yaris";
    ce.peso=1500.5;
    ce.largo=3.5;

    ce.acelerar(50);
    System.out.println(ce.toString());

    CocheElectrico ce2=new CocheElectrico("Blanco","Nissan","Sedan",1000.5,2.75,"prueba");
       ce2.acelerar(90);
        System.out.println(ce2.toString());
    }
}
