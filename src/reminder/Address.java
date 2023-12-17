package reminder;

public class Address extends Contact {
    private final String city;
    private final String address;

    public Address(String name, String city, String address) {
        super(name);
        this.city = city;
        this.address = address;
    }

    @Override
    void sendMessage() {
        System.out.println("Отправим открытку в город " + city + " по адресу: " + address);
    }

    @Override
    void print() {
        System.out.println("Город: " + getCity());
        System.out.println("Адрес: " + getAddress());
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }
}
