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


        Queue<String> Patentes = new PriorityQueue<>();
        Patentes.add("MNB789");
        Patentes.add("JHY765");
        Patentes.add("KLO265");
        System.out.println("Las patentes son" + Patentes);


        Set<String> MarcaAuto= new HashSet<String>();
        MarcaAuto.add("Ford");
        MarcaAuto.add("Chevrolet");
        MarcaAuto.add("Honda");
        MarcaAuto.add("Ford");

        System.out.println("La marca del auto es" + MarcaAuto);
        MarcaAuto.remove("Ford");
        System.out.println("Autos sin arreglar" + MarcaAuto);

        Stack<String> Duenovehiculo= new Stack<String>();
        Duenovehiculo.push("ALberto Tyron");
        Duenovehiculo.push("Mike Tyson");
        Duenovehiculo.pop();
        Duenovehiculo.push("Vilma Palma");
        System.out.println("Tarjeta verde del vehiculo" + Duenovehiculo);

        Vector<Integer> PrecioArreglo= new Vector<Integer>();
        PrecioArreglo.add(2000);
        PrecioArreglo.add(4327);
        PrecioArreglo.add(2611);
        PrecioArreglo.add(8733);
        System.out.println("Precio del arreglo mas impuestos" + PrecioArreglo);
        PrecioArreglo.remove(1);
        PrecioArreglo.remove(2);
        Duenovehiculo.remove("Mike Tyson");
        Duenovehiculo.remove("Jim Carrey");
        System.out.println("Abonaron el arreglo" + Duenovehiculo + PrecioArreglo);










        }






    }






