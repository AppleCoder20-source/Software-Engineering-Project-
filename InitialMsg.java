public class InitialMsg {

    //For simplicity, using an id to represent a message early in the software process
    private final String messageId;
    public InitialMsg(String messageId) {   //Pass in message id during instantiation
        this.messageId=messageId;
    }
    public String getMsgId() {  //Allows access after instantiation
        return messageId;
    }
}
