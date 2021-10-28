package com.company.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {
    public Roost() {
        super(Type.FLYING, 0,0);;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.getStat(Stat.HP);
        if(pokemon.getStat(Stat.HP) * 0.5 > pokemon.getHP()){
            pokemon.setMod(Stat.HP, (int)(-(pokemon.getStat(Stat.HP) * 0.5 - pokemon.getHP())));
        }
    }

    @Override
    protected String describe() {
        return "Использует Roost";
    }
}