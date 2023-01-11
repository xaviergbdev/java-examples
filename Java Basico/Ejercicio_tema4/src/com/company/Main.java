package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String [] nombres = {"Mario","Manuael","Pedro" , "Esteban"};

        int contador =0;
        String frase = "" ;
        while(contador <nombres.length){
            frase+=nombres[contador];
            frase+=" ";
            contador++;
        }

        System.out.println(frase);
    }
}
