package service;

import entidades.RazaClass;

import java.util.ArrayList;
import java.util.Scanner;

public  class ServiceRaza {


    public static RazaClass crearPerro  ( ) {
        Scanner sc = new Scanner ( System.in ).useDelimiter ( "\n" );
        RazaClass perrito = new RazaClass ();
    System.out.println ("Ingrese el nombre de la raza");
        perrito.setRaza ( sc.nextLine () );
        return perrito;
    }

    //guardo los obj en una lista
    public static ArrayList <RazaClass> crearlistaRaza (){
        Scanner sc = new Scanner ( System.in ).useDelimiter ( "\n" );

        ArrayList<RazaClass> lista  = new ArrayList<>();

        do {
            boolean salir= false;
            lista.add (crearPerro ()  );
            System.out.println ("Desea salir? si/no");
           salir= sc.next ().equalsIgnoreCase ( "no" ) ? true:false;
        } while (salir );

        return lista;

    }


    private static void mostrarRaza (ArrayList<RazaClass> lista ) {
        Scanner sc = new Scanner ( System.in ).useDelimiter ( "\n" );
        System.out.println ("Las razas ingresadas son: \n");
        for (RazaClass aux: lista   )
            System.out.println (  aux.toString ());

    }

    public static void menu (ArrayList<RazaClass> lista ) {
        crearlistaRaza ();
        System.out.println ("PERRERIA :) ");
        mostrarRaza(   lista  );

    }


}
