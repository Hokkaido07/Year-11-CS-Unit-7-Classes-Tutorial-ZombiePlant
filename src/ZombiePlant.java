/**
 * This is Tutorial 1.2 Zombie Plant
 * Author: Alexis Chiu
 * Date: 01-22-2024
 */

public class ZombiePlant {
    //properties
    private final int maxPotency;
    private int treatmentsNumber;

    //constructor

    public ZombiePlant(int maxPotency, int treatmentsNumber) {
        this.maxPotency = maxPotency;
        this.treatmentsNumber = treatmentsNumber;
    }

    public int getPotency() {
        return maxPotency;
    }

    public int treatmentsNeeded() {
        return treatmentsNumber;
    }

    public boolean isDangerous() {
        return treatmentsNumber > 0;
    }

    public void treat(int potency) {
        if (potency > maxPotency) {
            treatmentsNumber++;
        } else if (potency > 0 && treatmentsNumber > 0) {
            treatmentsNumber--;
        }
    }
}