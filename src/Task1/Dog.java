package Task1;

public class Dog extends Animal {
    static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Слишком большая дистанция");
        } else {
            System.out.println("Собака " + name + " пробежала " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Слишком большая дистанция");
        } else {
            System.out.println("Собака " + name + " проплыла " + distance + " м.");
        }
    }
    public static int getDogCount() {
        return dogCount;
    }
}