import org.w3c.dom.ls.LSOutput;
public class ReadyState implements SysAction {
    private String prevState;
    public ReadyState(String prevState) { this.prevState = prevState; }
    @Override public void execute(){ System.out.println("System is now up and running\n"); }
    @Override public String toString(){ return "ReadyState";}
    public int NumberOfInactiveUsers(int onlineUsers, int totalUsers){
        // we want to make sure that the number of onineUsers does not
        // exceed the number of totalUsers as if that is the case, then
        // something is wrong. More on this is elaborated on in the Unit Test.
        if (onlineUsers > totalUsers) return -1;
        else return totalUsers - onlineUsers;
    }
}