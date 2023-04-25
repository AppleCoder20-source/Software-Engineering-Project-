import java.util.ArrayList;
import java.util.List;

public class MessageApp implements Subject {
    // List of observers
    private ArrayList<MessageObserver> observers = new ArrayList<>();
    // Message, sender, receiver, and message type
    private String message;
    private String messageSender;
    private String messageReceiver;
    private MessageType messageType;

    // Register the users for our app
    @Override
    public void registerObserver(MessageObserver observer) {
        this.observers.add(observer);
    }

    // Remove an user from our app
    @Override
    public void removeObserver(MessageObserver observer) {
        this.observers.remove(observer);
    }

    // Notify all  users in the message app
    public void notifyObservers() {
        for (MessageObserver observer : observers) {
            observer.Update();
        }
    }

    // Send a message and notify observers, this is to send all users a message of our application, such as polciy updates
    public void sendMessage(String senderName, String receiverName, String message, MessageType messageType) {
        System.out.println(senderName + " sent a " + messageType + " message to " + receiverName + ": " + message);
        setMessage(message);
        this.messageSender = senderName;
        this.messageReceiver = receiverName;
        this.messageType = messageType;
        notifyObservers();
    }
    public void sendUpdate(String updateMessage) {
        System.out.println("MessageAppService sent an updated message: " + updateMessage);

        // Set the message properties
        setMessage(updateMessage);
        this.messageSender = "MessageAppService";
        this.messageReceiver = "All Users";
        this.messageType = MessageType.Update_MESSAGE;

        // Notify the observers
        notifyObservers();
    }

    // Set the message
    public void setMessage(String message) {
        this.message = message;
    }

    // Get the message sender
    public String getMessageSender() {
        return messageSender;
    }

    // Get the message based on sender and receiver
    public String getMessage(String senderName, String receiverName) {
        if (senderName.equals(this.messageSender) && receiverName.equals(this.messageReceiver)) {
            return this.message;
        } else {
            return "";
        }
    }

    // Get the message type
    public MessageType getMessageType() {
        return messageType;
    }
}