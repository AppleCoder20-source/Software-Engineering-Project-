// Concrete decorator
class EmojiMessageDecorator implements MessageDecorator {
    private Message message;
    private String emoji;

    public EmojiMessageDecorator(Message message, String emoji) {
        this.message = message;
        this.emoji = emoji;
    }

    @Override
    public void send() {
        String textWithEmoji = message.toString() + " " + emoji;
        System.out.println("Sending message with emoji: " + textWithEmoji);
    }

    @Override
    public String toString() {
        return message.toString() + " " + emoji;
    }
}
