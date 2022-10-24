package org.example;

public record Health(int value) {

    public Health increaseBy(int value) {
        if (isDead()) return this;
        int expectedHealth = this.value()+value;

        return expectedHealth >= 1000 ? new Health(1000) : new Health(expectedHealth);

    }

    public Health decreaseBy(int value){
        if (isDead()) return this;
        int expectedHealth = this.value()-value;
        if(expectedHealth <= 0) return new Health(0);
        return new Health(expectedHealth);
    }

    public boolean isDead() {
        return this.value <= 0;
    }

}
