package pet_pet;

public class Hamster extends Pet {
    public void hideFood() {
        System.out.println("Вся еда - в щечках");
    }

    @Override
    public void giveVoice() {
        System.out.println("Пи-пи-пи!");
    }
}
