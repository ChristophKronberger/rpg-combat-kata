package org.example;

public record Position(int x){

    public Position left() {
        return  new Position(this.x-1);
    }
    public Position right() {
        return  new Position(this.x+1);
    }
}
