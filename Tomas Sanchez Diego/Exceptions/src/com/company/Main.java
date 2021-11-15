package com.company;

import com.company.Exceptions.*;

public class Main extends App {

    public static void main(String[] args) {
	// write your code here

        try {
            InsertName("");
        }catch (InvalidNameException ex) {
            System.out.println("Got the exception" + ex);

        }

        try {
            InsertAge(-1);
        }catch (InvalidAgeException ex) {
            System.out.println("Got the exception" + ex);

        }

        System.out.println("this statement should be responded with a number");
        TryCatchException();

        try {
            CheckAnswer(" ");
        }catch (InvalidAnswerException ex) {
            System.out.println("Got the exception" + ex);

        }

        try {
            CheckYesOrNo(" yes and no");
        }catch (YesOrNoException ex) {
            System.out.println("Got the exception" + ex);

        }
        try {
            CheckNumber(0);
        }catch (InsertNumberException ex) {
            System.out.println("Got the exception" + ex);

        }

    }
}
