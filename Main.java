import java.util.Scanner;
import java.util.List;

public class Main {
    //A function to prompt user for how they want to send a message
    static void prompt(InitialMsg message){
        //Using scanner to prompt user for message destination
        System.out.println("How do you want to send message "+ message.getMsgId()+"?");
        System.out.println("[Direct][Group][Channel]");

        Scanner input = new Scanner(System.in);// Read user input
        String method = input.nextLine().toLowerCase();
        //Set destination based on user response
        switch (method) {
            //For each case, instantiate a strategy and execute it
            case "direct" -> {
                MessageStrategy strategyD = new DirectMessage("#U1234");
                strategyD.setMessage(message.getMsgId()); //setMessage prints if valid
            }
            case "group" -> {
                MessageStrategy strategyG = new GroupMessage("#G6341");
                strategyG.setMessage(message.getMsgId());
            }
            case "channel" -> {
                MessageStrategy strategyC = new ChannelMessage("#C3421");
                strategyC.setMessage(message.getMsgId());
            }
            default -> System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        Sys sys = new Sys();
        sys.exe();
        sys.setSysAction(new ReadyState("BootUpState"));
        sys.exe();
        //everyone elses main code happens how as we are in the ready state



        //Simplified instantiations of messages for demo
        InitialMsg firstMsg = new InitialMsg("#111");
        InitialMsg secondMsg = new InitialMsg("#222");
        InitialMsg thirdMsg = new InitialMsg("#333");

        //Run a prompt for desired message destination
        prompt(firstMsg);
        prompt(secondMsg);
        prompt(thirdMsg);





        // Factory creates and sends Text
        Message textMessage = MessageFactory.createMessage(MessageType.TEXT);
        textMessage.send();
        // Factory creates and sends Video
        Message videoMessage = MessageFactory.createMessage(MessageType.VIDEO);
        videoMessage.send();
        // Factory creates and sends Image
        Message imageMessage = MessageFactory.createMessage(MessageType.IMAGE);
        imageMessage.send();
        // Factory creates and sends Audio
        Message audioMessage = MessageFactory.createMessage(MessageType.AUDIO);
        audioMessage.send();
        // Factory creates and sends File
        Message fileMessage = MessageFactory.createMessage(MessageType.FILE);
        fileMessage.send();
        // Factory creates and sends GIF
        Message gifMessage = MessageFactory.createMessage(MessageType.GIF);
        gifMessage.send();





        //Get the singleton instance of the MessageArchive class
        MessageArchive archive = MessageArchive.getInstance();

        //Add some messages to the archive
        archive.addMessage("Hey, what's up?");
        archive.addMessage("Not much, just hanging out. How about you?");
        archive.addMessage("Just got back from a run. Feeling pretty good!");
        archive.addMessage("That's awesome! I need to start exercising more.");
        archive.addMessage("Yeah, it's tough to find the time sometimes. But it's worth it.");
        archive.addMessage("Definitely. So, did you hear about the new restaurant that opened up downtown?");
        archive.addMessage("It's a Vietnamese place. Really good pho and banh mi sandwiches.");
        archive.addMessage("Oh, I love Vietnamese food! We should go there sometime.");
        archive.addMessage("Definitely!");

        //Retrieve all messages from the archive
        List<String> allMessages = archive.getAllMessages();
        System.out.println("All messages: \n" + allMessages);

        //Search for messages containing a specific word
        List<String> matchingMessages = archive.searchMessage("Vietnamese");
        System.out.println("Matching messages: \n" + matchingMessages);



        Message message = new TextMessageDecorator("Hello! How is it going?", "Sophia");
        message.send(); //Sending text message to Sophia: Hello! How is it going?

        Message emojiMessage = new EmojiMessageDecorator(message, ";p");
        emojiMessage.send(); //Sending message with emoji: Hello! How is it going? ;p

        Message boldMessage = new BoldMessageDecorator(message);
        boldMessage.send(); //Sending message with bold text: <b>Hello! How is it going?</b>










        MessageApp  messageApp = new MessageApp();
        Users user1 = new Users("John", messageApp);
        Users user2 = new Users("Mary", messageApp);
        Users user3 = new Users("Tom", messageApp);
        //uses MessageApp instacnce so it sends a message to all users, and uses UPDATE Which uses notifyObserver Method
        messageApp.sendMessage("MessageAppService", "All Users", "New policy available!", MessageType.Update_MESSAGE);
        //checks different send messages a user can send, such as text, images, and gifs
        user1.UserMessage("Mary", "Hello Mary, how are you?", MessageType.TEXT);
        user2.UserMessage("John", "I'm doing well, thanks.", MessageType.VIDEO);
        user2.UserMessage("John", "Hi John, what are you up to?", MessageType.TEXT);
        user1.UserMessage("Mary", "Hello Mary, how are you?", MessageType.TEXT);
        user1.removeObserver();
        user3.UserMessage("John", "Hi John, what are you up to?", MessageType.TEXT);
        user1.UserMessage("Mary", "Hello Mary, how are you?", MessageType.TEXT);




        //this should now run at the end of the program:
        sys.setSysAction(new DownState("ReadyState"));
        sys.exe();
    }

}
