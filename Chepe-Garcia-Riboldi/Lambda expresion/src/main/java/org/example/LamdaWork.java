package org.example;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Hello world!
 *
 */
public class LamdaWork
{
    public static void main( String[] args ){
        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(6);
        arrayList.add(8);
        int suma = 0;

        arrayList.stream().filter(queso -> queso == 6);


        System.out.println(suma);
    }
}
