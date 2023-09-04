package home.amit.designpattern.structural.adapter;

public class MP4Player implements AdvancedMediaPlayer {


    @Override
    public void playVlc(String fileName) {
        //System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file. Name: " + fileName);
    }


}
