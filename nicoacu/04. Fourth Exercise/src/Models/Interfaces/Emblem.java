package Interfaces;

import java.util.Arrays;

public interface Emblem {

    default void createLogo() {
        System.out.println("Logo is being created...");
    }

    default void chooseShield(){
        System.out.println("Shield is being created...");
    }

    default void pickColours(String... args){
        String [] arrayString = args;
        System.out.println("The colours picked for the logo and shield are the following:" + Arrays.toString(arrayString));

    }


}
