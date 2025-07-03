package homework_9;

// Исключение, если не заканчивается на "1a2b"
class NoEndWith1a2bException extends Exception {
    public NoEndWith1a2bException(String message) {
        super(message);
    }
}
