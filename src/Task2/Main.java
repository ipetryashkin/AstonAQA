package Task2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "Салатовый", "Зеленый");
        System.out.println("Круг:");
        circle.printCharacteristics();
//      Дефолтный метод
//        circle.setBorderColor("Черный");
//        circle.setFillColor("Серый");

        Rectangle rectangle = new Rectangle(1.0, 2.0, "Розовый", "Красный");
        System.out.println("Прямоугольник:");
        rectangle.printCharacteristics();

        Triangle triangle = new Triangle(1.0, 2.0, 3.0, "Голубой", "Синий");
        System.out.println("Треугольник:");
        triangle.printCharacteristics();
    }
}
