package com.company;

import com.company.ClassesPokemons.*;
import ru.ifmo.se.pokemon.*;


public class Pokemons {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Spiritomb("Agent K", 1);
        Pokemon p2 = new Nosepass("Lion Alex", 1);
        Pokemon p3 = new Probopass("Andrew", 1);
        Pokemon p4 = new Poliwag("Jordan Belfort", 1);
        Pokemon p5 = new Poliwhirl("Bugs Bunny", 1);
        Pokemon p6 = new Politoed("Shrek", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);


        b.go();

    }
}
