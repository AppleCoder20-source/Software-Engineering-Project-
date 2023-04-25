public interface Subject {
    void registerObserver(MessageObserver observer);
    void removeObserver(MessageObserver observer);
    void notifyObservers();
}
