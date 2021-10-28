package com.company.ClassesPokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import com.company.StatusMoves.*;
import com.company.PhysicalMoves.*;


public class Nosepass  extends Pokemon {
    public Nosepass(String name, int level){
        super (name, level);
        this.setType(Type.ROCK);
        this.setStats(30, 45, 135, 45, 90, 30);
        this.setMove(new Rest(), new Swagger(), new Facade());

    }
}
