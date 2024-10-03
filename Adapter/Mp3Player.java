package Adapter;

public class Mp3Player implements AudioPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Reproduzindo arquivo MP3: " + fileName);
        } else {
            System.out.println("Formato não suportado.");
        }
    }
}
