package org.example;

public record Level(int value) {

    public Level levelUp(int value){
        return new Level(this.value() + value);
    }

    public boolean isAtLeastFiveLevelLower(Character other) {
        return this.value() >= other.getLevel() + 5;
    }
    private boolean isAtLeastFiveLevelHigherThan(Character other) {
        return this.value() <= other.getLevel() - 5;
    }

    public double getMultiplicator(Character other) {
        if (isAtLeastFiveLevelLower(other)) {
            return 1.5;
        } else if (isAtLeastFiveLevelHigherThan(other)) {
            return 0.5;
        }
        return 1;
    }
}
