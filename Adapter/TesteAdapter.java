package Adapter;

public class TesteAdapter {
    public static void main(String[] args) {
    
        AudioPlayer mp3Player = new Mp3Player();
        mp3Player.play("mp3", "musica.mp3");
        
        AudioPlayer mp4Player = new Mp4Adapter();
        mp4Player.play("mp4", "video.mp4");
    }
}

