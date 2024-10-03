package Adapter;

public class Mp4Adapter implements AudioPlayer {

    private Mp4Player mp4Player;

    public Mp4Adapter() {
        this.mp4Player = new Mp4Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMp4(fileName);  
        } else {
            System.out.println("Formato não suportado pelo Adapter.");
        }
    }
}
