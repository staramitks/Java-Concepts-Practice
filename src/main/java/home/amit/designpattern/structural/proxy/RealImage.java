package home.amit.designpattern.structural.proxy;

public class RealImage implements Image {

    private final String fileName;

    public RealImage(String file) {

        this.fileName = file;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName2) {
        System.out.println("Took quite some time to load it");
    }

    @Override
    public void display() {
        System.out.println("Display Image from RealImage " + fileName);
    }


}
