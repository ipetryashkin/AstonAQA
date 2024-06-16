package Task1;

public class Cat extends Animal {
    int portion;
    boolean satiety = false;
    static int catCount = 0;

    public Cat(String name, int portion) {
        super(name);
        this.portion = portion;
        catCount++;
    }

    public void eat(Bowl bowl) {
        if (bowl.getFood() >= portion) {
            bowl.eatFromTheBowl(portion);
            satiety = true;
            System.out.println("Кошка " + name + " поела");
        } else {
            System.out.println("В миске недостаточно еды, кошка " + name + " голодная");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Слишком большая дистанция");
        } else {
            System.out.println("Кошка " + name + " пробежала " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кошка " + name + " не умеет плавать");
    }
    public static int getCatCount() {
        return catCount;
    }
}