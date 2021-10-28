package com.company.StatusMoves;

import ru.ifmo.se.pokemon.*;


public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0,0);;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.stat(Stat.SPECIAL_ATTACK,-1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "Использует Confide";
    }
}