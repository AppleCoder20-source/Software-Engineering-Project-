import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MessageAppTest {
    @Test
    public static void TestSendMessage() {
      MessageApp  messageApp = new MessageApp();
      Users user1 = new Users("John", messageApp);
      Users user2 = new Users("Mary", messageApp);
      Users user3 = new Users("Tom", messageApp);
      //uses MessageApp instacnce so it sends a message to all users, and uses UPDATE Which uses notifyObserver Method
      messageApp.sendMessage("MessageAppService", "All Users", "New policy available!", MessageType.Update_MESSAGE);
      //checks different send messages a user can send, such as text, images, and gifs
      user1.UserMessage("Mary", "Hello Mary, how are you?", MessageType.TEXT);
      String expectedMessage1 = "Hello Mary, how are you?";
      String actualMessage1 = user2.getMessage("John");
      assertEquals(expectedMessage1, actualMessage1);

      user2.UserMessage("John", "I'm doing well, thanks.", MessageType.VIDEO);
      String expectedMessage3 = "I'm doing well, thanks.";
      String actualMessage3 = user1.getMessage("Mary");
      assertEquals(expectedMessage3, actualMessage3);
}

    @Test
    public void testRemoveObserver() {
        MessageApp messageApp = new MessageApp();
        Users user1 = new Users("John", messageApp);
        Users user2 = new Users("Mary", messageApp);
        Users user3 = new Users("Tom", messageApp);

        user2.UserMessage("John", "Hi John, what are you up to?", MessageType.TEXT);
        user1.UserMessage("Mary", "Hello Mary, how are you?", MessageType.TEXT);

        user1.removeObserver();

        // Check that user1 does not receive any messages after being removed as an observer
        String expectedMessage = "";
        String actualMessage = user1.getMessage("Mary");
        assertEquals(expectedMessage, actualMessage);


        //check to see if john can still send msgs in this case he cant

        user3.UserMessage("John", "Hi John, what are you up to?", MessageType.TEXT);
        user1.UserMessage("Mary", "Hello Mary, how are you?", MessageType.TEXT);


        // John wont recieve any of Toms messages since he is removed as observer
        String expectedMessage5 = "";
        String actualMessage5 = user1.getMessage("Tom");
        assertEquals(expectedMessage5, actualMessage5);





    }
}
