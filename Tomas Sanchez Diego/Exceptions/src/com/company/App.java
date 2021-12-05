package com.company;

import com.company.Exceptions.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void InsertName (String name) throws InvalidNameException {
        if(name == "" || name == " ") {
            throw new InvalidNameException(" your name cannot be a blank space");
        }
        else {
            System.out.println(" you cant proceed");
        }
    }

    public static void  InsertAge (int age) throws InvalidAgeException {
        if (age > 130 || age <= 0) {
            throw new InvalidAgeException("the age inserted is impossible");
        }
        else {
            System.out.println(" you can proceed ");
        }
    }
    public static void CheckAnswer (String answer) throws InvalidAnswerException {
        if (answer == "" || answer == " "){
            throw new InvalidAnswerException("you cant answer with a blank space ");
        }
        else {
            System.out.println(" you can proceed ");
        }

    }
    public static void CheckYesOrNo (String answer) throws YesOrNoException {
        if (answer != "Yes" || answer != "No"){
            throw new YesOrNoException("you should only answer with Yes or No");
        }
        else {
            System.out.println(" you can proceed ");
        }
    }
    public static void CheckNumber (int num) throws InsertNumberException {
        if (num <= 0 ) {
            System.out.println("you can't respond with a 0  ");
        }
        else {
            System.out.println(" you can proceed ");
        }
    }

    public static void TryCatchException() {
        Scanner insertion = new Scanner(System.in);
        int answer;
        System.out.println("Insert your answer");
        try {
            answer = insertion.nextInt();
            System.out.println("you can continue");
        }
        catch (InputMismatchException ex) {
            System.out.println("there was a problem with your answer");
            TryCatchException();
        }
    }


}
