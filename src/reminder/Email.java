package reminder;

public class Email extends Contact {
    private final String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    void sendMessage() {
        System.out.println("Отправим новогоднюю картинку коллеге на электронную почту " + email);
    }

    @Override
    void print() {
        System.out.println("Email: " + getEmail());
    }

    public String getEmail() {
        return email;
    }
}
