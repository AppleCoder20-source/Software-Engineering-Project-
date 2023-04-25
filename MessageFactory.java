//Factory class to instantiate Message implementations according to message types
public class MessageFactory {
    //static method takes a MessageType and returns the appropriate message instance based on messageType
    public static Message createMessage(MessageType messageType) {
        return switch (messageType) {
            case TEXT -> new TextMessage();
            case IMAGE -> new ImageMessage();
            case VIDEO -> new VideoMessage();
            case AUDIO -> new AudioMessage();
            case GIF -> new GifMessage();
            case FILE -> new FileMessage();
            default -> throw new IllegalArgumentException("Message type not supported");
        };
    }
}