package Pruebas;


import Persona.PersonaU;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonaU persona = new PersonaU();
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime tu nombre: ");
        String nombre= scanner.nextLine();
        System.out.println("dime tu edad");
        int edad = scanner.nextInt();
        persona.limiteEdad(edad);

    }
}