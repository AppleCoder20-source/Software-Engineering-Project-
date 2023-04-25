//TextMessage class that implements the Message interface
public class TextMessage implements Message {
   //Overriding the send method to send a text message
    @Override
    public void send() {
        System.out.println("sending message..");
    }
    public String toString() {
        return "Message sent";
    }
}
