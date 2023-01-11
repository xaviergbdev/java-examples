package com.company;

public class SmartWatch  extends SmartDevice{

    String red;
    String dimension;

    public SmartWatch() {}

    public SmartWatch(String modelo, String marca, String year, String color, String red, String dimension) {
        super(modelo, marca, year, color);
        this.red = red;
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                ", red='" + red + '\'' +
                ", dimension='" + dimension + '\'' +
                '}';
    }
}
