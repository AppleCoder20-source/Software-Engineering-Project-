public class Users implements MessageObserver {
    private String name;
    private MessageApp app;
    String Messages = "";

    //adds users so they can recieve messages from each other
    public Users(String name, MessageApp app) {
        this.name = name;
        this.app = app;
        app.registerObserver(this);
        System.out.println(this.name + " has been added as an observer to the message app.");
    }
    //This code is used to send messages from each other
    public void UserMessage(String receiverName, String message, MessageType messageType) {
        app.sendMessage(name, receiverName, message, messageType);
        System.out.println(name + " sent a " + messageType.toString() + " message to " + receiverName + ": " + message);
    }


    @Override
    //Uses case statements to check for message types from enum , and uses the send and recieve methods
    public void Update() {
        MessageType messageType = app.getMessageType(); //returns an enum value of  the type of message being received .
        String senderName = app.getMessageSender(); //returns name of sender of the message
        String latestMessage = app.getMessage(senderName, name); //retrieves latest messages sent or reiceived by user

        if (!latestMessage.isEmpty()) {
            switch (messageType) {
                case TEXT:
                    if (senderName.equals(name)) {
                        System.out.println("sent a TEXT message to " + name + ": " + latestMessage); //User sends message
                    } else { //Recipicent recieves the messages same for all of them for the various types
                        System.out.println(name + " received a " + messageType + " message from " + senderName + ": " + latestMessage);
                    }
                    break;
                case IMAGE:
                    if (senderName.equals(name)) {
                        System.out.println("sent an IMAGE message to " + name + ": " + latestMessage);
                    } else {
                        System.out.println(name + " received a " + messageType + " message from " + senderName + ": " + latestMessage);

                    }
                    break;
                case VIDEO:
                    if (senderName.equals(name)) {
                        System.out.println(" sent a VIDEO message to " + name + ": " + latestMessage);
                    } else {
                        System.out.println(name + " received a " + messageType + " message from " + senderName + ": " + latestMessage);
                    }
                    break;

                case GIF:
                    if (senderName.equals(name)) {
                        System.out.println(" sent a GIF message to " + name + ": " + latestMessage);
                    } else {
                        System.out.println(name + " received a " + messageType + " message from " + senderName + ": " + latestMessage);
                    }
                    break;
                case RECEIVED:
                    System.out.println(name + "\n" + "received a message from " + senderName + ": " + latestMessage);
                    break;
                default:
                    System.out.println(senderName + " sent an unknown message type to " + name + ".");
            }
        }
    }

    //users can be removed from the app
        public void removeObserver() {
        app.removeObserver(this);
        System.out.println(this.name + " has been removed as an observer from the message app.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //This is used for recieving messages
    public String getMessage(String senderName) {
        if (app == null) {
            return "";
        }
        return app.getMessage(senderName, name);
    }
}