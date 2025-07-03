package homework_9;

// Исключение, если не начинается с "555"
class NoStartWith555Exception extends Exception {
    public NoStartWith555Exception(String message) {
        super(message);
    }
}
