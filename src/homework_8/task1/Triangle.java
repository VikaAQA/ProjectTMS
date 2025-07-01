package homework_8.task1;

import homework_8.task1.Figure;

public class Triangle extends Figure {
    private final double base;   // основание
    private final double height; // высота
    private final double sideA;  // сторона 1
    private final double sideB;  // сторона 2

    public Triangle(double base, double height, double sideA, double sideB) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getSquare() {
        // Формула: (основание * высота) / 2
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        // Периметр = основание + сторона1 + сторона2
        return base + sideA + sideB;
    }
}

