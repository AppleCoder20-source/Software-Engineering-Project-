public class GroupMessage implements MessageStrategy {
    private final String groupId;

    public GroupMessage(String groupId) {   //Pass in group id during instantiation
        this.groupId = groupId;
    }
    @Override
    public String setMessage(String messageId) {
        String result="Message '"+messageId+"' set to be sent to group '"+groupId+"'\n";
        System.out.println(result);
        return result;
    }   //Print message destination
}