package reminder;

public class Main {
    public static void main(String[] args) {
        ContactBook<Contact> cb = new ContactBook<>();
        cb.addContact(new Phone("Pitter", "+1123456789"));
        cb.addContact(new Email("Archi", "pimp123@gmail.com"));
        cb.addContact(new Address("Kate", "Boston", "1st/45-5"));
        cb.addContact(new SocialNetworkContact("Bob", "Telegram", "ltp_man1"));

        cb.printList();
        System.out.println();
        cb.congratulate("Kate");
    }
}
