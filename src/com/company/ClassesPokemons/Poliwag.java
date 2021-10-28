package com.company.ClassesPokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import com.company.StatusMoves.*;
import com.company.PhysicalMoves.*;


public class Poliwag  extends Pokemon {
    public Poliwag(String name, int level){
        super (name, level);
        this.setType(Type.WATER);
        this.setStats(40, 50, 40, 40, 40, 90);
        this.setMove(new Swagger(), new Facade());

    }
}
