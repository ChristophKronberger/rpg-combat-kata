package org.example;

public record NewHealth (int value) {

    public NewHealth increaseBy(int value) {
        if (isDead()) return this;
        int expectedHealth = this.value()+value;

        if(expectedHealth >= 1000) {
            return new NewHealth(1000);
        } else {
            return new NewHealth(expectedHealth);
        }
    }

    public NewHealth decreaseBy(int value){
        if (isDead()) return this;
        int expectedHealth = this.value()-value;
        if(expectedHealth <= 0) return new NewHealth(0);
        return new NewHealth(expectedHealth);
    }

    public boolean isDead() {
        return this.value <= 0;
    }

}
