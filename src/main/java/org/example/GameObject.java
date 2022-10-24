package org.example;

public class GameObject {
    protected Position position;
    protected NewHealth newhealth;


    public GameObject() {
        this.position = new Position(0);
        this.newhealth = new NewHealth(1000);
    }

    public int getHealth() {
        return this.newhealth.value();
    }

    public void receiveDamage(int damage) {
      this.newhealth = this.newhealth.decreaseBy(damage);
    }

    public boolean isAlive() {
        return !this.newhealth.isDead();
    }

    public int getPosition() {
        return this.position.x();
    }
}
