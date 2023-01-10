package com.conceptos;


import java.util.List;
import java.util.ArrayList;

public class DynamicList {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Xavier");
        nombres.add("Xavi");
        nombres.add("Marcos");

        for(String item : nombres) {
            System.out.println(item);
        }
    }


}
