package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        ArrayList<String> mecanico= new ArrayList<String>();
        mecanico.add("motor");
        mecanico.add("bujia");
        mecanico.add("rueda");
        System.out.println("Partes de auto" + mecanico);
        mecanico.add("volante");
        System.out.println("Nueva parte" +mecanico);


        Queue<String> Patentes = new LinkedList<>();
        Patentes.add("MNB789");
        Patentes.add("JHY765");
        Patentes.add("KLO265");
        System.out.println("Las patentes son" + Patentes);


        SortedSet<String> MarcaAuto= new TreeSet<String>();
        MarcaAuto.add("Ford");
        MarcaAuto.add("Chevrolet");
        MarcaAuto.add("Honda");
        MarcaAuto.add("Ford");

        System.out.println("La marca del auto es" + MarcaAuto);
        MarcaAuto.remove("Ford");
        System.out.println("Autos sin arreglar" + MarcaAuto);






        }






    }






