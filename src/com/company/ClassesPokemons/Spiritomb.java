package com.company.ClassesPokemons;

import com.company.SpecialMoves.*;
import com.company.StatusMoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Spiritomb  extends Pokemon {
    public Spiritomb(String name, int level){
        super (name, level);
        this.setType(Type.GHOST,Type.DARK);
        this.setStats(50, 92, 108, 92, 108, 35);
        this.setMove(new Confusion(), new EnergyBall(), new Psychic(), new Roost());

    }
}
