package homework_8.task1;

import homework_8.task1.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {//Формула подсчета площади S = π × r²
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {//Формула подсчета периметра C = 2 · π · r
        return 2 * Math.PI * radius ;
    }
}
