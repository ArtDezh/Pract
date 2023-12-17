package reminder;

public class SocialNetworkContact extends Contact {
    private final String socialNetwork;
    private final String username;

    public SocialNetworkContact(String name, String socialNetwork, String username) {
        super(name);
        this.socialNetwork = socialNetwork;
        this.username = username;
    }

    @Override
    void sendMessage() {
        System.out.println("Отправим забавный стикер одногруппнику в соцсети " + socialNetwork + ", имя пользователя " + username);
    }

    @Override
    void print() {
        System.out.println("Социальная сеть: " + getSocialNetwork());
        System.out.println("Имя пользователя: " + getUsername());
    }

    public String getSocialNetwork() {
        return socialNetwork;
    }

    public String getUsername() {
        return username;
    }
}
