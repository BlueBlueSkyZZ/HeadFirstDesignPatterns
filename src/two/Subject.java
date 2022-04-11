package two;

public interface Subject {

    public void registerObserver(ObserverMy o);

    public void removeObserver(ObserverMy o);

    public void notifyObservers();

}
