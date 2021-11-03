package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void validate (int age) throws invalidAgeException{
        if(age<18){
            throw new invalidAgeException("age is not valid to get in");
        }else{
            System.out.println("Welcome to Moscu");
        }

    }


    public static void pregunta(String respuesta) throws SiOno {
        System.out.println("Te gustan las empanadas?");

        if (respuesta == "si" || respuesta == "no") {
            System.out.println(respuesta + " le gustan las empanadas");
        } else {
            throw new SiOno("this is not a valid answer");
        }

    }

    public static void generaExcepcion() {
        Scanner entrance = new Scanner(System.in);
        float numero;
        System.out.println("Ingrese una letra para manejar la excepcion");
        try {
            numero = entrance.nextFloat();
            System.out.println("Usaste un numero este metodo se ejecuto correctamente");
        } catch (InputMismatchException ex) {
            System.out.println("Rompiste el programa");
            generaExcepcion();

        }


    }

    public static String greetings(int saludos) {

        String[] myArray = {"hola", "hello", "ciao", "salut"};
        return myArray[saludos];

    }

    public static double divide(int num1, int num2) {
        return num1 / num2;


    }


    public static void main(String[] args) {
        try {
            validate(14);
        } catch (invalidAgeException ex){
            System.out.println("Caught the exception");

            System.out.println("Exception ocured" + ex);
        }

        try {
            pregunta("i");
        }catch (SiOno ex){
            System.out.println("rta invalida");
        }

        generaExcepcion();


        try {
            divide(1, 0);
        } catch (ArithmeticException ex) {
            System.out.println("dont divide by zero");
        }

        try {
            greetings(6);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("error404");
        }


    }

}













