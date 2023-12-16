package virtual_pbx;

public class MobilePhone extends Phone {
    public MobilePhone(String number) {
        super(number);
        sendSms(number, "Привет! Это текстовое сообщение.");
    }

    public final void sendSms(String targetNumber, String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}
