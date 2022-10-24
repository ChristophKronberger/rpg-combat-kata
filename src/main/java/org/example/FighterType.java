package org.example;

public enum FighterType {
    RANGED (20),
    MELEE(2);

    public final int range;

    FighterType(int range) {
        this.range = range;
    }
}
