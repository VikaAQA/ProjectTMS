package homework_9;

/* создать свои классы исключений на каждую ситуацию:
Проверить содержит ли номер документа последовательность abc.
Проверить начинается ли номер документа с последовательности 555.
Проверить заканчивается ли номер документа на последовательность 1a2b.
Если номер документа не удовлетворяет условию - то "бросить" исключение.
B методе класса, в котором будут вызываться эти методы для
демонстрации работы, перехватить исключение конструкцией try-catch и в блоке catch вывести сообщение для пользователя (сообщение на консоль).*/

public class Method {
    // Проверка на наличие "abc"
    public static void checkContainsABC(String docNumber) throws NoABCException {
        if (!docNumber.contains("abc")) {
            throw new NoABCException("Документ не содержит последовательность 'abc'.");
        }
    }

    // Проверка на начало с "555"
    public static void checkStartsWith555(String docNumber) throws NoStartWith555Exception {
        if (!docNumber.startsWith("555")) {
            throw new NoStartWith555Exception("Документ не начинается с '555'.");
        }
    }

    // Проверка на окончание на "1a2b"
    public static void checkEndsWith1a2b(String docNumber) throws NoEndWith1a2bException {
        if (!docNumber.endsWith("1a2b")) {
            throw new NoEndWith1a2bException("Документ не заканчивается на '1a2b'.");
        }
    }

    // Метод для демонстрации работы
    public static void validateDocument(String docNumber) {
        try {
            checkContainsABC(docNumber);
            checkStartsWith555(docNumber);
            checkEndsWith1a2b(docNumber);
            System.out.println("Документ \"" + docNumber + "\" прошёл все проверки.");
        } catch (NoABCException | NoStartWith555Exception | NoEndWith1a2bException e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
        }
    }
    public static void main(String[] args) {

        String[] documents = {
                "555abc1231a2b",     // Валидный
                "123abc9991a2b",     // Не начинается с 555
                "555xyz1231a2b",     // Не содержит abc
                "555abc123xyz"       // Не заканчивается на 1a2b
        };

        for (String doc : documents) {
            System.out.println("Проверка документа: " + doc);
            Method.validateDocument(doc);
            System.out.println();
        }
    }
}


