package homework_10;

/*
Основное задание
1. Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат хххх-ууу-хххх-ууу-хуху, где х — это число, а у — это буква.
Вывести на экран в одну строку два первых блока по 4 цифры.
Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
Вывести на экран только одни буквы из номера документа в формате ууу/ууу/у/у в нижнем регистре.
Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и АВС считается одинаковой последовательностью).
Проверить начинается ли номер документа с последовательности 555.
Проверить заканчивается ли номер документа на последовательность 1а2b.
Все эти методы реализовать в отдельном классе в статических методах, которые на вход (входным параметром) будут принимать вводимую на вход программы строку.
 */

public class Document {

    // 1. Выводит на экран в одну строку два первых блока по 4 цифры.

    public static void printFirstTwoDigitBlocks(String docNumber) {
        String[] parts = docNumber.split("-");
        System.out.println(parts[0] + parts[2]);
    }

     // 2. Выводит на экран номер документа, но блоки из трех букв заменяет на ***.

    public static void printWithMaskedLetters(String docNumber) {
        String[] parts = docNumber.split("-");
        // Заменяем второй и четвертый блоки (индексы 1 и 3)
        parts[1] = "***";
        parts[3] = "***";
        System.out.println(String.join("-", parts));
    }

     // 3. Выводит на экран только буквы из номера документа в формате ууу/ууу/у/у в нижнем регистре.

    public static void printLettersLowercase(String docNumber) {
        // Убираем все, кроме букв, и приводим к нижнему регистру
        String letters = docNumber.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Формируем строку в нужном формате
        String result = letters.substring(0, 3) + "/" +
                letters.substring(3, 6) + "/" +
                letters.charAt(6) + "/" +
                letters.charAt(7);
        System.out.println(result);
    }

    // 4. Выводит на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре.

    public static void printLettersUppercase(String docNumber) {
        // Убираем все, кроме букв, и приводим к верхнему регистру
        String letters = docNumber.replaceAll("[^a-zA-Z]", "").toUpperCase();

        StringBuilder sb = new StringBuilder("Letters:");
        sb.append(letters.substring(0, 3));
        sb.append("/");
        sb.append(letters.substring(3, 6));
        sb.append("/");
        sb.append(letters.charAt(6));
        sb.append("/");
        sb.append(letters.charAt(7));

        System.out.println(sb.toString());
    }

     // 5. Проверяет, содержит ли номер документа последовательность "abc" (регистронезависимо).

    public static void checkContainsAbc(String docNumber) {
        // Приводим строку к нижнему регистру для регистронезависимого поиска
        if (docNumber.toLowerCase().contains("abc")) {
            System.out.println("Номер документа содержит последовательность 'abc'.");
        } else {
            System.out.println("Номер документа не содержит последовательность 'abc'.");
        }
    }

    //6. Проверяет, начинается ли номер документа с последовательности "555".

    public static void checkStartsWith555(String docNumber) {
        if (docNumber.startsWith("555")) {
            System.out.println("Номер документа начинается с '555'.");
        } else {
            System.out.println("Номер документа не начинается с '555'.");
        }
    }

   // 7. Проверяет, заканчивается ли номер документа на последовательность "1a2b".

    public static void checkEndsWith1a2b(String docNumber) {
        // Приводим строку к нижнему регистру для регистронезависимой проверки
        if (docNumber.toLowerCase().endsWith("1a2b")) {
            System.out.println("Номер документа заканчивается на '1a2b'.");
        } else {
            System.out.println("Номер документа не заканчивается на '1a2b'.");
        }
    }
}

