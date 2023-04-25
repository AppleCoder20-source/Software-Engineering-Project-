import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DownStateTest {
    @Test
    void terminatedcorrectly() {
        // the following should return true as the previous state is ReadyState
        // which indicates that the system terminated as intended.
        DownState downState = new DownState("ReadyState");
        assertEquals(true, downState.RegularTermination());
    }
    @Test
    void terminatedicorrectly() {
        // Now the following should return false as the previous state is BootUpState
        // which indicates that the system terminated irregularly.
        DownState downState = new DownState("BootUpState");
        assertEquals(true, downState.RegularTermination());
        // we can also check this simply by the following:
        // assertEquals(false,downState.RegularTermination());
    }
}