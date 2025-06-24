package homework_7;

/*Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса. Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр - имя звонящего.
Выводит на консоль сообщение "Звонит (name)". getNumber - возвращает номер телефона.
Вызвать эти методы для каждого из объектов.
Добавить конструктор в класс Phone, который принимает на вход три
параметра для инициализации переменных класса - number, model и
weight.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавьте перегруженный метод receiveCall, который принимает два
параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
Создать метод sendMessage с аргументами переменной длины.
Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
Метод выводит на консоль номера этих телефонов.*/

public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight) {
        this(number, model);//Вызов консруктора с двумя параметрами
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() { //конструктор без параметров
    }

    public static void receiveCall(String name) {
        System.out.println("Вам звонит " + name);
    }

    public static void receiveCall(String name, int number) {
        System.out.println("Вам звонит " + name + ". Номер телефона " + number);
    }

    private int getNumber() {
        return this.number;
    }

    public static void sendMessage(int... phoneNumbers) {
        for (int num : phoneNumbers) {
            System.out.println("Номера для отправки сообщения " + num);
        }
    }

    public static void main(String[] args) {
        Phone Samsung = new Phone(895479621, "XXX_12", 85);
        Phone Windows = new Phone(895784121, "SKG_55");
        Phone Xiaomi = new Phone();

        System.out.println("Phone1: " + Samsung.getNumber() + ", " + Samsung.model + ", " + Samsung.weight);
        System.out.println("Phone2: " + Windows.getNumber() + ", " + Windows.model + ", " + Windows.weight);
        System.out.println("Phone3: " + Xiaomi.getNumber() + ", " + Xiaomi.model + ", " + Xiaomi.weight);
        receiveCall("Виктор");
        receiveCall("Анна", 909897880);
        sendMessage(902457952, 902546123, 904125311);

    }
}

