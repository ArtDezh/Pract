package hares;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MountainHare> hares = List.of(
                new MountainHare(4, 4.4, 120),
                new MountainHare(7, 3.6, 150),
                new MountainHare(1, 2.3, 100)
        );

        System.out.println("В лесу лето!");
        Forest.setSeason("лето");
        Forest forestSummer = new Forest(hares);

        System.out.println("Список зайцев:");
        forestSummer.printHares();

        System.out.println("В лесу зима!");
        Forest.setSeason("зима");
        forestSummer.printHares();
    }
}
