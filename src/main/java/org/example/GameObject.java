package org.example;

public class GameObject {
    protected int old;
    protected boolean isAlive;
    protected int position;
    protected Health health;

    public GameObject() {
        this.old = 1000;
        this.isAlive = true;
        this.position = 0;
        this.health = new Health(1000);
    }

    public int getHealth() {
        return this.health.getValue();
    }

    public void receiveDamage(int damage) {
      this.health.decreaseBy(damage);
    }

    public boolean isAlive() {
        return !this.health.isDead();
    }

    public int getPosition() {
        return this.position.x();
    }
}
