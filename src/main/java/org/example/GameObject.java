package org.example;

public class GameObject {
    protected Position position;
    protected Health health;


    public GameObject() {
        this.position = new Position(0);
        this.health = new Health(1000);
    }

    public int getHealth() {
        return this.health.value();
    }

    public void receiveDamage(int damage) {
      this.health = this.health.decreaseBy(damage);
    }

    public boolean isAlive() {
        return !this.health.isDead();
    }

    public int getPosition() {
        return this.position.x();
    }
}
