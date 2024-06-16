package Task2;

public interface Figure {
    double calculatePerimeter();
    double calculateArea();
    String getFillColor();
    String getBorderColor();
    void printCharacteristics();

    default void setFillColor(String color) {
        System.out.println("Установлен цвет заливки⁚ " + color);
    }
    default void setBorderColor(String color) {
        System.out.println("Установлен цвет границы⁚ " + color);
    }
}