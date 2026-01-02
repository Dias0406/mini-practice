import java.util.ArrayList;
import java.util.List;

public class ContentDemo {

    public static void main(String[] args) {

        List<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("Java OOP Basics", 2024, 90, "HD"));
        items.add(new VideoLecture("Advanced Java", 2023, 120, "4K"));

        items.add(new PodcastEpisode("Tech Talk", 2022, 45, "John Smith"));
        items.add(new PodcastEpisode("Programming Life", 2021, 60, "Alice Brown"));

        int currentYear = java.time.Year.now().getValue();

        for (ContentItem item : items) {
            System.out.println(
                    item + " | licenseCost=" + item.getLicenseCost(currentYear)
            );

            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println("Max downloads/day: " + d.getMaxDownloadsPerDay());
            }

            System.out.println("------------------------------------------------");
        }
    }
}

