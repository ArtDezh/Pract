package transaction_valid;

public class TransactionValidator {
    public static final double MIN_AMOUNT = 1;
    public static final double MAX_AMOUNT = 5000;

    public static boolean isValidAmount(double sum) {
        if (sum >= MIN_AMOUNT && sum <= MAX_AMOUNT) {
            return true;
        } else {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
    }
}
