package com.company.ClassesPokemons;

import ru.ifmo.se.pokemon.Type;
import com.company.PhysicalMoves.*;


public class Probopass extends Nosepass{
    public Probopass(String name, int level) {
        super(name, level);
        this.setType(Type.ROCK, Type.STEEL);
        this.setStats(60, 55, 145, 75, 150, 40);
        this.addMove(new ShadowSneak());
    }
}
