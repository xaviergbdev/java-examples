package com.conceptos;

public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico() {

    }
    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }
    public CocheElectrico(String color,String fabricante,String modelo,Double peso,Double largo,String motorElectrico) {
        super(color,fabricante,modelo,peso,largo);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", motorElectrico='" + motorElectrico + '\'' +
                '}';
    }
}
