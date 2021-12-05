package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        Thread1 mythread1= new Thread1();
        Thread1 mythread2= new Thread1();
        Thread1 mythread3= new Thread1();
        Thread1 mythread4= new Thread1();
        Thread1 mythread5= new Thread1();
        Thread1 mythread6= new Thread1();
        Thread1 mythread7= new Thread1();
        Thread1 mythread8= new Thread1();
        Thread1 mythread9= new Thread1();
        Thread1 mythread10=new Thread1();


        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.execute(mythread1);
        pool.execute(mythread2);
        pool.execute(mythread3);
        pool.execute(mythread4);
        pool.execute(mythread5);
        pool.execute(mythread6);
        pool.execute(mythread7);
        pool.execute(mythread8);
        pool.execute(mythread9);
        pool.execute(mythread10);


        System.out.println(Thread.activeCount());
    }
}
