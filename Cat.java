public class Cat extends Animal {
    @Override
    public void run(int distance) {
        if distance > 200 {
            System.out.println("Слишком большая дистанция");
        }
        else{
            System.out.println("Кошка пробежала " + distance + " м.")
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кошка не умеет плавать");
    }
}
