public class Dog extends Animal {
    @Override
    public void run(int distance) {
        if distance > 500 {
            System.out.println("Слишком большая дистанция");
        }
        else{
            System.out.println("Собака пробежала " + distance + " м.")
        }
    }

    @Override
    public void run(int distance) {
        if distance > 10 {
            System.out.println("Слишком большая дистанция");
        }
        else{
            System.out.println("Собака пробежала " + distance + " м.")
        }
    }
}
