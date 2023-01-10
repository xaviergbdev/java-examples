package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double precio = 100;
        System.out.println("El precio + el IVA es  -> " + getPrice(precio));


    }

    public static double getPrice(double price) {
        price*=1.21;
        return(price);
    }
}
