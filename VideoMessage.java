//VideoMessage class that implements the Message interface
public class VideoMessage implements Message {
    //Overriding the send method to send a video message
    @Override
    public void send() {
        System.out.println("sending video..");
    }

    public String toString() {

        return "Video file attached";
    }
}

