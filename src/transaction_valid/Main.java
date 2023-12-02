package transaction_valid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в рублях.");

        double in = scanner.nextDouble();
        boolean isValid = TransactionValidator.isValidAmount(in);
        if (isValid) {
            System.out.println("Спасибо! Ваш перевод на сумму " + in + " р. успешно выполнен.");
        }
    }
}
