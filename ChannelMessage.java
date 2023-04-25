public class ChannelMessage implements MessageStrategy {
    private final String channelId;

    public ChannelMessage(String channelId) { //Pass in channel id during instantiation
        this.channelId = channelId;
    }
    @Override
    public String setMessage(String messageId) {
        String result="Message '"+messageId+"' set to be sent to channel '"+channelId+"'\n";
        System.out.println(result);
        return result;
    }   //Return and Print message destination
}
