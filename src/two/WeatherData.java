package two;

import java.util.ArrayList;


public class WeatherData implements Subject {

    private ArrayList<ObserverMy> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<ObserverMy>();
    }

    @Override
    public void registerObserver(ObserverMy o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserverMy o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (ObserverMy observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
