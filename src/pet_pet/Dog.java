package pet_pet;

public class Dog extends Pet {
    public void bringStick() {
        System.out.println("Принес палочку, какой хороший мальчик!");
    }

    @Override
    public void giveVoice() {
        System.out.println("Гав-гав!");
    }
}
