package Task1;

public class Animal {
    String name;
    static int animalCount;

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }
    public Animal(String name) {
        this.name = name;
        animalCount++;
    }
    public static int getAnimalCount() {
        return animalCount;
    }
}