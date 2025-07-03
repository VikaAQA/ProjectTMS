package homework_9;


// Исключение, если не содержит "abc"
class NoABCException extends Exception {
    public NoABCException(String message) {
        super(message);
    }
}
