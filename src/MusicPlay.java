import javazoom.jl.player.Player;

import java.io.FileInputStream;

public class MusicPlay {

    public void SimplePlayer(){//первый трек

        try{

            FileInputStream fis = new FileInputStream("/home/bekzat-lin/Загрузки/Nirvana - Something In The Way.mp3");
            Player playMP3 = new Player(fis);

            playMP3.play();

        }  catch(Exception e){
            System.out.println(e);
        }
    }
    public void SecondMusic(){//второй трек

        try{

            FileInputStream fis = new FileInputStream("/home/bekzat-lin/Загрузки/Серегапират-минер_(muzmo.su).mp3");
            Player playMP3 = new Player(fis);

            playMP3.play();

        }  catch(Exception e){
            System.out.println(e);
        }
    }
    public void ThreeSound(){//третий трек

        try{

            FileInputStream fis = new FileInputStream("/home/bekzat-lin/Загрузки/Серегапират-минер_(muzmo.su).mp3");
            Player playMP3 = new Player(fis);

            playMP3.play();

        }  catch(Exception e){
            System.out.println(e);
        }
    }
}


