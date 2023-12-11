import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Music {
    public void shuffle(List<Song> songs) {
        List<Integer> solution = new ArrayList<>();
        for (int i = 1; i <= songs.size(); i++) {
            solution.add(i);
        }
        Collections.shuffle(solution);

        System.out.println("Воспроизведение в случайном порядке:");
        for (Integer index : solution) {
            System.out.println(songs.get(index - 1));
        }
    }

    static class Song {
        private String name;
        private String executor;
        private double duration;

        public Song(String name, String executor, double duration) { //Сохраняет название итд
            this.name = name;
            this.executor = executor;
            this.duration = duration;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Название: " + name + ", Исполнитель: " + executor + ", Длительность: " + duration;
        }
    }
    public static void buySubscribe() {
        try {
            Desktop d=Desktop.getDesktop();

            d.browse(new URI(
                    String.format(
                            "https://www.youtube.com/watch?v=oSVrKAFLkis&ab_channel=Molixai",
                            URLEncoder.encode( "UTF8" )
                    )
            ));
        } catch (IOException | URISyntaxException ioe) {
            System.out.println("Hahahaha");
        }
    }

}