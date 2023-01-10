package com.conceptos;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String message = " Hola Mundo";

        System.out.println(message);
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

        String otro = "Mensaje";
        if (message.equals(" Hola Mundo")) {
            System.out.println("La condicion es verdadera ...");
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8,8};

        for(int item : numbers){
            System.out.println(item);
        }

    }
}
