package org.example;

public class Health {

    private  int value;

    public Health(int value) {
        this.value = value;
    }
    
    public void increaseBy(int value) {
        if (isDead()) return;
        this.value += value;
        if (this.value > 1000) {
            this.value = 1000;
        }
    }

    public void decreaseBy(int value){
        this.value -= value;
        if (isDead()) {
            this.value = 0;
        }
    }

    public boolean isDead() {
        return this.value <= 0;
    }

    public int getValue() {
        return value;
    }
}
