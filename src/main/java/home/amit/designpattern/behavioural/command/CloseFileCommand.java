package home.amit.designpattern.behavioural.command;


public class CloseFileCommand implements Command {

    private final FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }

}
