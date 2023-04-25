
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageDecoratorTest {
    private Message message;

    @BeforeEach
    public void setUp() {
        message = new TextMessageDecorator("Hello! How is it going?", "Sophia");
    }

    @Test
    public void testEmojiMessageDecorator() {
        // Create an EmojiMessageDecorator and wrap the original message
        EmojiMessageDecorator emojiMessage = new EmojiMessageDecorator(message, ";p");

        // Call the send() method and assert the output
        String expected = "Sending message with emoji: Hello! How is it going? ;p";
        assertEquals(expected, emojiMessage.toString());
    }

    @Test
    public void testBoldMessageDecorator() {
        // Create a BoldMessageDecorator and wrap the original message
        BoldMessageDecorator boldMessage = new BoldMessageDecorator(message);

        // Call the send() method and assert the output
        String expected = "Sending formatted message: <b>Hello! How is it going?</b>";
        assertEquals(expected, boldMessage.toString());
    }
}

