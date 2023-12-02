package pet_pet;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catchMouse();
        cat.giveVoice();

        Dog dog = new Dog();
        dog.bringStick();
        dog.play();

        Hamster hamster = new Hamster();
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish();
        fish.sleep();
        System.out.println("У рыбки " + fish.getPawsCount() + " лапок.");

        Spider spider = new Spider();
        spider.setPawsCount(8);
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
    }
}
