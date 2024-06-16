package Task1;

public class Bowl {
    private int food;

    public Bowl(int initialFoodInBowl) {
        this.food = initialFoodInBowl;
    }

    public boolean eatFromTheBowl(int amountOfFood) {
        if (amountOfFood <= food) {
            food -= amountOfFood;
            return true;
        } else {
            return false;
        }
    }

    public void addFoodToBowl(int amount) {
        food += amount;
    }

    public int getFood() {
        return food;
    }
}