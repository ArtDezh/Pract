package reminder;

public class Phone extends Contact {
    private final String phoneNumber;

    public Phone(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    void sendMessage() {
        System.out.println("Звоним другу по номеру " + phoneNumber + " и зовем на кофе.");
    }

    @Override
    void print() {
        System.out.println("Номер телефона: " + getPhoneNumber());
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
