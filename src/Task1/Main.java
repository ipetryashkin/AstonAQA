package Task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурка",10);
        Dog dog = new Dog("Лайка");
        Cat cat1 = new Cat("Маська",5);
        Dog dog1 = new Dog("Стрелка");
        Cat cat2 = new Cat("Дымка",15);
        cat.run(150);
        dog.run(201);
        cat1.swim(500);
        dog1.swim(501);
        cat2.run(25);

        Bowl bowl= new Bowl(10);

        Cat[] cats = new Cat[3];
        cats[0] = cat;
        cats[1] = cat1;
        cats[2] = cat2;

        bowl.addFoodToBowl(30);

        for (int i=0; i<cats.length; i++){
            cats[i].eat(bowl);
            if (cats[i].isSatiety()) {
                System.out.println(cats[i].name + " сытая");
            }
            else {
                System.out.println(cats[i].name + " голодная");
            }
        }
        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество кошек: " + Cat.getCatCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
    }
}