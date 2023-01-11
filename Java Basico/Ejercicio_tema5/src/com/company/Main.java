package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SmartDevice sd1;
        SmartDevice sd2;

        sd1 = new SmartPhone("Note 11","Xiaomi","2021","Azul","Android",4,"13.1");
        sd2 = new SmartWatch("AMAZFIT","Xiaomi","2022","Naranja","4G","1.65'");

        System.out.println(sd1.toString());
        System.out.println("------------------");
        System.out.println(sd2.toString());
    }
}
