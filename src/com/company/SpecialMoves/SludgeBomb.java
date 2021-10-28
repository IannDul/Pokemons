package com.company.SpecialMoves;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb(){
        super(Type.POISON, 90,100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3){
            if (pokemon.hasType(Type.POISON) || pokemon.hasType(Type.STEEL)){
                Effect.poison(pokemon);
            }
        }
    }

    @Override
    protected String describe() {
        return "Использует Sludge Bomb";
    }
}