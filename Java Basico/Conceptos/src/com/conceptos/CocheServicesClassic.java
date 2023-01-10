package com.conceptos;

public class CocheServicesClassic implements CochesServices {
    @Override
    public Coche crearCocheDemo(){

        return new CocheElectrico();
    }
}
