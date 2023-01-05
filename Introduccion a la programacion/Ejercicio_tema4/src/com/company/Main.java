package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //primer ejercicio

            int numeroif = 1;
            if(numeroif>0){
                System.out.println("El numero es positivo");
            } else if ( numeroif==0){
                System.out.println("El numero es 0");
            } else {
                System.out.println(" El numero es negativo");
            }

            //Segundo ejercicio
             int numeroWhile =0;

            while ( numeroWhile<3) {
                System.out.println("El valor del numeroWhile es " + numeroWhile);
                numeroWhile++;
            }

            //Tercer ejercicio

            int numeroDo=2;
            do{
                System.out.println("El valor de numerDo es "+numeroDo);
                numeroDo++;
            } while(numeroDo<3);

            //Cuarto ejercicio

            for(int numeroFor=0; numeroFor<=3;numeroFor++){
                System.out.println("El valor de numeroFor es -> " + numeroFor);
            }

        //Quinto ejercicio
        System.out.println("Las opciones");
        System.out.println("Verano 1 - Invierno 2 - Otonio 3 y Primavera 4");

            int estacion = 2;

            switch (estacion){
                case 1:
                    System.out.println("La etacion es verano");
                    break;
                case 2:
                    System.out.println("La estacion es invierno");
                    break;
                case 3:
                    System.out.println("La estacion es otoño");
                    break;
                case 4:
                    System.out.println("La estacion es primavera");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

    }
}
