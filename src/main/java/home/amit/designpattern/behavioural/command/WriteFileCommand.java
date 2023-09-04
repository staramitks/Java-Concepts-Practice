package home.amit.designpattern.behavioural.command;


public class WriteFileCommand implements Command {

    private final FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

}
