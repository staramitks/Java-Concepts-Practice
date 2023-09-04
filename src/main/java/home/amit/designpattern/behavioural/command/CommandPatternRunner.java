package home.amit.designpattern.behavioural.command;

/*
 *
 * Command pattern is a data driven design pattern and falls under behavioral pattern category.
 *  A request is wrapped under an object as command and passed to invoker object.
 *  Invoker object looks for the appropriate object which can handle this command
 *   and passes the command to the corresponding object which executes the command.
 */

public class CommandPatternRunner {

    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);

        //perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }

}
