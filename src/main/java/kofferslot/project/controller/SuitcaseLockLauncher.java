package kofferslot.project.controller;

import kofferslot.project.model.SuitcaseLock;

public class SuitcaseLockLauncher {
    
    public static void main(String[] args) {
        // Test de default constructor: AA0;
        SuitcaseLock eenKoffer = new SuitcaseLock();
        System.out.print(eenKoffer.getFirstChar());
        System.out.print(eenKoffer.getSecondChar());
        System.out.println(eenKoffer.getNumber());

        // Test de all-args constructor
        SuitcaseLock eenTweedeKoffer = new SuitcaseLock('E', 'T', 6);
        System.out.print(eenTweedeKoffer.getFirstChar());
        System.out.print(eenTweedeKoffer.getSecondChar());
        System.out.println(eenTweedeKoffer.getNumber());

        // AA0 - AA1
        eenKoffer.next();
        System.out.print(eenKoffer.getFirstChar());
        System.out.print(eenKoffer.getSecondChar());
        System.out.println(eenKoffer.getNumber());

        // BR9 - BS0
        eenKoffer.setCombination('B','R',9);
        eenKoffer.next();
        System.out.print(eenKoffer.getFirstChar());
        System.out.print(eenKoffer.getSecondChar());
        System.out.println(eenKoffer.getNumber());

        // DZ9 - EA0
        eenKoffer.setCombination('D','Z',9);
        eenKoffer.next();
        System.out.print(eenKoffer.getFirstChar());
        System.out.print(eenKoffer.getSecondChar());
        System.out.println(eenKoffer.getNumber());

        // ZZ9 - AA0
        eenKoffer.setCombination('Z','Z',9);
        eenKoffer.next();
        System.out.print(eenKoffer.getFirstChar());
        System.out.print(eenKoffer.getSecondChar());
        System.out.println(eenKoffer.getNumber());
    }
}
