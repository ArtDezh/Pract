package virtual_pbx;

public class Smartphone extends MobilePhone {

    public Smartphone(String number) {
        super(number);
        makeCall(number, "Telegramm");
        sendEmail("bobik666@gmail.com", "Это текст сообщения.");
    }

    public void makeCall(String targetNumber, String appName) {
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }
}
