// Concrete component
class TextMessageDecorator implements Message{
    private String text;
    private String recipient;

    public TextMessageDecorator(String text, String recipient){
        this.text = text;
        this.recipient = recipient;
    }

    @Override
    public void send() {
        System.out.println("Sending text message to " + recipient + ": " + text);
    }

    @Override
    public String toString() {
        return text;
    }
}

