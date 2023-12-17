package online_cinema;

import java.util.List;

public class Calculator {
    private Calculator() {

    }

    public static int calculate(List<MediaItem> mediaItems) {
        int countDays = 0;

        for (MediaItem mi : mediaItems) {
            if (mi instanceof Movie) {
                countDays += mi.getRuntime();
            }
            if (mi instanceof Series) {
                countDays += mi.getRuntime() * ((Series) mi).getSeriesCount();
            }
        }
        return countDays / (60 * 24); // Преобразуем из минут в дни
    }
}
