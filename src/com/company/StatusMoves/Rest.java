package com.company.StatusMoves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0,0);;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);
        pokemon.setMod(Stat.HP, (int)(-(pokemon.getStat(Stat.HP))));

    }

    @Override
    protected String describe() {
        return "Использует Rest";
    }
}