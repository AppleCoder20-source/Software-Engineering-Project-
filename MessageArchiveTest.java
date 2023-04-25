import org.junit.jupiter.api.Assertions;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MessageArchiveTest {

    @org.junit.jupiter.api.Test
    void getAllMessages() {
        MessageArchive messageArchive = MessageArchive.getInstance();
        String message = "What are your plans for the weekend";
        String reply = "I'm working on my group project for CS 370";

        messageArchive.addMessage(message);
        messageArchive.addMessage(reply);

        List<String> messages = messageArchive.getAllMessages();

        Assertions.assertEquals(2, messages.size());
        Assertions.assertEquals(message + "\n", messages.get(0));
        Assertions.assertEquals(reply + "\n", messages.get(1));
    }

    @org.junit.jupiter.api.Test
    void searchMessage() {
        MessageArchive messageArchive = MessageArchive.getInstance();
        String message = "What are your plans for the weekend";
        String reply = "I'm working on my group project for CS 370";

        messageArchive.addMessage(message);
        messageArchive.addMessage(reply);

        List<String> matchingMessages = messageArchive.searchMessage("weekend");

        Assertions.assertEquals(1, matchingMessages.size());
        Assertions.assertEquals(message + "\n", matchingMessages.get(0));
    }
}