package homework_11;

public class MyMain {

    public static void main(String[] args) {
        // Создаем кастомный ArrayList
        MyArrayList<String> list = new MyArrayList<>();

        // Добавляем элементы
        list.add("Apple");
        list.add("Banana");
        list.add(1, "Orange"); // Добавляем по индексу

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Element at 0: " + list.get(0));
        System.out.println("Contains 'Banana': " + list.contains("Banana"));

        // Удаляем элемент
        String removed = list.remove(1);
        System.out.println("Removed: " + removed);
        System.out.println("List after removal: " + list);

        // Очищаем коллекцию
        list.clear();
        System.out.println("List after clear: " + list);
        System.out.println("Is empty: " + list.isEmpty());
    }
}

