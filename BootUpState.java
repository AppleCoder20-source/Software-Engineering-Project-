public class BootUpState implements SysAction {
    private String prevState;
    public BootUpState(String prevState) { this.prevState = prevState; }
    public BootUpState(){ this.prevState = "BootUpState"; }
    @Override public void execute(){ System.out.println("System is booting up. Please wait a few seconds...\n"); }
    @Override public String toString(){ return "BootUpState";}
}
