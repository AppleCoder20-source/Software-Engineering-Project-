// Concrete decorator
class BoldMessageDecorator implements MessageDecorator {
    private Message message;

    public BoldMessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public void send() {
        String boldText = "<b>" + message.toString() + "</b>";
        System.out.println("Sending message with bold text: " + boldText);
    }

    @Override
    public String toString() {
        return "<b>" + message.toString() + "</b>";
    }
}