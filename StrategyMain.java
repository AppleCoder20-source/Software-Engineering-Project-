import java.util.Scanner;

public class StrategyMain {
    //A function to prompt user for how they want to send a message
    static void prompt(InitialMsg message){
        //Using scanner to prompt user for message destination
        System.out.println("How do you want to send message "+ message.getMsgId()+"?");
        System.out.println("[Direct][Group][Channel]");

        Scanner input = new Scanner(System.in);// Read user input
        String method = input.nextLine().toLowerCase();
        //Set destination based on user response
        switch (method) {
            //For each case, instantiate a strategy and execute it
            case "direct" -> {
                MessageStrategy strategyD = new DirectMessage("#U1234");
                strategyD.setMessage(message.getMsgId()); //setMessage prints if valid
            }
            case "group" -> {
                MessageStrategy strategyG = new GroupMessage("#G6341");
                strategyG.setMessage(message.getMsgId());
            }
            case "channel" -> {
                MessageStrategy strategyC = new ChannelMessage("#C3421");
                strategyC.setMessage(message.getMsgId());
            }
            default -> System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        //Simplified instantiations of messages for demo
        InitialMsg firstMsg = new InitialMsg("#111");
        InitialMsg secondMsg = new InitialMsg("#222");
        InitialMsg thirdMsg = new InitialMsg("#333");

        //Run a prompt for desired message destination
        prompt(firstMsg);
        prompt(secondMsg);
        prompt(thirdMsg);

    }
}