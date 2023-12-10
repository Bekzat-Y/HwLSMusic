import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            ArrayList<Music.Song> songs = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            Music music = new Music();

            int choose;
            do {
                System.out.println("Выберите действие:");
                System.out.println("1. Добавить песню");
                System.out.println("2. Удалить песню");
                System.out.println("3. Перемешать песню");
                System.out.println("4. Купить подписку)");
                System.out.println("5. Выход");

                System.out.print("Ваш выбор: ");

                choose = scanner.nextInt();
                scanner.nextLine();

                switch (choose) {
                    case 1: {
                        System.out.print("Сколько песен вы хотите добавить: ");
                        int numberOfSongs = scanner.nextInt();
                        scanner.nextLine();

                        for (int i = 0; i < numberOfSongs; i++) {
                            System.out.print("Введите название песни: ");
                            String songName = scanner.nextLine();

                            System.out.print("Введите исполнителя: ");
                            String executor = scanner.nextLine();

                            System.out.print("Введите длительность песни: ");
                            double songDuration = scanner.nextDouble();
                            scanner.nextLine();

                            Music.Song song = new Music.Song(songName, executor, songDuration);
                            songs.add(song);
                        }

                        System.out.println("Вами введенные песни:");
                        for (Music.Song song : songs) {
                            System.out.println(song);
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Введенные песни до удаления:");
                        for (Music.Song song : songs) {
                            System.out.println(song);
                        }

                        System.out.print("Введите название песни для удаления: ");
                        String soundNameToDelete = scanner.nextLine();

                        songs.removeIf(song -> song.getName().equals(soundNameToDelete));

                        System.out.println("Введенные песни после удаления:");
                        for (Music.Song song : songs) {
                            System.out.println(song);
                        }
                        break;
                    }
                    case 3: {
                        music.shuffle(songs);
                        break;
                    }
                    case 4: {
                        Music.buySubscribe();
                        break;
                    }
                    case 5:{
                        System.out.println("Завершение программы.");


                    }
                    default: {
                        System.out.println("Введите допустимую опцию.");
                        break;
                    }
                }
            } while (choose != 5);

            scanner.close();
        }


}


