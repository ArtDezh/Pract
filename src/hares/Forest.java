package hares;

import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private static String season;

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason(String newSeason) {
        if (newSeason.equals("зима")) {
            MountainHare.setColor("белый");
        } else MountainHare.setColor("серо-рыжий");
    }

    public void printHares() {
        for (MountainHare hare: hares) {
            System.out.println(hare);
        }
    }
}
