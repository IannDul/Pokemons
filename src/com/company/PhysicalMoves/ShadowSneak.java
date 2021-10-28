package com.company.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public class ShadowSneak extends PhysicalMove {
    public ShadowSneak(){
        super(Type.GHOST, 40,100);
    }

    @Override
    protected String describe() {
        return "Использует Shadow Sneak";
    }
}