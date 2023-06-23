package com.oclock.tutojava.main;

import java.util.ArrayList;
import java.util.List;

import com.oclock.tutojava.tools.Utils;
import com.oclock.tutojava.zoo.Mesange;
import com.oclock.tutojava.zoo.SuperBird;
import com.oclock.tutojava.zoo.SuperMesange;

public class Main {
    public static void main(String[] args) {
        // Je commente ma ligne
        // String[] monTableau = { "maString1", "monStr2" };
        /*
         * Un commentaire
         * sur plusieurs
         * lignes
         */
        for (int i = 0; i < 1; i++) {
            System.out.println("Hello World!");
        }

        Mesange mesange = new Mesange("pioupiou1");
        SuperMesange superMesange = new SuperMesange("superPioupiou");
        superMesange.talk("fashionable");

        List<Mesange> mesanges = new ArrayList<Mesange>();
        mesanges.add(mesange);
        mesanges.add(superMesange);

        for (Mesange mesangeIterator : mesanges) {
            mesangeIterator.fly();
            System.out.println(mesangeIterator);
        }

        // superMesange.superPiou();

        List<SuperBird> superBirds = new ArrayList<SuperBird>();
        superBirds.add(superMesange);
        for (SuperBird sb : superBirds) {
            sb.superPiou();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("My magic number is: " + Utils.rdmNumber());
        }

        // int monIntParsed = Integer.parseInt("11");

    }

}
