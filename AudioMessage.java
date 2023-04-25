//AudioMessage class that implements the Message interface
public class AudioMessage implements Message {
    //Overriding the send method to send audio message
    @Override
    public void send() {
        System.out.println("sending audio..");
    }

    public String toString() {

        return "Audio file attached";
    }
}