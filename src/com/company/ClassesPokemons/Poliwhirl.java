package com.company.ClassesPokemons;

import ru.ifmo.se.pokemon.Type;
import com.company.SpecialMoves.*;


public class Poliwhirl extends Poliwag {
    public Poliwhirl(String name, int level) {
        super(name, level);
        this.setType(Type.WATER);
        this.setStats(65, 65, 65, 50, 50, 90);
        this.addMove(new SludgeBomb());
    }
}