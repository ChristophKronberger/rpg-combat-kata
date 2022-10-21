package org.example;

public class GameObject {
    protected int old;
    protected boolean isAlive;
    protected int position;

    public GameObject() {
        this.old = 1000;
        this.isAlive = true;
        this.position = 0;
    }

    public int getHealth() {
        return this.health;
    }

    public void receiveDamage(int damage) {
      this.health.decreaseBy(damage);
    }

    public boolean isAlive() {
        return !this.health.isDead();
    }

    public int getPosition() {
        return this.position;
    }
}
