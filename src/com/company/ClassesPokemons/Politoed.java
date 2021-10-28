package com.company.ClassesPokemons;

import ru.ifmo.se.pokemon.Type;
import com.company.StatusMoves.*;


public class Politoed extends Poliwhirl {
    public Politoed(String name, int level) {
        super(name, level);
        this.setType(Type.WATER);
        this.setStats(90, 75, 75, 90, 100, 70);
        this.addMove(new Confide());
    }
}