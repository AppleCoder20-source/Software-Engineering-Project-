//ImageMessage class that implements the Message interface
public class ImageMessage implements Message {
    //Overriding the send method to send a image message
    @Override
    public void send() {
        System.out.println("sending image..");
    }

    public String toString() {

        return "Image file attached";
    }
}

