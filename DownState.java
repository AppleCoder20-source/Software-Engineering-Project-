public class DownState implements SysAction {
    private String prevState;
    public DownState(String prevState) { this.prevState = prevState; }
    @Override public void execute(){ System.out.println("System is now down\n"); }
    @Override public String toString(){ return "DownState";}

    // we want to see if the system ever goes down NOT from regular termination.
    // i.e. we want to check if the previous state was BootUpState and not Readystate as expected.
    // in which case we'll conclude irregular termination of the system/server occured
    public Boolean RegularTermination(){
        if (prevState.equals("ReadyState")) {
            System.out.println("System terminated normally");
            return true;
        }
        else {
            System.out.println("System terminated irregurlarly");
            return false;
        }
    }





}