//Defining the Message interface with a send method and a toString method
public interface Message {
    void send();
    //toString method was implemented in order to have a universal way of knowing which type is which when other components/patterns need to know
    String toString();
}
