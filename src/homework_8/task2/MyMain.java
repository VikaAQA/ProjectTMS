package homework_8.task2;

public class MyMain {
    public static void main(String[] args) {
        Employers director = new Director();
        Employers worker = new Worker();
        Employers accountant = new Accountant();

        // Выводим должности
        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}

