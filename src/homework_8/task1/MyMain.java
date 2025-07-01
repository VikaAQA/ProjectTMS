package homework_8.task1;

public class MyMain {
    public static void main(String[] args) {
        // 1. Создаем массив из 5 фигур.
        Figure[] figures = new Figure[5];

        // 2. Заполняем массив разными фигурами.
        figures[0] = new Circle(10);
        figures[1] = new Rectangle(5, 8);
        figures[2] = new Triangle(3, 4, 5,9);
        figures[3] = new Rectangle(7, 7);
        figures[4] = new Circle(1.5);

        // 3. Считаем сумму периметров всех фигур в массиве.
        double totalPerimeter = 0;

        // Используем цикл for-each для перебора всех фигур в массиве.
        for (Figure figure : figures) {
            System.out.printf("Периметр фигуры %s: %.2f\n", figure.getClass().getSimpleName(), figure.getPerimeter());
            totalPerimeter += figure.getPerimeter();
        }

        System.out.println("------------------------------------");
        System.out.printf("Сумма периметров всех фигур в массиве: %.2f\n", totalPerimeter);
    }
}
