package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona p1 = new Persona(); 
        p1.setEdad(29);
        p1.setNombre("Xavier");
        p1.setTelefono("956784512");
        //Mostrando lo valores
        System.out.println("El nombre es -> " + p1.getNombre());
        System.out.println("La edad es -> " +p1.getEdad());
        System.out.println("EL numero telefonico es -> "+p1.getTelefono());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
