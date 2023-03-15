package Comparators;

import entidades.RazaClass;

import java.util.Comparator;

public class ComparatorClass {
        public static Comparator <RazaClass> ordenarLista = new Comparator<RazaClass> () {
            @Override
            public int compare(RazaClass o1, RazaClass o2) {
                return o1.getRaza ().compareTo ( o2.getRaza () );
            }
        };
}
