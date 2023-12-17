package reminder;

import java.util.ArrayList;
import java.util.List;

public class ContactBook<T extends Contact> {
    List<T> contacts = new ArrayList<>();

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
        for (T contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
            System.out.println();
        }
    }

    public void congratulate(String name) {
        boolean contactPresented = false;
        for (T contact : contacts) {
            contactPresented = contact.getName().equals(name);
            if (contactPresented) {
                System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
                contact.sendMessage();
                return;
            }
        }
        if (!contactPresented) System.out.println("Не найден контакт с указанным именем.");
    }
}
