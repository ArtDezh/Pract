package virtual_pbx;

public class Smartphone extends MobilePhone {

    public Smartphone(String number) {
        super(number);
    }

    public void makeCall(String targetNumber, String appName) {

    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }
}
