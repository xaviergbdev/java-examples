package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Cliente
        Cliente cliente1= new Cliente();

        cliente1.edad=30;
        cliente1.nombre="Fabian";
        cliente1.telefono="963852147";
        cliente1.credito=1200.52;

        System.out.println("EL nombre del cliente es -> " +cliente1.nombre);
        System.out.println("La edad del cliente -> "+cliente1.edad);
        System.out.println("El telefono del cliente es -> "+cliente1.telefono);
        System.out.println("El credito del cliente es -> "+ cliente1.credito);

        System.out.println("_________________________________________________");
        //Trabajador

        Trabajador trabajador1= new Trabajador();

        trabajador1.nombre="Esteban";
        trabajador1.edad=24;
        trabajador1.telefono="951789457";
        trabajador1.salaraio=1025.5;

        System.out.println("El nombre del trabajador es -> "+ trabajador1.nombre);
        System.out.println("La edad del trabajador es -> "+trabajador1.edad);
        System.out.println("El telefono del trabajador es -> "+trabajador1.telefono);
        System.out.println("El salario del trabajador es -> "+trabajador1.salaraio);

    }
}

class Persona{
    String nombre;
    String telefono;
    int edad;


}

class Cliente extends  Persona {
    double credito;

}

class Trabajador extends  Persona{
    double salaraio;
}


