import java.util.ArrayList;
import java.util.List;

public class MessageArchive {
    //Variable will hold a reference to the single instance of the 'MessageArchive' class
    private static MessageArchive instance;
    //This variable is a list of strings that will hold the messages stored in the message archive
    private List<String> messages;

    // Initializes the 'messages' list with a new 'ArrayList' object
    public MessageArchive()
    {
        messages = new ArrayList<>();
    }

    /*Method returns the singleton instance of the 'MessageArchive class'.
      If the instance is null, the method creates a new instance of the
      'MessageArchive' class and then returns it.*/
    public static MessageArchive getInstance()
    {
        if (instance == null)
            instance = new MessageArchive();
        return instance;
    }

    //Adds a new message to the 'messages' list
    public void addMessage(String message)
    {
        messages.add(message + "\n");
    }

    //Return a copy of the 'messages' list
    public List<String> getAllMessages()
    {
        return messages;
    }

    //Return messages based off certain keywords inputted by the user
    public List<String> searchMessage(String keyword){
        List<String> matchingMessages = new ArrayList<>();
            for(String message : messages) {
                if(message.contains(keyword))
                {
                    matchingMessages.add(message);
                }
            }
        return matchingMessages;
    }
}
