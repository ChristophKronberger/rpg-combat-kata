package org.example;

public record Range(FighterType type) {

    public int getRange(){
        if(type == FighterType.MELEE)return 2;
        if(type == FighterType.RANGED) return 20;
        else return 0;
    }
}
