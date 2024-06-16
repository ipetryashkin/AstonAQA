package Task2;

public class Rectangle implements Figure {
    private double width;
    private double length;
    private String fillColor;
    private String borderColor;

    public Rectangle(double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public void printCharacteristics() {
        System.out.println("Прямоугольник с шириной" + width + " и длиной " + length + " имеет периметр " +
                calculatePerimeter() + ", площадь " + calculateArea() + ", цвет границы " + borderColor +
                ", цвет заливки " + fillColor);
    }
}