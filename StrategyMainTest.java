import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrategyMainTest {
    @Test
    void directTest() {
        InitialMsg Msg1 = new InitialMsg("#123"); //Instantiate a msg
        MessageStrategy strategyD = new DirectMessage("#U4321"); //Pass in user ID to DirectMessage
        String result = strategyD.setMessage(Msg1.getMsgId()); //Assign output to result
        assertEquals("Message '#123' set to be sent to user '#U4321'\n",result);
    }
    @Test
    void channelTest() {
        InitialMsg Msg2 = new InitialMsg("#456"); //Instantiate a msg
        MessageStrategy strategyD = new ChannelMessage("#C5678"); //Pass in channel ID to ChannelMessage
        String result = strategyD.setMessage(Msg2.getMsgId()); //Assign output to result
        assertEquals("Message '#456' set to be sent to channel '#C5678'\n",result);
    }
    @Test
    void groupTest() {
        InitialMsg Msg3 = new InitialMsg("#689"); //Instantiate a msg
        MessageStrategy strategyD = new GroupMessage("#G1357"); //Pass in group ID to GroupMessage
        String result = strategyD.setMessage(Msg3.getMsgId()); //Assign output to result
        assertEquals("Message '#689' set to be sent to group '#G1357'\n",result);
    }
}