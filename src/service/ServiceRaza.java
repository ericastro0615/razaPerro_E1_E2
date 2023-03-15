package service;

import Comparators.ComparatorClass;
import entidades.RazaClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiceRaza {


    public  RazaClass crearPerro  ( ) {
        Scanner sc = new Scanner ( System.in ).useDelimiter ( "\n" );
        RazaClass perrito = new RazaClass ();
    System.out.println ("Ingrese el nombre de la raza");
        perrito.setRaza ( sc.nextLine () );
        return perrito;
    }

    //guardo los obj en una lista
    public  ArrayList <RazaClass> crearlistaRaza (){
        Scanner sc = new Scanner ( System.in ).useDelimiter ( "\n" );

        ArrayList<RazaClass> lista  = new ArrayList<>();
        do {
            lista.add (crearPerro ()  );
            System.out.println ("Desea salir? si/no");
           // salir= sc.next ().equalsIgnoreCase ( "no" ) ? true:false;
        } while  (sc.next().equalsIgnoreCase("no") ? true : false);
        mostrarRaza ( lista );
        menu ( lista ); //REGRESAR A REALIZAR CORRECTAMENTE LA VINCULACION DEL MENU CON MAIN!
        return ( lista );

    }


    private  void mostrarRaza (ArrayList<RazaClass> lista ) {
        Scanner sc = new Scanner ( System.in ).useDelimiter ( "\n" );
        System.out.println ("Las razas son: \n");
        for (RazaClass aux: lista   )
            System.out.println (  aux.toString ());

    }

    /*
      2 . después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
  */


    public  void eliminarRaza (ArrayList <RazaClass> lista) {
        Scanner sc = new Scanner ( System.in ).useDelimiter ( "\n" );
        System.out.println ("\n Ingrese la raza del perrito, a eliminar de la lista");
        Iterator <RazaClass> its = lista.iterator ();
        int i=0;
        while (its.hasNext ()) {
            if (its.next ().equals ( sc.next () ) );
            its.remove ();
            i++;
        }
        System.out.printf ("Hubo" , i , "coincidencias\n" ,"Nueva lista ordenada :\n");
        ordenarListaAlfabeticamente ( lista );
    }


        public void ordenarListaAlfabeticamente (ArrayList <RazaClass> lista) {
            lista.sort ( ComparatorClass.ordenarLista );
            mostrarRaza ( lista );
        }


    public void  menu (  ArrayList <RazaClass> lista ) {

        System.out.println ("PERRERIA \n ");

        eliminarRaza ( lista );



    }


}
