package com.conceptos;

public class TryCatcjMain {

    /**
     *
     * @param args -argumentos de entrada para la aplicacion
     */

    public static void main(String[] args) {


        try {
            int result = 5/0;
        }catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Cirre del recurso ...");
        }

    }
}
