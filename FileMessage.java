//FileMessage class that implements the Message interface
public class FileMessage implements Message {
    //Overriding the send method to send a file
    @Override
    public void send() {
        System.out.println("sending file..");
    }

    public String toString() {

        return "File sent";
    }
}


