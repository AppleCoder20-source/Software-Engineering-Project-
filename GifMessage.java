//GifMessage class that implements the Message interface
public class GifMessage implements Message {
    //Overriding the send method to send a GIF message
    @Override
    public void send() {
        System.out.println("sending GIF..");
    }

    public String toString() {

        return "GIF sent";
    }
}

