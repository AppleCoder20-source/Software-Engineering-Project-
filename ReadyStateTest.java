import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ReadyStateTest {
    @Test
    void checkMoreTotal() {
        ReadyState readyState= new ReadyState("BootUpState");
        // if the totalUsers >= usersOnline, the method should work just fine as
        // subtracting a smaller number from a bigger is always be positive
        // and this is the case we would are usually always considering
        assertTrue(readyState.NumberOfInactiveUsers(40,50)==10);
    }
    @Test
    void checkMoreOnline() {
        ReadyState readyState= new ReadyState("BootUpState");
        // however, in case the method gets a larger usersOnline than totalUsers,
        // the method should return -1 which will signify to the software engineer
        // that something is wrong. We expect -50 arithmetically, but want to see
        // that the method returns -1 as intended.
        assertTrue(readyState.NumberOfInactiveUsers(100,50)==-50);
        //the test does infact yield false as we get -1 and not -50 as we intended.
    }
}