package homework_6;

/*ДЗ 1. Создать класс CreditCard с полями номер счета, текущая сумма на счету Добавьте метод, который позволяет начислять сумму на кредитную карточку.
        Добавьте метод, который позволяет снимать с карточки некоторую сумму.
        Добавьте метод, который выводит текущую информацию о карточке.
        Напишите программу, которая создает три объекта класса CreditCard y которых заданы номер счета и начальная сумма
        Тестовый сценарий для проверки:
        Положите деньги на первые две карточки и снимите с третьей.
        Выведите на экран текущее состояние всех трех карточек*/

public class CreditCard {

    String numberAccount;
    int currentBalance;

    public CreditCard(String numberAccount, int currentBalance) {
        this.numberAccount = numberAccount;
        this.currentBalance = currentBalance;
    }

    // Метод показывает текущий баланс
    public static void showBalance(CreditCard creditCard) {
        System.out.println("Баланс счета " + creditCard.numberAccount + ": " + creditCard.currentBalance + " руб.");
        System.out.println("*****************************************************");
    }

    //Метод пополнения баланса
    public static void addBalance(CreditCard creditCard, int amount) {
        creditCard.currentBalance += amount;
        System.out.println("Внесено на счет " + creditCard.numberAccount + ": " + amount + " руб.");
        showBalance(creditCard);
    }

    //Метод снятия с карты
    public static void withDrawBalance(CreditCard creditCard, int amount) {
        creditCard.currentBalance -= amount;
        System.out.println("Снято со счета " + creditCard.numberAccount + ":  " + amount + " руб.");
        showBalance(creditCard);
    }

    public static void main(String[] args) {
        CreditCard SberCard = new CreditCard("4512 4524 152 4581", 5000);
        CreditCard AlfaCard = new CreditCard("5845 4894 152 4591", 1000);
        CreditCard ZiraatCard = new CreditCard("3656 4524 172 5381", 30000);

        addBalance(SberCard, 500);
        addBalance(AlfaCard, 1000);
        withDrawBalance(ZiraatCard, 5);
    }
}


