public class Sys {
    protected SysAction sysAction = new BootUpState();
    public void setSysAction(SysAction sysAction) { this.sysAction = sysAction; }
    public void exe(){ sysAction.execute(); }
}
