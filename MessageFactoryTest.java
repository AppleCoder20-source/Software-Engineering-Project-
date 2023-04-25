// 2 unit tests of the MessageFactory class
import static org.junit.jupiter.api.Assertions.*;

class MessageFactoryTest {
    // This test checks if the createMessage() method is actually instantiating a TextMessage when given TEXT message type
    @org.junit.jupiter.api.Test
    void testCreateTextMessage() {
        Message message = MessageFactory.createMessage(MessageType.TEXT);
        assertEquals(TextMessage.class, message.getClass());
    }
    // This test checks if the createMessage() method is actually instantiating a ImageMessage when given IMAGE message type
    @org.junit.jupiter.api.Test
    void testCreateImageMessage() {
        Message message = MessageFactory.createMessage(MessageType.IMAGE);
        assertEquals(ImageMessage.class, message.getClass());
    }
}