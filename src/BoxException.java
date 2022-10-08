public class BoxException extends RuntimeException {
    public BoxException(int notFilled) {
        super("Коробка не заполнена! Не хватает предметов: " + notFilled);
    }
}