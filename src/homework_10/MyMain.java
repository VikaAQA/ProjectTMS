package homework_10;

public class MyMain {

    public static void main(String[] args) {
        // Входная строка - номер документа
        String docNumber = "5554-Abc-5678-dEf-1a2b";

        System.out.println("Входная строка: " + docNumber);
        System.out.println("---------------------------------------------------------");

        // 1. Вывести два первых блока по 4 цифры
        System.out.print("1. Два первых блока цифр: ");
        Document.printFirstTwoDigitBlocks(docNumber);

        // 2. Вывести с заменой буквенных блоков
        System.out.print("2. Номер с заменой: ");
        Document.printWithMaskedLetters(docNumber);

        // 3. Вывести буквы в нижнем регистре
        System.out.print("3. Буквы в нижнем регистре: ");
        Document.printLettersLowercase(docNumber);

        // 4. Вывести буквы в верхнем регистре через StringBuilder
        System.out.print("4. Буквы в верхнем регистре: ");
        Document.printLettersUppercase(docNumber);

        // 5. Проверить на "abc"
        System.out.print("5. Проверка на 'abc': ");
        Document.checkContainsAbc(docNumber);

        // 6. Проверить, начинается ли с "555"
        System.out.print("6. Проверка на начало '555': ");
        Document.checkStartsWith555(docNumber);

        // 7. Проверить, заканчивается ли на "1a2b"
        System.out.print("7. Проверка на конец '1a2b': ");
        Document.checkEndsWith1a2b(docNumber);
    }
}

