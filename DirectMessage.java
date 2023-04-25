public class DirectMessage implements MessageStrategy {
    private final String userId;

    public DirectMessage(String userId) {   //Pass in user id during instantiation
        this.userId = userId;
    }
    @Override
    public String setMessage(String messageId) {
        String result="Message '"+messageId+"' set to be sent to user '"+userId+"'\n";
        System.out.println(result);
        return result;
    }   //Print message destination
}
